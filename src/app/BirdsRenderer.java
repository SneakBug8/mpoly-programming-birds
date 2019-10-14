package app;

import java.awt.*;

public class BirdsRenderer {
    private Flock flock;

    public BirdsRenderer(Flock flock) {
        this.flock = flock;
    }

    public void Render(Graphics g) {
        g.setColor(new Color(255, 0, 0));

        this.flock.Repose();

        for (Bird b : this.flock.Birds) {
            this.Render(g, b);
        }

        DrawRectangles(g, this.flock);
    }

    public void Render(Graphics g, Bird b) {
        if (b.color != null) {
            g.setColor(b.color);
        }

        b.Render(g, b.x + 5, b.y + 25);
    }

    public void DrawRectangles(Graphics g, Flock f) {
        DrawRecrangle(g, f, new Color(0, 0, 255), Penguin.class);
        DrawRecrangle(g, f, new Color(255, 0, 0), Macaw.class);
        DrawRecrangle(g, f, new Color(100, 100, 100), Sparrow.class);
    }

    <T extends Bird> void DrawRecrangle(Graphics g, Flock f, Color c, Class<T> erasure) {
        g.setColor(c);

        int px = Config.WindowX;
        int py = Config.WindowY;
        int pbx = -Config.WindowX;
        int pby = -Config.WindowY;

        for (Bird j : f.Birds) {
            if (erasure.isInstance(j)) {
            System.out.println(j.getLeft() + " " + j.getTop() + " " + j.getRight() + " " + j.getBottom());
                if (j.getLeft() < px) {
                    px = j.getLeft();
                }
                if (j.getRight() > pbx) {
                    pbx = j.getRight();
                }
                if (j.getTop() < py) {
                    py = j.getTop();
                }
                if (j.getBottom() > pby) {
                    pby = j.getBottom();
                }
            }
        }

        System.out.println(erasure.getName() + " " + px + " " + py + " " + pbx + " " + pby);
        g.drawRect(px, py, pbx - px, pby - py);
    }
}