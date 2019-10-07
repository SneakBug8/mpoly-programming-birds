package app;

import java.util.ArrayList;

public class Flock {
    protected ArrayList<Bird> Birds;

    public Flock() {
        this.Birds = new ArrayList<Bird>();
    }

    public void add(Bird b) {
        this.Birds.add(b);
    }

    public void fly() {
        for (Bird b : this.Birds) {
            b.fly();
        }
    }
}