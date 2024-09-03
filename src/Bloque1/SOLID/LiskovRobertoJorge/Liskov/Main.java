package Bloque1.SOLID.RobertoJorge.Liskov;

public class Main {

    public static void realizarActividades(Persona persona) {
        persona.realizarExamen();
    }

    public static void main(String[] args) {
        Persona alumno = new Alumno("Emilio", 7);
        Persona maestro = new Maestro("Mag", "Tecnologias");

        alumno.realizarExamen();
        maestro.realizarExamen();
    }
}
