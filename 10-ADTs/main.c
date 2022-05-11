#include <stdlib.h>
#include "rect.h"

void main (void) {
    Rect* r1 = Rect_new(20, 20, 30, 30);
    Rect_print(r1);

    Rect* r2 = Rect_new(20, 20, 30, 30);
    Rect_drag(r2, 10, 100);
    Rect_print(r2);

    free(r1);
    free(r2);
}
