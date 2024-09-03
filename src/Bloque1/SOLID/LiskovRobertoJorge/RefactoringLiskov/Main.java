package Bloque1.SOLID.RobertoJorge.RefactoringLiskov;

public class Main {

    public static void main(String[] args) {

        Persona alumno = new Alumno("Alexis", 10);
        Maestro maestro = new Maestro("Mag", "Tecnologias");

        alumno.mostrarInfo();
        maestro.mostrarInfo();

        Alumno alumno1 = (Alumno) alumno;
        alumno1.realizarExamen();
    }
}
