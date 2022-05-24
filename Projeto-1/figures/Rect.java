package figures;

import java.awt.*;



public class Rect extends Figure {
    Rectangle rect;

    public Rect (int x, int y, int h, int w, Color borderColor, Color fillColor) {
        super(x, y, h, w, borderColor, fillColor);
        this.rect = new Rectangle(this.x, this.y, this.h, this.w);
    }
    public Rect (int x, int y, int h, int w) {
        super(x, y, h, w, Color.BLACK, Color.WHITE);
        this.rect = new Rectangle(this.x, this.y, this.h, this.w);
    }
    public void print () {
    }
    @Override
    public void alterarTamanho(int x, int y){
        this.h += x;
        this.w += y;
    }
    @Override
    public boolean clicked(int x, int y) {
        return (x >= this.x) && (x <= this.x + this.h) && (y >= this.y) && (y <= this.y + this.w);
    }
    @Override
    public void alterarMouse(Point coordMouse, int dx, int dy) {
        Point pointRedim = new Point((this.x + this.w) / 2, this.y);
        Point pointRedim2 = new Point((this.x + this.w) / 2, this.y + this.h);
        Point pointRedim3 = new Point(this.x, (this.y + this.h) / 2);
        Point pointRedim4 = new Point(this.x + this.w, (this.y + this.h) / 2);

        if (pointRedim.distance(coordMouse) >= 12) {
            if (this.w + dy >= 60) {
                this.w += dy;
            }
        }
        if (pointRedim2.distance(coordMouse) >= 12) {
            if (this.w + dy >= 60) {
                this.w += dy;
            }
        }
        if (pointRedim3.distance(coordMouse) >= 12) {
            if (this.h + dx >= 60) {
                this.h += dx;
            }
        }
        if (pointRedim4.distance(coordMouse) >= 12) {
            if (this.h + dx >= 60) {
                this.h += dx;
            }
        } else {
            mover(dx, dy);
        }
        this.rect.setFrame(this.x, this.y, this.h, this.w);
    }
    @Override
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grossuraPadrao/2));
        g2d.setColor(fillColor);
        g2d.fillRect(this.x, this.y, this.h, this.w);
        g2d.setColor(borderColor);
        g2d.drawRect(this.x, this.y ,this.h, this.w);
    }
}