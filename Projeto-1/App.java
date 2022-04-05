import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.MouseInfo;

import figures.*;

public class App {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}
class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    ListFrame () {
        this.addWindowListener (
                new WindowAdapter() {
                    public void windowClosing (WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        this.addKeyListener (
                new KeyAdapter() {
                    public void keyPressed(KeyEvent evt) {
                        Point p = MouseInfo.getPointerInfo().getLocation();
                        int x = p.x - getLocation().x;
                        int y = p.y - getLocation().y;
                        /*PointerInfo a = MouseInfo.getPointerInfo();
                        Point b = a.getLocation();
                        int x = (int) b.getX();
                        int y = (int) b.getY();
                        Point localMouse = MouseInfo.getPointerInfo().getLocation();*/
                        if (evt.getKeyChar() == 'r') {
                            Rect r = new Rect(x, y, 140, 100, Color.BLACK, Color.WHITE);
                            figs.add(r);
                            repaint();
                        } else if (evt.getKeyChar() == 'e') {
                            Ellipse e = new Ellipse(x, y, 110, 100, Color.BLACK, Color.WHITE);
                            figs.add(e);
                            repaint();
                        } else if (evt.getKeyChar() == 't') {
                            Tri t = new Tri(x, y, 120, 60, Color.BLACK, Color.WHITE);
                            figs.add(t);
                            repaint();
                        } else if (evt.getKeyChar() == 'l') {
                            Linha l = new Linha(x, y, 120, 100, Color.BLACK, Color.WHITE);
                            figs.add(l);
                            repaint();
                        }
                    }
                }
                );


        this.setTitle("Projeto");
        this.setSize(1000, 1000);
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}