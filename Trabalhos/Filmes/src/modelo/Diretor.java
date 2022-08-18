package modelo;

public class Diretor {
	private String nome;
	private int exp;
	private String origem;
	
	public Diretor(String nome, int exp, String origem) {
		this.nome = nome;
		this.exp = exp;
		this.origem = origem;
	}
	public Diretor() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	@Override
	public String toString() {
		return "\nNome:" + nome + "\nExperiencia:" + exp + "\nOrigem:" + origem;
	}

}
