public class RectApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(4,5); 
        r1.area();
     }
} 

class Rect {
     int x, y;
     Rect (int x, int y) {
         this.x = x;
         this.y = y;
     }
     int area(){
        int total;
        total=x*y;
        return total;
     }
}