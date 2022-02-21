public class RectApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(1,1, 10,10); 
        r1.show(1,1,10,10);
        r1.drag(1,1,10,10); 
     }
} 

class Rect {
    int x, y;
    int w, h;
    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    void drag (int dx, int dy,int dw,int dh){
        int movx=10;//valor qualquer
        int movy=7; //      ||
        dx=dx+movx;
        dy=dy+movy;
        this.show(dx,dy,dw,dh);//para testar o resultado
    }
    void show (int k, int l,int m,int n) {
    System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
         m, n,k,l);
         
     }
}