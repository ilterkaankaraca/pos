package com.iltermon.command.bankaccount;
public class WithDrawalCommand implements Command {
    private BankAccount bankAccount;
    private double amount;

    public WithDrawalCommand(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;

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

        }
    }

    @Override
    public void undo() {
        System.out.println("Undo with drawal");
    }
}
