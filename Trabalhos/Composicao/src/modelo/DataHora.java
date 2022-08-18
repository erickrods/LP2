package modelo;

public class DataHora {
	private Data data;
	private Hora hora;
	public DataHora(int dia, int mes, int ano, int hora, int min, int sec) {
		super();
		this.data = new Data(dia,mes,ano);
		this.hora = new Hora(hora, min, sec);
	}
	public DataHora(int dia, int mes, int ano) {
		super();
		this.data = new Data(dia,mes,ano);
		this.hora = new Hora(00,00,00);
	}
	@Override
	public String toString() {
		return data+" "+hora;
	}
	
}
