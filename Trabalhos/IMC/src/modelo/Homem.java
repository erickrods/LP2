package modelo;

public class Homem extends PessoaIMC {

	public Homem(String nome, Data dataNasc, double peso, double altura) {
		super(nome, dataNasc, peso, altura);
	}
	public void resultIMC() {
		double resultado;
		resultado=CaculaIMC(getPeso(),getAltura());
		if (resultado<20.7) {
			System.out.println("Abaixo do peso ideal");
		}else if((resultado>=20.7) && (resultado<=26.4)){
			System.out.println("Dentro do peso ideal");
		}else if (resultado>26.4) {
			System.out.println("Acima do peso ideal");	
		}else
			System.out.println("Erro!");
		
	}
}
