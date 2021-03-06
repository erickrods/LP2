package figures;
import javax.sound.sampled.Line;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Float;
import java.util.Random;

public class Linha extends Figure {
    private int x, y;
    private int h, w;
    private Color borderColor;
    Line2D linha;


    public Linha (int x, int y, int h, int w, Color borderColor, Color fillColor) {
        super(x, y, h, w, borderColor, null);
        this.x = x;
        this.y = y;
        this.h = h +x;
        this.w = w + y;
        this.borderColor = borderColor;
        this.linha = new Line2D.Float(x, y, h+x, w+y);
    }
    public Linha (int x, int y, int h, int w){
        super(x, y, h+x, w+y, Color.BLACK, null);
        this.linha = new Line2D.Float(x, y, h+x, w+y);

    }
    public void print () {}
    @Override
    public void mover(int dx,int dy){
        super.mover(dx,dy);
        this.x += dx;
        this.h += dx;
        this.y += dy;
        this.w += dy;
    }
    @Override
    public boolean clicked(int x, int y) {
        return this.linha.ptSegDist(x, y) <= 20;
    }
    @Override
    public void alterarTamanho(int x, int y){
        this.h += x;
        this.w += y;
    }
    @Override
    public void corBorda(Color cor) {
        super.corBorda(cor);
        this.borderColor = cor;
    }
    @Override
    public void foco(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grossuraPadrao));
        g2d.setColor(Color.RED);
        g2d.drawRect(this.x, this.y, this.h-x, this.w-y);
    }
    @Override
    public void alterarMouse(Point coordMouse, int dx, int dy) {
        Point pointRedim = new Point(this.x, this.y);
        Point pointRedim2 = new Point(this.h, this.w);
        if (pointRedim.distance(coordMouse) <= 15) {
            if (this.h + dx >= 60) {
                //this.x += dy;
                this.y += dy;
            }
        } else if (pointRedim2.distance(coordMouse) <= 15) {
            if (this.h + dx >= 60) {
                this.h += dx;
                //this.w += dx;
            }
        } else {
            mover(dx, dy);
        }
        this.linha.setLine(pointRedim, pointRedim2);
    }
    @Override
    public void paint (Graphics g) {
        this.linha = new Line2D.Float(this.x, this.y, this.h , this.w);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(grossuraPadrao));
        g2d.setColor(borderColor);
        g2d.draw(this.linha);
    }
}