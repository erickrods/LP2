package principal;
import java.util.Scanner;

import dados.Fatura;
public class FaturaTeste {

	public static void main(String[] args) {
		int quant,numero;
		String descricao;
		double preco;
		Fatura fatura1 = new Fatura();
		Fatura fatura2 = new Fatura();
		Scanner input = new Scanner(System.in);
		System.out.print("\nEntre com o Numero:");
		fatura1.setNumero(input.nextInt());
		//numero = input.nextInt();
		input.nextLine();
		System.out.print("\nEntre com a descricao:");
		fatura1.setDescricao(input.nextLine());
		//input.nextLine();//Flush???
		System.out.print("\nEntre com a quantidade:");
		fatura1.setQuant(input.nextInt());
		//quant = input.nextInt();
		input.nextLine();
		System.out.print("\nEntre com o Preco:");
		fatura1.setPreco(input.nextDouble());
		//preco = input.nextDouble();  // ao inves de criar direto no construtor, estou usando setter 
		input.nextLine();		
		System.out.print(fatura1);
		
		System.out.print("\nEntre com o Numero:");
		fatura2.setNumero(input.nextInt());
		input.nextLine();
		System.out.print("\nEntre com a descricao:");
		fatura2.setDescricao(input.nextLine());
		//input.nextLine();//Flush???
		System.out.print("\nEntre com a quantidade:");
		fatura2.setQuant(input.nextInt());
		input.nextLine();
		System.out.print("\nEntre com o Preco:");
		fatura2.setPreco(input.nextDouble());		
		System.out.print(fatura2);

	}

}
