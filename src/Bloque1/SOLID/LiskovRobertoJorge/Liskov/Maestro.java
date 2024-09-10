package Bloque1.SOLID.LiskovRobertoJorge.Liskov;

public class Maestro extends Persona {

    private String materia;

    public Maestro(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }

    @Override
    public void realizarExamen() {
        UnsupportedOperationException ex = new UnsupportedOperationException("Los maestros no realizan exámenes");
        System.out.println(ex.getMessage());
    }
}
