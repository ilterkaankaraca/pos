package bankaccount;

public class DepositCommand implements Command {
    private BankAccount bankAccount;
    private double amount;
    

    public DepositCommand(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;

    }

    @Override
    public void execute() {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
        } else {
            System.out.println("Depositing " + amount);
            this.bankAccount.setBalance(this.bankAccount.getBalance() + amount);
            System.out.println("New balance is " + this.bankAccount.getBalance());
        }
    }

    @Override
    public void undo() {
        System.out.println("Undo deposit");

    }

}
