package figures;

import java.awt.*;

public class Tri extends Figure {
    Polygon triangulo;
    int arrayX[], arrayY[];

    public Tri(int x, int y, int h, int w, Color borderColor, Color fillColor) {
        super(x, y, h, w, borderColor, fillColor);
        int xx = this.x;
        int yx = this.y;
        int xy = xx;
        int yy = yx + this.h;
        int xz = xx + this.w;
        int yz = yx + this.h;
        int xValores[] = {xx, xy, xz};
        int yValores[] = {yx, yy, yz};
    }
    @Override
    public void paint (Graphics g) {
            int xx = this.x;
            int yx = this.y;
            int xy = xx;
            int yy = yx + this.h;
            int xz = xx + this.w;
            int yz = yx + this.h;
            int xValores[] = {xx, xy, xz};
            int yValores[] = {yx, yy, yz};
            this.arrayX = xValores;
            this.arrayY = yValores;

            this.triangulo = new Polygon(arrayX, arrayY, 3);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(grossuraPadrao));
            g2d.drawPolygon(triangulo);
            //g2d.setColor(fillColor);
            //g2d.FillPolygon(triangulo);

        }
    public void print () {
        //System.out.format("Triangulo na posicao (%d,%d, %d).\n", int xx,int yx,int yz);
    }
    
}