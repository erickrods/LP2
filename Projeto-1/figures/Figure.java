package figures;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public abstract class Figure {

    public Color borderColor;
    public Color fillColor;
    public int x, y;
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
        return (this.x <= x && x <= this.x + this.w && this.y <= y && y <= this.y + this.w);
    }

    public void corInterior(Color cor) {
        this.fillColor = cor;
    }

    public void corBorda(Color cor) {
        this.borderColor = cor;
    }
}
