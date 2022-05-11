#include "rect.h"
#include <stdio.h>
#include <stdlib.h>

struct Figure {
    int x, y;
    int h, w;
    void (*print) (struct Figure*);
};
typedef void (*Figure_print) (struct Figure*);

struct Rect {
    Figure Figure_super;
};
Rect* Rect_new(int x, int y, int w, int h) {
    Rect* this = malloc(sizeof(Rect));
    Figure* Figure_super = (Figure*) this;
    Figure_super->x = x;
    Figure_super->y = y;
    Figure_super->h = h;
    Figure_super->w = w;
    Figure_super->print = (Figure_print) Rect_print;
}
void Rect_print(Rect* this) {
    Figure* Figure_super = (Figure*) this;
    printf("Tamanho do retangulo: (%d, %d), posicao (%d, %d).\n",
           Figure_super->h, Figure_super->w, Figure_super->x, Figure_super->y);
}
void Rect_drag(Rect* this, int dx, int dy) {
    Figure* Figure_super = (Figure*) this;
    Figure_super->x += dx;
    Figure_super->y += dy;
}
