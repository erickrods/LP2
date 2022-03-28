package figures;

import java.awt.*;

public class Linha extends Figure {

    public Linha{super(x,y,h,w);}

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawline(this.x, this,y, this.x+h, this.y+w);
    }
}