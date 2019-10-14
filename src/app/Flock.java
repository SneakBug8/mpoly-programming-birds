package app;

import java.util.ArrayList;
import java.util.Random;
import java.awt.*;

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

    ArrayList<Bird> posedBirds = new ArrayList<Bird>();

    public void Repose() {
        for (Bird b : Birds) {
            int x = 0;
            int y = 0;

            outerloop: while (true) {
                x = -Config.WindowX / 3 + new Random().nextInt(Math.round(Config.WindowX / 1.5f));
                y = -Config.WindowY / 3 + new Random().nextInt(Math.round(Config.WindowY / 1.5f));

                b.Set(x, y);

                Rectangle rectangle = new Rectangle(b.getLeft(), b.getTop(), b.size, b.size);

                for (Bird d : posedBirds) {
                    if (rectangle.contains(d.x, d.y) || rectangle.contains(d.getRight(), d.y)
                            || rectangle.contains(d.getLeft(), d.y) || rectangle.contains(d.x, d.getTop())
                            || rectangle.contains(d.x, d.getBottom())) {
                        continue outerloop;
                    }
                }

                posedBirds.add(b);
                break outerloop;
            }

        }
    }
}