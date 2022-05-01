1 - Veículos
a - Caracteristicas de veículos.
b - Coletar e aplicar carasctristicas de diferentes tipos de veículos.
c -
public class veiculo{
    protected Color corVeiculo;
    protected int qPortas;
    protected int tracao;  //1-dianteira 2-traseira 3-integral
    protected int polegadasAro;
    protected int potencia;
    protected boolean cacamba;

    protected veiculo(int qPortas, int tracao, int polegadasAro, int potencia,boolean cacamba,Color corVeiculo){
        this.qPortas = qPortas;
        this.tracao = tracao;
        this.polegadasAro = polegadasAro;
        this.potencia = potencia;
        this.cacamba = cacamba;
        this.corVeiculo = corVeicul;
    }
    public void modeloRodas(){
        //Aplicar roda escolhida
    }
    public void corInterna(Color cor){
        //aplicar cor interna
    }
}
d - (carros/caminhonetes/caminhoes/)



2 - Tocável
a - Toque em x regiao para executar y ação.
b - Ambos executam tarefas ao receber toques em locais específicos.
c -
public interface tocavel{
    public boolean toque(int x, int y);
}

d - Microondas e smartphone        

