package app;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Macaw m = new Macaw();
        m.Set(25, 25, 25, new Color(255, 0, 0));
        Macaw m1 = new Macaw();
        m1.Set(25, 25, 30, new Color(255, 0, 0));

        Penguin p = new Penguin();
        p.Set(75, 75, 75, new Color(0, 0, 255));
        Penguin p2 = new Penguin();
        p2.Set(75, 75, 80, new Color(0, 0, 255));


        Sparrow s = new Sparrow();
        s.Set(100,100,50, new Color(100,100,100));

        Flock flock = new Flock();
        flock.add(m);
        flock.add(p);
        flock.add(s);
        flock.add(m1);
        flock.add(p2);

        MainWindow window = new MainWindow(flock);
    }
}