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
        return (x >= this.x) && (x <= this.x + this.w) && (y >= this.y) && (y <= this.y + this.h);
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