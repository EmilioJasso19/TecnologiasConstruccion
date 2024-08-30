package Bloque1.HenrySebas;

public abstract class Character {

    private String nombre;
    private int health;
    private int level;

    public Character(String nombre, int health, int level) {
        this.nombre = nombre;
        this.health = health;
        this.level = level;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void showStatusCharacter() {
        System.out.println(getNombre() + " tiene " + getHealth() + " puntos de vida y es nivel: " + getLevel());
    }

    public abstract void attack(Character enemy);

    public abstract void heal();

    public abstract void useSpecialAbility(Character enemy);
}
