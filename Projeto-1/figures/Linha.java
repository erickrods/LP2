package figures;
import java.awt.*;
import java.awt.geom.*;

public class Linha extends Figure {
    private int x, y;
    private int h, w;
    private Color borderColor;
    Line2D linha;

    public Linha(int x, int y, int h, int w, Color borderColor, Color fillColor) {
        super(x, y, h, w, borderColor, null);
        this.x = x;
        this.y = y;
        this.h = x + h;
        this.w = w + y;
        this.borderColor = Color.BLACK;
        this.linha = new Line2D.Float(this.x, this.y, this.h, this.w);
    }


    public void print () {
        System.out.format("Linha de tamanho (%d,%d) na posicao (%d,%d).\n",
                this.w, this.h, this.x, this.y);
    }
    @Override
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grossuraPadrao));
        g2d.setColor(borderColor);
        g2d.drawLine(this.x, this.y, this.h, this.w);
    }
}