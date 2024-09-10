package Bloque1.SOLID.OpenClosedDiegoRafa.RefactoringOpenClosed;

public class SavingAccount extends Account {
    public SavingAccount(double balance, String name, String accountType) {
        super(balance, name, accountType);
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
