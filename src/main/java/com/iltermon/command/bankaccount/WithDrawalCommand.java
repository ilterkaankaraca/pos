package bankaccount;
public class WithDrawalCommand implements Command {
    private BankAccount bankAccount;
    private double amount;
    private boolean executable;
    private boolean undoable;
    public WithDrawalCommand(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.executable = true;
        this.undoable = false;
    }
    @Override
    public void execute() {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
        } else if (bankAccount.getBalance() < amount) {
            System.out.println("Not enough money");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Withdrawal successful");
            System.out.println("New balance: " + bankAccount.getBalance());
            this.executable = false;
        }
    }

    @Override
    public void undo() {
        System.out.println("Undo with drawal");
    }
}
