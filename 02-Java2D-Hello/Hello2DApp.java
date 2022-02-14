import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - 1.2.1!");
        this.setSize(400, 400);
        this.getContentPane().setBackground(Color.gray);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        g2d.setPaint(Color.yellow);
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);
        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(7.0f));
        g2d.draw(new Ellipse2D.Double(75, 70, 100, 100));
        g2d.setPaint(Color.black);
        g2d.draw(new Ellipse2D.Double(150, 70, 100, 100));
        g2d.setPaint(Color.blue);
        g2d.draw(new Ellipse2D.Double(225, 70, 100, 100));
        g2d.setPaint(Color.green);
        g2d.draw(new Ellipse2D.Double(115, 130, 100, 100));
        g2d.setPaint(Color.yellow);
        g2d.draw(new Ellipse2D.Double(190, 130, 100, 100));
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.setPaint(Color.green);
        g2d.drawLine(120, 350, 280, 350);
        g2d.setPaint(Color.blue);
        g2d.drawLine(60, 250, 340, 250);
        g2d.setPaint(Color.red);
        g2d.drawLine(340, 250, 280, 350);
        g2d.setPaint(Color.white);
        g2d.drawLine(60, 250, 120, 350);
    }
}