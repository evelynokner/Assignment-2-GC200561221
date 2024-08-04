package ca.georgiancollege.assignment2;

public class Weapon {
    private String name, type, special;
    private double matchmakingRange;
    private int specialPoints, range;
        //inkSpeed, damage, chargeSpeed, //parameter1
        //handling, fireRate, mobility; //parameter2

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", special='" + special + '\'' +
                ", matchmakingRange=" + matchmakingRange +
                ", specialPoints=" + specialPoints +
                ", range=" + range +
                '}';
    }
}
