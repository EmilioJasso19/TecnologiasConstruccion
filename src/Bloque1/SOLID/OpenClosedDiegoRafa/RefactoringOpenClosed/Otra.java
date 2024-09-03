package Bloque1.SOLID.DiegoRafa.RefactoringOpenClosed;

import Bloque1.SOLID.DiegoRafa.RefactoringOpenClosed.Account;

public class Otra extends Account {

    public Otra(double balance, String name, String accountType) {
        super(balance, name, accountType);
    }

    @Override
    public double getBalance() {
        return balance * 0.15;
    }
}
