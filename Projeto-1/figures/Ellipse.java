package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse extends Figure {
    Ellipse2D ellipse;
    //Ellipse2D isso;

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
    public void alterarTamanho(int x, int y){
        this.h += x;
        this.w += y;
    }
    @Override
    public void alterarMouse(Point coordMouse, int dx, int dy) {
        Point pointRedim = new Point((this.x+this.w)/2,this.y);
        Point pointRedim2 = new Point((this.x+this.w)/2,this.y+this.h);
        Point pointRedim3 = new Point(this.x,(this.y+this.h)/2);
        Point pointRedim4 = new Point(this.x+this.w,(this.y+this.h)/2);         //Point mouse com algu erro

        if (pointRedim.distance(coordMouse) >= 12) {
            if (this.w + dy >= 60) {
                this.w += dy;
            }
        }
        if (pointRedim2.distance(coordMouse) >= 12) {
            if (this.w + dy >= 60) {
                this.w += dy;
            }
        }
        if (pointRedim3.distance(coordMouse) >= 12) {
            if (this.h + dx >= 60) {
                this.h += dx;
            }
        }
        if (pointRedim4.distance(coordMouse) >= 12) {
            if (this.h + dx >= 60) {
                this.h += dx;
            }
        } else {
            mover(dx, dy);
        }
        this.ellipse.setFrame(this.x, this.y, this.h, this.w);
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
        this.ellipse = new Ellipse2D.Double(this.x,this.y,this.h,this.w);
    }
}