class texto{
    int x,y;
    int tamanho;
    String fonte,cor;
    Boolean italico,negrito,sublinha,vertical,inverso;
    texto(int x,int y,int tamanho,String fonte,String cor,Boolean italico,Boolean negrito, Boolean sublinha, Boolean Vertical, Boolean inverso){
        this.x=x;
        this.y=y;
        this.tamanho=tamanho;
        this.fonte=fonte;
        this.cor=cor;
        this.italico=italico;
        this.negrito=negrito;
        this.sublinha=sublinha;
        this.vertical=vertical;
        this.inverso=inverso;
        this.show(x, y, tamanho, fonte, cor, italico, negrito, sublinha, Vertical, inverso);
    }
    void show (int xx,int xy,int xtamanho,String xfonte,String xcor,Boolean xitalico,Boolean xnegrito, Boolean xsublinha, Boolean xVertical, Boolean xinverso) {
        System.out.format("Posicao (%d,%d)",xx,xy);
        System.out.format("Tamanho %d",xtamanho);
        System.out.format("Fonte: %s",xfonte);
        System.out.printf("Italico: %b",xitalico);
        System.out.flush();
        System.out.printf("Negrito: %b",xnegrito);
        System.out.flush();
        System.out.printf("Sublinhado: %b",xsublinha);
        System.out.flush();
        System.out.printf("Vertical: %b",xvertical);
        System.out.flush();
        System.out.printf("Invertido: %b",xInvertido);
        System.out.flush();
         }
}