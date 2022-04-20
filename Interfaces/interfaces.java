
1 - Veloz(Carro, Humano, Bala)
		velAtingida (Calcular a velocidade atingida.)
		caloriaEmpregada (Calcular a quantidade de energia necessaria para atingir tal velocidade.)
public interface veloz{
	public int velMedia(int distanciaPercorrida,int tempo);
	public int caloriaEmpregada(float massa, int velMedia);
}
public class Carro implements veloz {
	public int velMedia(int distanciaPercorrida, int tempo) {
		//Calculos para definir a veolcidade alcançada 
		return velocidadeMedia;
	}

	public int caloriaEmpregada(float massa, int velMedia) {
		//Calculos para determinar energia necessaria para atingir tal velocidade
		return calorias;
	}
}
public class Humano implements veloz{
	public int velMedia(int distanciaPercorrida, int tempo){
		//Calculos para definir a veolcidade alcançada 
		return velocidadeMedia;
	}
	public int caloriaEmpregada(float massa, int velMedia){
		//Calculos para determinar energia necessarias para atingir tal velocidade
		return calorias;
	}
}
public class Bala implements veloz {
	public int velMedia(int distanciaPercorrida, int tempo) {
		//Calculos para definir a veolcidade alcançada 
		return velocidadeMedia;
	}
	public int caloriaEmpregada(float massa, int velMedia) {
		//Calculos para determinar energia necessaria para atingir tal velocidade
		return calorias;
	}
}

2 - Dimensional(Apartamento, Armario, Geladeira)
		areaInterna(Calcula e retorna area interna do objeto.)
		compartimentos(Coletar nome dos diferentes ambientes do objeto.)
public interface Dimensional{
	public int areaInterna();
	public String compartimentos(); 		
}
public class Apartamento implements Dimensional{
	public int areaInterna(){
		//Calculos para definir a area interna do apartamento e retornar valor encontrado. 
		return area;
	}
	public int compartimentos(){
		String ambientes = new String[6];
		//Coleta o nome dos ambientes...  sala de jantar, quarto, Banheiro, etc...
		return ambientes;
	}
}
public class Armario implements Dimensional{
	public int areaInterna(){
		//Calculos para definir a area interna do armario e retornar valor encontrado. 
		return area;
	}
	public int compartimentos(){
		String ambientes = new String[6];
		//Coleta o nome dos ambientes... gavetas, cabideiros, sala de jantar, quarto, gaveta de legumes, congelador, etc...
		return ambientes;
	}
}
public class Geladeira implements Dimensional{
	public int areaInterna(){
		//Calculos para definir a area interna da geladeira e retornar valor encontrado. 
		return area;
	}
	public int compartimentos(){
		String ambientes = new String[6];
		//Coleta o nome dos ambientes... gaveta de legumes, congelador, etc...
		return ambientes;
	}
}