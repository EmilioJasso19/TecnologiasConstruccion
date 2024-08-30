package Bloque1.HenrySebas;

public class Main {

    public static void main(String[] args) {

        Character guerrero = new Warrior("Mag", 100, 3, "Palmada Aria");
        Character mago = new Wizard("Merlin", 80, 7, "Bolita de fuego");

        Warrior guerrero1 = (Warrior) guerrero;

        guerrero.showStatusCharacter();
        mago.showStatusCharacter();

        guerrero1.upgradeWeapon();
        guerrero.showStatusCharacter();
        guerrero.attack(mago);
        mago.showStatusCharacter();
    }
}
