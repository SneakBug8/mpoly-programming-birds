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
        this.setSize(300, 300);
        this.setVisible(true);

        Global = this;
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                onMouseClick();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    public void onMouseClick() {
        removeAll();
        repaint();
    }

    public MainWindow(Flock f) {
        this();
        this.birdsRenderer = new BirdsRenderer(f);
    }

    @Override
    public void paint(Graphics g) {
        this.birdsRenderer.Render(g);

    }
}