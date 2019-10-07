package app;

import java.awt.*;

public class BirdsRenderer {
    private Flock flock;

    public BirdsRenderer(Flock flock) {
        this.flock = flock;
    }

    public void Render(Graphics g) {
        g.setColor(new Color(255, 0, 0));

        for (Bird b : this.flock.Birds) {
            this.Render(g, b);
        }
    }

    public void Render(Graphics g, Bird b) {
        if (b.color != null) {
            g.setColor(b.color);
        }

        g.drawOval(b.x + 5, b.y + 25, b.size, b.size);
    }
}