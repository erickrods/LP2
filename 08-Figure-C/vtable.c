#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int r,g,b;
} Color;

struct Figure;
typedef void (* Figure_Print) (struct Figure*);
typedef int  (* Figure_Area)  (struct Figure*);
typedef int  (* Figure_OutsideArea) (struct Figure*);

typedef struct {
    void (* print) (struct Figure*);
    int  (* area)  (struct Figure*);
    int  (* outsideArea) (struct Figure*);
} Figure_vtable;

typedef struct Figure {
    int x, y;
    Color fg, bg;
    Figure_vtable* vtable;
} Figure;

typedef struct{
    Figure super;
    int yx,yy,zx,zy;
} Tri;

void tri_print (Tri* this) {
    Figure* sup = (Figure*) this;
    printf("Triangulo na posicao (%d,%d)(%d,%d)(%d,%d), area interna (%d)e area externa:(%d)).\n",
           sup->x, sup->y, this->yx, this->yy, this->zx, this->zy, sup->vtable->area(sup),sup->vtable->outsideArea(sup));
}

int tri_area (Tri* this) {
    Figure* sup = (Figure*) this;
    return ((this->yy - this->yx)*(this->yx - sup->x))/2;
}

int tri_outsideArea (Tri* this) {
    Figure* sup = (Figure*) this;
    return (350 * 350) - (((this->yy - this->yx)*(this->yx - sup->x))/2);//Quadro 350x350 
}

Figure_vtable tri_vtable = {
    (Figure_Print) tri_print,
    (Figure_Area)  tri_area,
    (Figure_OutsideArea) tri_outsideArea
};

Tri* tri_new (int xx, int xy, int yx, int yy,int zx,int zy) {
    Tri*   this  = malloc(sizeof(Tri));
    Figure* sup = (Figure*) this;
    sup->vtable = &tri_vtable;
    sup->x = xx;
    sup->y = xy;
    this->yx = yx;
    this->yy = yy;
    this->zx = zx;
    this->zy = zy; 
}

typedef struct {
    Figure super;
    int w, h;
} Ellipse;

void ellipse_print (Ellipse* this) {
    Figure* sup = (Figure*) this;
    printf("Elipse de tamanho (%d,%d) na posicao (%d,%d)  area  interna (%d) e area externa:(%d).\n",
           this->w, this->h, sup->x, sup->y, sup->vtable->area(sup), sup->vtable->outsideArea(sup));
}

int ellipse_area (Ellipse* this) {
    Figure* sup = (Figure*) this;
    return ((this->w/2 )* (this->h/2) * 3.14);
}

int ellipse_outsideArea(Ellipse* this){
    Figure* sup = (Figure*) this;
    return (350*350) - ((this->w/2 )* (this->h/2) * 3.14);
}

Figure_vtable ellipse_vtable = {
    (Figure_Print) ellipse_print,
    (Figure_Area)  ellipse_area,
    (Figure_OutsideArea) ellipse_outsideArea
};

Ellipse* ellipse_new (int w, int h, int x, int y) {
    Ellipse* this = malloc(sizeof(Ellipse));
    Figure* sup = (Figure*) this;
    sup->vtable = &ellipse_vtable;
    sup->x = x;
    sup->y = y;
    this->w = w;
    this->h = h;
}

void main (void) {
    Figure* figs[2] = {
        (Figure*) ellipse_new(40,10,140,300),
        (Figure*) tri_new(10,20,50,60,30,40)

    };
    for (int i=0; i<2; i++) {
        figs[i]->vtable->print(figs[i]);
    }
    for (int i=0; i<2; i++) {
        free(figs[i]);
    }
}
