package bankaccount;
public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Command deposit = new DepositCommand(account,500.0);
        Command withdrawal = new WithDrawalCommand(account,500.0);

        deposit.execute();
        withdrawal.execute();
    }
}