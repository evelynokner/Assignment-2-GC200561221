package ca.georgiancollege.assignment2;

public class Shooter extends Weapon {
    //shooters, dualies, blasters - 40/68 total
    private int damage, fireRate;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }
}
