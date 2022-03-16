#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int r,g,b;
} Color;

struct Figure;
typedef void (* Figure_Print) (struct Figure*);

typedef struct Figure {
    int x, y;
    Color fg, bg;
    void (* print) (struct Figure*);
} Figure;

///////////////////////////////////////////////////////////////////////////////
typedef struct{
    Figure super;
    int yx,yy,zx,zy;
} Tri;
void tri_print (Tri* this) {
    Figure* sup = (Figure*) this;
    printf("Triangulo na posicao (%d,%d)(%d,%d)(%d,%d).\n",
           sup->x, sup->y, this->yx, this->yy, this->zx, this->zy);
}

Tri* tri_new (int xx, int xy, int yx, int yy,int zx,int zy) {
    Tri*   this  = malloc(sizeof(Tri));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) tri_print;
    sup->x = xx;
    sup->y = xy;
    this->yx = yx;
    this->yy = yy;
    this->zx = zx;
    this->zy = zy; 
}


///////////////////////////////////////////////////////////////////////////////

typedef struct {
    Figure super;
    int w, h, zx, zy;
} Ellipse;

void Ellipse_print (Ellipse* this) {
    Figure* sup = (Figure*) this;
    printf("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
           this->w, this->h, sup->x, sup->y);
}

Ellipse* ellipse_new (int x, int y, int w, int h, int zx,int zy) {
    Ellipse* this = malloc(sizeof(Ellipse));
    Figure* sup = (Figure*) this;
    sup->print = (Figure_Print) Ellipse_print;
    sup->x = x;
    sup->y = y;
    this->w = w;
    this->h = h;
}

///////////////////////////////////////////////////////////////////////////////

void main (void) {
    Figure* figs[4] = {
        (Figure*) ellipse_new(40,10,140,300),
        (Figure*) tri_new(140,170,240,95,290,170),
        (Figure*) ellipse_new(210,110,305,130),
        (Figure*) tri_new(140,40,200,60,120,140)
    };

    ///

    for (int i=0; i<4; i++) {
        figs[i]->print(figs[i]);
    }

    ///

    for (int i=0; i<4; i++) {
        free(figs[i]);
    }
}




