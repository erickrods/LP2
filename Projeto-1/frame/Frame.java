package pframe;

import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import figures.*;


public class pFrame extends JFrame{
    ArrayList<Figure> figs = new ArrayList<Figure>();
    pFrame () {
        this.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        this.addKeyListener(
                new KeyAdapter() {
                    public void keyPressed(KeyEvent evt) {
                        if (evt.getKeyChar() == 'r') {
                            int x = rand.nextInt(400);
                            int y = rand.nextInt(400);
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            Rect r = new Rect(x, y, w, h);
                            figs.add(r);
                            //repaint();
                        } else if (evt.getKeyChar() == 'e') {
                            int x = rand.nextInt(400);
                            int y = rand.nextInt(400);
                            int w = rand.nextInt(400);
                            int h = rand.nextInt(400);
                            Ellipse e = new Ellipse(x, y, w, h);
                            figs.add(new Ellipse(x, y, w, h));
                        }
                        repaint();
                    }
                }
        );
        this.setTitle("Projeto");
        this.setSize(600, 600);
    }
    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}