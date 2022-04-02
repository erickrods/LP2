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
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }
    @Override
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grossuraPadrao));
        g2d.setColor(fillColor);
        g2d.fillRect(this.x, this.y, this.h, this.w);
        g2d.setColor(borderColor);
        g2d.drawRect(this.x, this.y ,this.h, this.w);
    }
}