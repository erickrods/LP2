import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

import figures.*;

public class App {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();

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
                    public void keyPressed (KeyEvent evt) {
                        if (evt.getKeyChar() == 'r') {
                            int x = rand.nextInt(400);
                            int y = rand.nextInt(400);
                            int w = rand.nextInt(50);
                            int h = rand.nextInt(50);
                            Rect r = new Rect(x,y, w,h);
                            figs.add(r);
                            repaint();
                        } else if (evt.getKeyChar() == 'e') {
                            int x = rand.nextInt(400);
                            int y = rand.nextInt(400);
                            int w = rand.nextInt(400);
                            int h = rand.nextInt(400);
                            Ellipse e = new Ellipse(x,y ,w,h);
                            figs.add(new Ellipse(x,y, w,h));
                            repaint();
                        }else if (evt.getKeyChar() == 't'){
                            int x = rand.nextInt(400);
                            int y = rand.nextInt(400);
                            int w = rand.nextInt(400);
                            int h = rand.nextInt(400);
                            int t3x = rand.nextInt(400);
                            int t3y = rand.nextInt(400);
                            Tri t = new Tri(x ,y, w,h, t3x, t3y);
                            figs.add(t);
                            repaint();
                        } else if (evt.getKeyChar() == 'p'){
                            int x = rand.nextInt(400);
                            int y = rand.nextInt(400);
                            int w = rand.nextInt(400);
                            int h = rand.nextInt(400);
                            int p3x = rand.nextInt(400);
                            int p3y = rand.nextInt(400);
                            int p4x = rand.nextInt(400);
                            int p4y = rand.nextInt(400);
                            int p5x = rand.nextInt(400);
                            int p5y = rand.nextInt(400);
                            Pent p = new Pent(x, y, w, h, p3x, p3y, p4x,p4y, p5x,p5y);
                            figs.add(p);
                            repaint();
                        }
                    }
                }
        );

        this.setTitle("Projeto");
        this.setSize(400, 400);
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}