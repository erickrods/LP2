package figures;
import java.awt.*;
public abstract class Figure {

    int x,y;
    int h,w;

    public Figure(int x, int y,int h, int w) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    public abstract  void print();
    public abstract void paint(Graphics g);

}