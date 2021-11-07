public class Simulation {
    public static void main(String[] args) {
        TemplateClass example1 = new SubClass1();
        TemplateClass example2 = new SubClass2();

        System.out.println("example1");
        example1.templateMethod();

        System.out.println();

        System.out.println("example2");
        example2.templateMethod();

    }

}
