import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import figures.*;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1,r2;
    Ellipse e1,e2;
    Tri t1;

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(350, 350);
        this.r1 = new Rect(50,50, 100,30, Color.gray, Color.magenta);
        this.r2 = new Rect(100,170, 60,70, Color.white, Color.black);
        this.e1 = new Ellipse(50,100, 100,30, Color.yellow, Color.blue);
        this.e2 = new Ellipse(150,220, 90,90, Color.green, Color.DARK_GRAY);
        this.t1 = new Tri(140,170,240,95,290,170, Color.red, Color.yellow);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.t1.paint(g);
    }
}