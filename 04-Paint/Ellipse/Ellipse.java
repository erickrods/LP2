import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Ellipse e1, e2, e3, e4;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("2.2.2!");
        this.setSize(450, 350);
        this.e1 = new Ellipse(200,80 ,70, 70);
        this.e2 = new Ellipse(100,150 ,40, 40);
        this.e3 = new Ellipse(200,180 ,70, 70);
        this.e4 = new Ellipse(330,150 ,40, 40);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.e1.paint(g, Color.pink, Color.green);
        this.e2.paint(g, Color.black, Color.red);
        this.e3.paint(g, Color.yellow, Color.blue);
        this.e4.paint(g, Color.orange, Color.magenta);
    }
}

class Ellipse {
    int x, y;
    int w, h;

    Ellipse (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g,Color drawcolor,Color fillcolor) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.setColor(drawcolor);
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        g2d.setColor(fillcolor);
        g2d.fillOval(this.x, this.y, this.w, this.h);
    }
}