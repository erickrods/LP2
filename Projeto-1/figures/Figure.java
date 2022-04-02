package figures;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;


public abstract class Figure {

    protected Color borderColor;
    protected Color fillColor;
    protected int x,y;
    protected int h, w;
    protected static float grossuraPadrao = 2.7f;


    public Figure(int x, int y,int h, int w, Color borderColor, Color fillColor) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
    public abstract  void print();
    public abstract void paint(Graphics g);

}