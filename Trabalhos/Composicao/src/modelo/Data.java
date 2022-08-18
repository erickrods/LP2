package modelo;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean comparaData(int dia,int mes, int ano) {
		if (this.dia==dia && this.mes==mes && this.ano==ano) {
			return true;
		}
		return false;	
	}
	@Override
	public String toString() {
		return dia + "/" + mes + "/"+ ano ;
	}
	
	}
