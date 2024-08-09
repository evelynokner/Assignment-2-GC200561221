package ca.georgiancollege.assignment2;

public class Weapon {
    private String name, image, type, special;
    private double matchmakingRange;
    private int specialPoints, range;
        //inkSpeed, damage, chargeSpeed, //parameter1
        //handling, fireRate, mobility; //parameter2

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getType() {
        return type;
    }

    public String getSpecial() {
        return special;
    }

    public double getMatchmakingRange() {
        return matchmakingRange;
    }

    public int getSpecialPoints() {
        return specialPoints;
    }

    public int getRange() {
        return range;
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
