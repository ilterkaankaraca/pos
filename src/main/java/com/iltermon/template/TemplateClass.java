public abstract class TemplateClass {
    // abstract class to keep the template
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        if (doPrimitiveOperation3()) {
            primitiveOperation3();
        }
        concreteOperation();
    }

    public boolean doPrimitiveOperation3() { // subclasses can override this but dont have to. 
        return true;                         // if they dont override it, it will return true and primitiveOperation3 will be called
    }

    final void concreteOperation() {
        System.out.println("TemplateClass.concreteOperation()"); //This function should not be overridden so it is final
    }

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public abstract void primitiveOperation3(); // this is optinal
}