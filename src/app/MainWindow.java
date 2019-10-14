package app;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainWindow extends JFrame {
    public static MainWindow Global;
    private BirdsRenderer birdsRenderer;

    public MainWindow() {
        super("MainWindow");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Config.WindowX, Config.WindowY);
        this.setVisible(true);

        Global = this;
    }

    public MainWindow(Flock f) {
        this();
        this.birdsRenderer = new BirdsRenderer(f);
    }

    @Override
    public void paint(Graphics g) {
        g.translate(this.getWidth() / 2, this.getHeight() / 2);

        g.setColor(new Color(0,0,0));
        g.drawLine(-150, 0, 150, 0);
        g.drawLine(0, 150, 0, -150);

        this.birdsRenderer.Render(g);
    }
}