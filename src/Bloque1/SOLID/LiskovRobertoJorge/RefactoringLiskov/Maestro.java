package Bloque1.SOLID.LiskovRobertoJorge.RefactoringLiskov;

public class Maestro extends Persona {
    private String materia;

    public Maestro(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }
}
