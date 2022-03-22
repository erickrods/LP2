package figures;
import java.awt.*;

public class Tri extends Figure{

    int xa, xb, xc, xd, xe, ya, yb, yc, yd, ye;

    public Tri(int xa, int xb, int xc, int xd,int xe, int ya, int yb, int yc, int yd, int ye){
        this.xa = xa;
        this.xb = xb;
        this.xc = xc;
        this.xd = xd;
        this.xe = xe;
        this.ya = ya;
        this.yb = yb;
        this.yc = yc;
        this.yd = yd;
        this.ye = ye;
    }

    public void print () {
        System.out.format("Pentagono na posicao (%d,%d).\n",
                this.xa, this.ya);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(new int[]{this.xa,this.xb,this.xc,this.xd,this.xe}, new int[]{ya, yb, yc, yd, ye}, 5);

    }
}