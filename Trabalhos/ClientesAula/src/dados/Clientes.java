package dados;

public class Clientes
{
	private int codigo;
	private String nome;
	private String cpf;
	private String telefone;
	


	public void clientes(int codigo, String nome,String cpf, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		
	}
	
	public void clientes() {
		

	}
	public void acharNome(String nome,int tam) {
		/**for (int i=0;i<tam;i++) {
			
		}**/
	}
	
	public String exibirInfo() {	
		return null;
	}
	public void verificaNome(String nome) {
		if (this.nome.equals(nome)){
			System.out.println("Iguais");
		}else
			System.out.println("Distintas");
		
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}
	public String toString() {
		return "Cód:"+this.codigo+"\nNome:"+this.nome+"\nCPF:"+this.cpf+"\nTelefone:"+this.telefone;
		
	}
}