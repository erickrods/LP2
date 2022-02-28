package figures;

import java.awt.*;

public class Tri{
    
    int xx, xy, yx, yy, zx, zy; 
    Color fillcolor, drawcolor;

    public Tri(int xx, int xy, int yx, int yy,int zx, int zy, Color fillcolor, Color drawcolor){
        this.xx = xx;
        this.xy = xy;
        this.yx = yx;
        this.yy = yy;
        this.zx = zx;
        this.zy = zy; 
        this.fillcolor= fillcolor;
        this.drawcolor = drawcolor;

    }

    public void print () {
        System.out.format("Triangulo na posicao (%d,%d, %d).\n",
             this.xx, this.yx, this.zy);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.setColor(this.drawcolor);
        g2d.drawPolygon(new int[]{this.xx,this.yx,this.zx}, new int[]{xy,yy,zy}, 3);
        g2d.setColor(this.fillcolor);
        g2d.fillPolygon(new int[]{this.xx,this.yx,this.zx}, new int[]{xy,yy,zy}, 3);
    }
}