package app;

import java.awt.*;

class Bird {
    public int x;
    public int y;
    public Color color = null;
    public int size;

    public String name;

    public static void fly() {
        System.out.println("Я лечу!");
    }

    public final void Set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final void Set(int x, int y, int size) {
        this.size = size;
        this.Set(x, y);
    }

    public final void Set(int x, int y, int size, Color color) {
        this.color = color;
        this.Set(x, y, size);
    }

    public final void Set(int x, int y, Color color) {
        this.color = color;
        this.Set(x, y);
    }

    public void Render(Graphics g, int x, int y) {
        g.drawOval(getLeft(), getTop(), size, size);
    }

    public int getLeft() {
        return x - size / 2;
    }

    public int getRight() {
        return x + size / 2;
    }

    public int getTop() {
        return y - size / 2;
    }

    public int getBottom() {
        return y + size / 2;
    }
}