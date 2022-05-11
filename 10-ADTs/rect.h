typedef struct Rect Rect;
Rect* Rect_new(int, int, int, int);
void Rect_print(Rect*);
void Rect_drag(Rect*, int dx, int dy);
typedef struct Figure Figure;
typedef void (*Figure_print) (struct Figure*);
