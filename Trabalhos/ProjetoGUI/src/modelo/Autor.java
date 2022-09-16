package modelo;

public class Autor {
	private int cod;
	private String nome;
	private String email;
	private String escrita;
	private String usuario = "user";
	private String senha = "12345";
	
	public Autor(int cod,String nome, String email, String escrita) {
		this.cod=cod;
		this.nome=nome;
		this.email=email;
		this.escrita=escrita;
	}
	public boolean confereCampos(String cod, String nome, String email, String combo) {
		if (cod!="" && nome!="" && email!="")
			return true;
		else
			return false;
			
	}
	public boolean confereSenha() {
		if (usuario=="user" && senha =="12345")
				return true;
		else 
			return false;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEscrita() {
		return escrita;
	}

	public void setEscrita(String escrita) {
		this.escrita = escrita;
	}
	
	
	
}
