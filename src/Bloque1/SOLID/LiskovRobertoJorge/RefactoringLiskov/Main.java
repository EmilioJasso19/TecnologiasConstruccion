package Bloque1.SOLID.LiskovRobertoJorge.RefactoringLiskov;

public class Main {

    public static void main(String[] args) {

        Persona alumno = new Alumno("Alexis", 10);
        Persona maestro = new Maestro("Mag", "Tecnologias");

        alumno.mostrarInfo();
        maestro.mostrarInfo();

        Alumno alumno1 = (Alumno) alumno;
        alumno1.realizarExamen();
    }
}
