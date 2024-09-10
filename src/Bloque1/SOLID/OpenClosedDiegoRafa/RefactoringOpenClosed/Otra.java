package Bloque1.SOLID.OpenClosedDiegoRafa.RefactoringOpenClosed;

public class Otra extends Account {

    public Otra(double balance, String name, String accountType) {
        super(balance, name, accountType);
    }

    @Override
    public double getBalance() {
        return balance * 0.15;
    }
}
