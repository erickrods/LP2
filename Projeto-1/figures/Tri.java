package figures;

import java.awt.*;

public class Tri extends Figure {
    Polygon triangulo;
    private int arrayX[], arrayY[];

    public Tri(int x, int y, int h, int w) {
        super(x, y, h, w,Color.BLACK, Color.WHITE);
    }

    public Tri(int x, int y, int h, int w, Color borderColor, Color fillColor) {
        super(x, y, h, w, borderColor, fillColor);

    }
    @Override
    public void foco(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(1.8f));
        g2d.setColor(Color.RED);
        g2d.drawRect(this.x, this.y, this.w, this.h);
    }
    @Override
    public boolean clicked(int x, int y) {
        return this.triangulo.contains(x,y);
    }
    @Override
    public void alterarMouse(Point coordMouse, int dx, int dy) {
        Point pointRedim = new Point(this.arrayX[2], this.arrayY[2]);
        if (pointRedim.distance(coordMouse) <= 5) {
            if (this.w + dx >= 10) {
                this.w += dx;
            }
            if (this.h + dy >= 10) {
                this.h += dy;
            }
        } else {
            mover(dx, dy);
        }
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
        g2d.setColor(borderColor);
        g2d.drawPolygon(this.triangulo);
        g2d.setColor(fillColor);
        g2d.fillPolygon(this.triangulo);

    }
    public void print () {
        //System.out.format("Triangulo na posicao (%d,%d, %d).\n", int xx,int yx,int yz);
    }

}