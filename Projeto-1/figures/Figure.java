package figures;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

import ivisible.*;


public abstract class Figure implements IVisible, Serializable {

    protected Color borderColor;
    protected Color fillColor;
    public int x;
    public int y;
    public int h, w;
    protected static float grossuraPadrao = 3.0f;

    protected Figure(int x, int y, int h, int w, Color borderColor, Color fillColor) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public abstract void print();

    public abstract void paint(Graphics g);

    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public boolean clicked(int x, int y) {
        return (this.x <= x && x <= this.x + this.w && this.y<=y && y<=this.y+this.h);
    }
    public void foco(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grossuraPadrao));
        g2d.setColor(Color.RED);
        g2d.drawRect(this.x, this.y, this.h, this.w);
    }
    public void alterarTamanho(int x, int y){
        this.h += x;
        this.w += y;
    }
    public void corInterior(Color cor) {
        this.fillColor = cor;
    }

    public void corBorda(Color cor) {
        this.borderColor = cor;
    }

    public void paint(Graphics g, boolean b) {
    }
}
