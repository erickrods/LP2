package modelo;


public abstract class PessoaIMC extends Pessoa{
	private double peso;
	private double altura;
	public PessoaIMC(String nome, Data dataNasc,double peso,double altura){
		super(nome, dataNasc);
		this.peso=peso;
		this.altura=altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double CaculaIMC(double peso, double altura) {
		double imc;
		double alturatotal;
		alturatotal=altura*altura;
		imc= peso/alturatotal;
		return imc;
		
	}
	public abstract void resultIMC();
	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nData de nascimento: "+getDataNasc()+ "\nPeso:" + peso + "\nAltura" + altura;
	}
	
}