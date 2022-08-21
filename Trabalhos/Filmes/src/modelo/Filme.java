package modelo;

public class Filme {
	private String titulo;
	private String descricao;
	private Diretor diretor;
	private int duracaoMin;
	
	public Filme(String titulo, String descricao, String diretor,int exp, String origem, int duracaoMin) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.diretor = new Diretor(diretor, exp, origem);
		this.duracaoMin = duracaoMin;
	}
	
	public Filme() {

	}
	public String exibirDuracaoEmHoras(int duracao) {
		int horas;
		int minutos;
		horas= duracao/60;
		minutos= duracao - (horas*60);
		if (minutos!=0)
			return "O filme " +titulo+ " Possui " +horas+ " horas e " +minutos+" minutos\n";
		else
			return "O filme " +titulo+ " Possui " +horas+ " horas\n";
	}
	public boolean comparaTitulo(String titulo) {
		if (this.titulo.equalsIgnoreCase(titulo)){
			return true;
		}else
			return false;
	}

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

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
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
		return "\nTitulo:" + titulo + "\nDescricao:" + descricao + "\nDuracao em minutos:"
				+ duracaoMin + diretor+"\n";
	}

	public String tituloQuant() {
		
		return "\nTitulo:"+titulo+"\nDuração do filme:"+this.exibirDuracaoEmHoras(getDuracaoMin())+"\n";
	}
	
}
