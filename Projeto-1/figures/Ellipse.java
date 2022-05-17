package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse extends Figure {
    Ellipse2D ellipse;

    public Ellipse (int x, int y, int h, int w, Color borderColor, Color fillColor) {
        super(x, y, h, w, borderColor, fillColor);
        this.ellipse = new Ellipse2D.Float(x, y, h, w);
    }
    public Ellipse (int x, int y, int h, int w){
        super(x, y ,h ,w, Color.BLACK, Color.WHITE);
        this.ellipse = new Ellipse2D.Float(x, y, h, w);
    }

    public void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n", this.w, this.h, this.x, this.y);
    }
    @Override
    public void paint (Graphics g) {
        this.ellipse = new Ellipse2D.Double(this.x, this.y, this.h, this.w);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grossuraPadrao));
        g2d.setColor(borderColor);
        g2d.draw(ellipse);
        g2d.setColor(fillColor);
        g2d.fill(ellipse);
    }
}