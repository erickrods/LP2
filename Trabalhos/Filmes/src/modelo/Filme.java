package modelo;

public class Filme {
	private String titulo;
	private String descricao;
	private String diretor;
	private int duracaoMin;
	
	public Filme(String titulo, String descricao, String diretor, int duracaoMin) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.diretor = diretor;
		this.duracaoMin = duracaoMin;
	}
	
	public Filme() {

	}
	/**public String exibirDuracaoEmHoras(int duracao) {
		int horas;
		double minutos;
		horas= duracao/60;
		minutos= (duracao -horas*60)2;
		return descricao;
		
		
		
	}**/
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getDuracaoMin() {
		return duracaoMin;
	}
	public void setDuracaoMin(int duracaoMin) {
		this.duracaoMin = duracaoMin;
	}

	@Override
	public String toString() {
		return "\nTitulo:" + titulo + "\nDescricao:" + descricao + "\nDiretor:" + diretor + "\nDuracao em minutos:"
				+ duracaoMin;
	}
	
}
