package duck;
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck hisDuck = new HisDuck();

        hisDuck.display();
        hisDuck.performFly();
        hisDuck.performQuack();
        hisDuck.swim();
    }
}
