#include <stdio.h>
#include <stdlib.h>

typedef struct 
{
    float x, y, z; //pontos iniciais.
    float altura, largura, profundidade; //positiva ou negativa. 
    int espessura;
    char corp[21],cors[21];//cores.
} Caixa3D;

void Imprimir(Caixa3D caixa){
    printf("Ponto x: %d \nPonto y: %d \nPonto z: %d \nAltura: %f \nLargura: %f \nProfundidade: %f \nCor Primaria: %s \nCor secundaria: %s\n Espessura das linhas: %d \n", caixa.x, caixa.y, caixa.z, caixa.altura, caixa.largura, caixa.profundidade, caixa.corp, caixa.cors, caixa.espessura);
}
int main(){
	Caixa3D cubo1;
    Imprimir(cubo1);
    return 0;
}
