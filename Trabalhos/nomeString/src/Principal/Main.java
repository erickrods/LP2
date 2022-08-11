package Principal;

import java.util.Scanner;

import nomes.NomeString;

public class Main {

	public static void main(String[] args) {
		String nome1;// = null;
		String nome2;// = null;
		String nome3;// = null;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Entre com o primeiro nome:");
		nome1 = input.next();
		System.out.print("Entre com o segundo nome:");
		nome2 = input.next();
		System.out.print("Entre com o terceiro nome:");
		nome3 = input.next();
		NomeString nomes = new NomeString(nome1, nome2, nome3);
		System.out.println(nomes.rubrica(nome1, nome2, nome3));
		System.out.println(nomes.assinatura());


		

		

	}

}
