package principal;

import java.util.Scanner;
import modelo.Diretor;
import modelo.Filme;

public class TestarFilme {

	public static void main(String[] args) {
		int controle;
		int contArray=0;
		Scanner input = new Scanner(System.in);
		System.out.println("\nQuantidade de filmes a cadastrar");
		int quantFilmes = input.nextInt();
		Filme[] filmes = new Filme[quantFilmes];
		do{
			System.out.println("\n1 - Cadastrar Filme");
			System.out.println("2 - Pesquisar por titulo");
			System.out.println("3 - Sair");
			controle = input.nextInt();
			switch (controle) {
				 case 1:
				   if (contArray+1>quantFilmes) {
						System.out.println("Quantidade máxima de cadastros atingida.");	 
					}else {
						filmes[contArray] = new Filme();
						Diretor diretor = new Diretor();
						input.nextLine();
						System.out.print("\nTitulo:");
						filmes[contArray].setTitulo(input.nextLine());
						//input.nextLine();
						System.out.print("\nDescricao:");
						filmes[contArray].setDescricao(input.nextLine());
						System.out.print("\nDuracao do filme:");
						filmes[contArray].setDuracaoMin(input.nextInt());
						input.nextLine();
						System.out.print("\nDiretor:");
						diretor.setNome(input.nextLine());
						System.out.print("\nAnos de experiencia do diretor:");
						diretor.setExp(input.nextInt());
						input.nextLine();
						System.out.print("\nOrigem do diretor:");
						diretor.setOrigem(input.nextLine());
						filmes[contArray].setDiretor(diretor);
						contArray++;
						break;
					}
				   break;
				 case 2:
					 String comparaTitulo;
					 input.nextLine();
					 System.out.print("\nTitulo a ser procurado:");
					 comparaTitulo = input.nextLine();
					 int contTitulo=0;
					 for (int h=0;h<contArray;h++) {
						 if (filmes[h].comparaTitulo(comparaTitulo)) {
							 System.out.print(filmes[h]);
							 contTitulo++;
						 }
					 }
					 if (contTitulo==0) {
						 System.out.print("\nNenhum filme com esse titulo!");
					 }
					 break;
				 case 3:
					 input.close();
					 for(int v=0;v<contArray;v++) {
							System.out.print("\n"+filmes[v].exibirDuracaoEmHoras(filmes[v].getDuracaoMin()));
						}
					 break;
				 default:
				   System.out.println("O número escolhido é inválido!");
			}
		} while(controle!=3);// && j!=0);
	}

}
