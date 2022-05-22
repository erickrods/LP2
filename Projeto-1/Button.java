import java.awt.*;
import ivisible.*;
import figures.*;

public class Button  implements IVisible {

    public int x, y;
    public int size = 50;
    public int buttonIndex;
    private Figure figureButton;

    public Button(Figure figureButton, int buttonIndex) {
        this.figureButton = figureButton;
        this.buttonIndex = buttonIndex;
        this.x = 30;
        this.y = 50 + 55 * buttonIndex;
    }
    public boolean clicked(int dx, int dy) {
        return (dx >= this.x) && (dx <= this.x + this.size) && (dy >= this.y) && (dy <= this.y + this.size);
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(1));

        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(this.x, this.y, this.size, this.size);

        this.figureButton.paint(g);
    }
    public void paint(Graphics g, boolean b) {
    }
    public void foco(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.drawRect(this.x, this.y, this.size, this.size);
    }

}
