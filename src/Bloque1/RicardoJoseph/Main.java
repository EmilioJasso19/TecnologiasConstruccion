package Bloque1.RicardoJoseph;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escoge una opción: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Saliendo");
                break;
            }

            System.out.println("ingrese un numero: ");
            int num1 = sc.nextInt();
            System.out.println("ingrese otro numero: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    calculator.setOperation(new BasicOperations.Addition()); break;
                case 2:
                    calculator.setOperation(new BasicOperations.Subtract()); break;
                case 3:
                    calculator.setOperation(new BasicOperations.Multiply()); break;
                case 4:
                    calculator.setOperation(new BasicOperations.Divide()); break;
                default:
                    System.out.println("Opcion invalida");
            }
            double result = calculator.calculate(num1, num2);
            System.out.println("El resultado es: " + result);
        }
    }
}
