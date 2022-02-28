package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse {
    int x, y;
    int w, h;
    Color fillColor, drawColor;

    public Ellipse (int x, int y, int w, int h, Color drawColor, Color fillColor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.drawColor = drawColor;
        this.fillColor = fillColor;
    }

    public void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        g2d.setColor(this.fillColor);
        g2d.fillOval(this.x, this.y, this.w, this.h);
        g2d.setColor(this.drawColor);
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}