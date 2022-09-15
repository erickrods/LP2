package modelo;

public class Pessoa {

	private String nome;
	private Data dataNasc;
	
	public Pessoa(String nome ,Data dataNasc) {
		this.nome=nome;
		this.dataNasc=dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}
	
}
