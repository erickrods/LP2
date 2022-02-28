package figures;

import java.awt.*;

public class Rect {
    int x, y;
    int w, h;
    Color drawcolor,fillcolor;

    public Rect (int x, int y, int w, int h, Color drawcolor, Color fillcolor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.drawcolor = drawcolor;
        this.fillcolor= fillcolor;
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.drawRect(this.x,this.y, this.w,this.h);
        g2d.setColor(this.fillcolor);
        g2d.fillRect(this.x, this.y, this.w, this.h);
        g2d.setColor(this.drawcolor);
        g2d.drawRect(this.x,this.y, this.w,this.h);
    }
}