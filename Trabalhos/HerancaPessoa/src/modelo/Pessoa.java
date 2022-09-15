package modelo;
public class Pessoa{

	private String nome, cpf;
	private Data dtNasc;
	public Pessoa(String nome, String cpf, Data d){
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = d;
		}
	public Pessoa() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Data getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Data dtNasc) {
		this.dtNasc = dtNasc;
	}
	@Override
	public String toString() {
		return "Nome: "+nome+"\nCPF: "+cpf+"\nData de nascimento: "+dtNasc;
		}
	
}