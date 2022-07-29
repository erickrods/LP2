package dadosFuncionarios;

public class Funcionario {
	private String nome;
	private double salario;
	private String cpf;
	private int anoContratacao;

	public void funcionarios(String nome,double salario, String cpf, int anoContratacao ) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.anoContratacao = anoContratacao;  
	}

	public void funcionarios() {

	}

	public double aumentaSalario(double valorBase) {
		double percent = valorBase/100;
		this.salario = (this.salario * percent) + this.salario;
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {

		return salario;
	}

	public String getCpf() {
		return cpf;
	}

	public int getAnoContratacao() {
		return anoContratacao;
	}
	public String toString() {
		return "\nNone: "+this.nome+"\nSalario: "+this.salario+"\nCPF: "+this.cpf+"\nAno de contratação: "+this.anoContratacao+"\n";

	}

}