package ca.georgiancollege.assignment2;

public class Weapon {
    private String name, special;
    private double matchmakingRange;
    private int specialPoints, range;
            //inkSpeed, damage, impact, chargeSpeed, //parameter1
            //handling, fireRate, mobility, durability; //parameter2


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public double getMatchmakingRange() {
        return matchmakingRange;
    }

    public void setMatchmakingRange(double matchmakingRange) {
        this.matchmakingRange = matchmakingRange;
    }

    public int getSpecialPoints() {
        return specialPoints;
    }

    public void setSpecialPoints(int specialPoints) {
        this.specialPoints = specialPoints;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
