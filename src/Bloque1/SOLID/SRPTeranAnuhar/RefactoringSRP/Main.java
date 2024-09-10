package Bloque1.SOLID.SRPTeranAnuhar.RefactoringSRP;

import Bloque1.SOLID.SRPTeranAnuhar.SRP.UserManager;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.registerUser("Emilio", "tamobarcita123");
        userManager.registerUser("Andrés", "hola132");

        Authenticator authenticator = new Authenticator();

    }
}
