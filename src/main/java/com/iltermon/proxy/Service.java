public class Service implements ServiceInterface{

    String data;
    public Service(String data){
        this.data = data;
    }
    @Override
    public void operation() {
        System.out.println("Service.operation()");

    }

    @Override
    public String getString() {
        return data;
    }
    
}
