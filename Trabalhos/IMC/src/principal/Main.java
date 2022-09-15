package principal;

import java.util.Scanner;
import modelo.*;


public class Main {

	public static void main(String[] args) {
		int quantMaxCad=0;
		int contCadastrosMulher=0;
		int controle = 0;
		int contCadastroHomem = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\nQuantos cadastros deseja fazer?");
		quantMaxCad = input.nextInt();
		Homem[] homens = new Homem[quantMaxCad];
		Mulher[] mulheres = new Mulher[quantMaxCad];
		do{
			System.out.println("\nCADASTRAR");
			System.out.println("1 - Homem");
			System.out.println("2 - Mulher");
			System.out.println("3 - Encerrar");
			controle = input.nextInt();
			switch (controle) {
				 case 1:
				   
				if (contCadastroHomem+1>quantMaxCad) {
						System.out.println("Quantidade máxima de cadastros atingida.");	 
					}else {
						Data data = new Data();
						input.nextLine();
					 	System.out.println("\nNome:");
					 	String nome = input.nextLine();
					 	System.out.println("\nData de nascimento:");
						System.out.println("Dia:");
						data.setDia(input.nextInt());
						System.out.println("Mes:");
						data.setMes(input.nextInt());
						System.out.println("Ano:");
						data.setAno(input.nextInt());
						System.out.println("\nPeso:");
						double peso = input.nextDouble();
						System.out.println("\nAltura:");
						double altura = input.nextDouble();
						homens[contCadastroHomem] = new Homem(nome, data, peso, altura);
						contCadastroHomem++;
						}
				   break;
				 case 2:
						if (contCadastrosMulher+1>quantMaxCad) {
							System.out.println("Quantidade máxima de cadastros atingida.");	 
						}else {
							Data data = new Data();
							input.nextLine();
						 	System.out.println("\nNome:");
						 	String nome = input.nextLine();
						 	System.out.println("\nData de nascimento:");
							System.out.println("Dia:");
							data.setDia(input.nextInt());
							System.out.println("Mes:");
							data.setMes(input.nextInt());
							System.out.println("Ano:");
							data.setAno(input.nextInt());
							System.out.println("\nPeso:");
							double peso = input.nextDouble();
							System.out.println("\nAltura:");
							double altura = input.nextDouble();
							mulheres[contCadastrosMulher] = new Mulher(nome, data, peso, altura);
							contCadastrosMulher++;
							}
					 break;
				 case 3:
					 System.out.println("===========MULHERES=========");
					 for (int i=0;i<contCadastrosMulher;i++) {
						 System.out.println(mulheres[i]);
						 mulheres[i].resultIMC();
					 }
					 System.out.println("===========HOMENS=========");
					 for (int i=0;i<contCadastroHomem;i++) {
						 System.out.println(homens[i]);
						 homens[i].resultIMC();
					 }
					 break;
				 default:
				   System.out.println("O número escolhido é inválido!");
			}
		} while(controle!=3);
		input.close();
	}

}
