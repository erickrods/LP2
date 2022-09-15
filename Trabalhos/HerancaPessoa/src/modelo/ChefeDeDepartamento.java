package modelo;

public class ChefeDeDepartamento extends Funcionario{
	private String departamento;
	private Data dtPromo;
	
	public ChefeDeDepartamento(String nome, String cpf, Data dtNasc, Data dtAdm, double salario, String departamento) {
		super(nome,cpf,dtNasc,dtAdm,salario);
		this.departamento = departamento;
	}
	public ChefeDeDepartamento(Funcionario funcionario,String nomeDep,Data dtPromo) {
		super(funcionario.getNome(),funcionario.getCpf(),funcionario.getDtNasc(),funcionario.getDtAdm(),funcionario.getSalario());
		this.departamento = nomeDep;
		this.dtPromo = dtPromo;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Boolean buscaChefe(String nome) {
		if (this.getNome().equalsIgnoreCase(nome)) {
			return true;
		}else {
			return false;

		}
		
	}
	public String toString() {
		return ("\nChefe do departamento: "+this.departamento+"\nData da promoção: "+this.dtPromo+"\n"+super.toString());
	}
}
