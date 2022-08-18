package modelo;

public class Hora {
	private int hora;
	private int min;
	private int sec;
	public Hora(int hora, int min, int sec) {
		super();
		this.hora = hora;
		this.min = min;
		this.sec = sec;
	}
	public Hora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public boolean comparaHora(int hora, int min, int sec) {
		if (this.hora==hora && this.min==min && this.sec==sec) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return hora + ":" + min + ":" + sec;
	}
}

