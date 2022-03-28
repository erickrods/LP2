package figures;

import java.awt.*;

public class Tri extends Figure {


    public Tri(int x, int y, int h, int w) { super(x, y, h, w);}

        /*this.xx = xx;
        this.xy = xy;
        this.yx = yx;
        this.yy = yy;
        this.zx = zx;
        this.zy = zy;

    }  */

    public void print () {
        System.out.format("Triangulo na posicao (%d,%d, %d).\n",
             this.xx, this.yx, this.zy);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(new int[]{this.xx,this.yx,this.zx}, new int[]{xy,yy,zy}, 3);

    }
}