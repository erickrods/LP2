package figures;
import java.awt.*;
public abstract class Figure {

    int x,y,h,w;
    //int xx,xy,yx,yy,zx,zy;
    public Figure(int x, int y,int h, int w/*,int xx, int xy, int yx, int yy, int zx, int zy*/) {
       /* this.xx = xx;
        this.xy = xy;
        this.yx = yx;
        this.yy = yy;
        this.zx = zx;
        this.zy = zy;*/
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public abstract void paint(Graphics g);

    public abstract void print();
}