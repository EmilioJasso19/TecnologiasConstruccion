package Bloque1.SOLID.OpenClosedDiegoRafa;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(100, "Emilio", "current");
        System.out.println(account.CalculateInterest());
    }
}
