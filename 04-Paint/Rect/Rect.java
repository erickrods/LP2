import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect r1, r2, r3, r4 ,r5, r6, r7;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("2.2.1!");
        this.setSize(450, 350);
        this.r1 = new Rect(50,50, 100,30);
        this.r2 = new Rect(50,90, 140,30);
        this.r3 = new Rect(50,130, 180,30);
        this.r4 = new Rect(50,170, 220,30);
        this.r5 = new Rect(50,210, 260,30);
        this.r6 = new Rect(50,250, 300,30);
        this.r7 = new Rect(50,290, 340,30);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g, Color.pink, Color.green);
        this.r2.paint(g, Color.black, Color.red);
        this.r3.paint(g, Color.gray, Color.white);
        this.r4.paint(g, Color.yellow, Color.gray);
        this.r5.paint(g, Color.white, Color.blue);
        this.r6.paint(g, Color.DARK_GRAY, Color.yellow);
        this.r7.paint(g, Color.orange, Color.magenta);
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g,Color drawcolor,Color fillcolor) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3.0f));
        g.setColor(drawcolor);
        g.drawRect(this.x,this.y, this.w,this.h);
        g.setColor(fillcolor);
        g.fillRect(this.x, this.y, this.w, this.h);
        
    }
}