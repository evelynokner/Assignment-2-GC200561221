package ca.georgiancollege.assignment2;

public class Painter extends Weapon {
    //rollers & brushes - 10/68 total
    private int inkSpeed, handling;

    public int getInkSpeed() {
        return inkSpeed;
    }

    public void setInkSpeed(int inkSpeed) {
        this.inkSpeed = inkSpeed;
    }

    public int getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }
}
