package app;

import java.awt.*;

class Bird {
    public int x;
    public int y;
    public Color color = null;
    public int size;

    public static void fly() {
        System.out.println("Я лечу!");
    }

    public final void Set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final void Set(int x, int y, int size) {
        this.size = size;
        this.Set(x,y);
    }

    public final void Set(int x, int y, int size, Color color) {
        this.color = color;
        this.Set(x,y,size);
    }

    public final void Set(int x, int y, Color color) {
        this.color = color;
        this.Set(x,y);
    }
}