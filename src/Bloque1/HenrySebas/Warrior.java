package Bloque1.HenrySebas;

public class Warrior extends Character {

    private String weapon;

    public Warrior(String nombre, int health, int level, String weapon) {
        super(nombre, health, level);
        this.weapon = weapon;
    }

    public void upgradeWeapon() {
        System.out.println("El guerrero " + getNombre() + " ha mejorado su " + this.weapon);
        int level = getLevel();
        setLevel(++level);
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("El guerrero " + getNombre() + " ataca a " + enemy.getNombre());
        int damage = (int) (Math.random() * 20) + 1;
        int healthEnemy = enemy.getHealth();
        enemy.setHealth(healthEnemy - damage);
    }

    @Override
    public void heal() {
        int healing = (int) (Math.random() * 15) + 1;
        int health = getHealth();
        System.out.println(getNombre() + " ha regenerado " + healing + " puntos de vida");
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        System.out.println("El guerrero " + getNombre() + " ataca a " + enemy.getNombre() + " con su super");
        int enemyHealth = enemy.getHealth();
        int damage = (int) (Math.random() * 45) + 1;
    }
}
