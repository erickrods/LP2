package dados;


public class Fatura {
	private int numero;
	private int quant;
	private String descricao;
	private double preco;
	public Fatura(int numero, String descricao, int quant,double preco) {//construtor
		this.numero = numero;
		this.descricao = descricao;
		this.quant = quant;
		this.preco = preco;
	}
	public Fatura() {
		
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco<0) 
			this.preco = 0.0;
		else
			this.preco = preco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getTotalFatura() {
		if (preco*quant <0)
			return 0;
		else
			return preco*quant;
	}
	@Override
	public String toString() {
		return "Fatura [numero=" + numero + ", quant=" + quant + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
}
