package ca.georgiancollege.assignment2;

public class WeaponData {
    private static Weapon weapon = null;

    public static Weapon getWeapon() {
        return weapon;
    }

    public static void setWeapon(Weapon weapon) {
        WeaponData.weapon = weapon;
    }
}
