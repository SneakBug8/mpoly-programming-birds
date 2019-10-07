package app;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.Set(50, 50, 50, new Color(155, 155, 155));

        Macaw m = new Macaw();
        m.Set(25, 25, 25, new Color(0, 255, 0));

        Penguin p = new Penguin();
        p.Set(75, 75, 75, new Color(0, 0, 255));

        Flock flock = new Flock();
        flock.add(b);
        flock.add(m);
        flock.add(p);

        MainWindow window = new MainWindow(flock);
    }
}