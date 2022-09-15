package modelo;

public class Mulher extends PessoaIMC{

	public Mulher(String nome, Data dataNasc, double peso, double altura) {
		super(nome, dataNasc, peso, altura);
	}
	public void resultIMC() {
		double resultado;
		resultado=CaculaIMC(getPeso(),getAltura());
		if (resultado<19) {
			System.out.println("Abaixo do peso ideal");
		}else if((resultado>=19) && (resultado<=25.8)){
			System.out.println("Dentro do peso ideal");
		}else if (resultado>25.8) {
			System.out.println("Acima do peso ideal");	
		}else
			System.out.println("Erro!");
		
	}
	@Override
	public String toString() {
		return super.toString();
		
	}
}
