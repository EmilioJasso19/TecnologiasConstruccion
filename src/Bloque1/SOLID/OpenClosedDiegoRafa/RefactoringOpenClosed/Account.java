package Bloque1.SOLID.OpenClosedDiegoRafa.RefactoringOpenClosed;

public abstract class Account {

    protected double balance;
    protected String name;
    protected String accountType;

    public Account(double balance, String name, String accountType) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    }

    public abstract double getBalance();
}

