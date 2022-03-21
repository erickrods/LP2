package figures;

import java.awt.*;

public class Tri extends Figure{
    
    int xx, xy, yx, yy, zx, zy;

    public Tri(int xx, int xy, int yx, int yy,int zx, int zy){
        this.xx = xx;
        this.xy = xy;
        this.yx = yx;
        this.yy = yy;
        this.zx = zx;
        this.zy = zy;

    }

    public void print () {
        System.out.format("Triangulo na posicao (%d,%d, %d).\n",
             this.xx, this.yx, this.zy);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(new int[]{this.xx,this.yx,this.zx}, new int[]{xy,yy,zy}, 3);

    }
}