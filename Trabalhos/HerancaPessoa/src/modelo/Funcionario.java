package modelo;

public class Funcionario extends Pessoa {
	private Data  dtAdm;
	private double salario;
	public Funcionario(String nome, String cpf, Data dtN, Data dtAdm, double salario) {
		super(nome, cpf, dtN);
		this.dtAdm = dtAdm;
		this.salario = salario;
	}
	public Funcionario(Pessoa pessoa, Data dtAdm, double salario) {
		super(pessoa.getNome(),pessoa.getCpf(),pessoa.getDtNasc());
		this.dtAdm = dtAdm;
		this.salario = salario;
		// TODO Auto-generated constructor stub
	}
	public Data getDtAdm() {
		return dtAdm;
	}
	public void setDtAdm(Data dtAdm) {
		this.dtAdm = dtAdm;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return super.toString()+"\nData de adimissao: " +dtAdm+ "\nSalário: "+salario+"\n";	}
	
	

}
