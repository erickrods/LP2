package principal;

import java.util.Scanner;

import modelo.Diretor;

public class TestarFilme {

	public static void main(String[] args) {
		int controle;
		int contArray=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantidade de filmes a cadastrar");
		int quantFilmes = input.nextInt();
		
		do{
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Comparar duração de voo");
			System.out.println("3 - Comparar origem");
			System.out.println("4 - Sair");
			controle = input.nextInt();
			switch (controle) {
				 case 1:
				   if (contArray>quantFilmes) {
						System.out.println("Quantidade máxima de cadastro atingida.");
					}else {
						voo[contArray] = new Voo(entry, null, null, entry, entry);
						System.out.print("\nCódigo:");
						voo[contArray].setCodigo(input.nextInt());
						input.nextLine();
						System.out.print("\nOrigem:");
						voo[contArray].setOrigem(input.nextLine());
						System.out.print("\nDuracao do voo:");
						voo[contArray].setTempoDeVoo(input.nextInt());
						input.nextLine();
						System.out.print("\nDestino:");
						voo[contArray].setDestino(input.nextLine());
						System.out.print("\nQuantidade de passageiros:");
						voo[contArray].setQuant(input.nextInt());
						contArray++;
						System.out.println(voo[contArray-1]);
						break;
					}
				 case 2: 
					 break;
				 case 3:
					
				 case 4:
					break;
				 default:
				   System.out.println("O número escolhido é inválido!");
			   }
		} while(controle!=4);
		// TODO Auto-generated method stub

	}

}
