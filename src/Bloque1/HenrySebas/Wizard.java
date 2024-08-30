package Bloque1.HenrySebas;

public class Wizard extends Character {

    private String spell;

    public Wizard(String nombre, int health, int level, String spell) {
        super(nombre, health, level);
        this.spell = spell;
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("El guerrero " + getNombre() + " ataca a " + enemy.getNombre());
        int damage = (int) (Math.random() * 25) + 1;
        int healthEnemy = enemy.getHealth();
        enemy.setHealth(healthEnemy - damage);
    }

    @Override
    public void heal() {
        int healing = (int) (Math.random() * 25) + 1;
        int health = getHealth();
        System.out.println(getNombre() + " ha regenerado " + healing + " puntos de vida");
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        System.out.println("El mago " + getNombre() + " ataca a " + enemy.getNombre() + " con su super");
        int enemyHealth = enemy.getHealth();
        int damage = (int) (Math.random() * 40) + 1;
    }
}
