package principal;
import java.util.Scanner;
import stringUtils.StringUtilsLista;

public class Main {

	public static void main(String[] args) {
		String nome1;// = null;
		int quant;
		char letra;
		String palavra;
		Scanner input = new Scanner(System.in);
		System.out.print("Entre com a palavra a ser repetida:");
		palavra = input.next();
		System.out.print("Numero de repeticoes:");
		quant = input.nextInt();
		System.out.print("Entre com o nome:");
		nome1 = input.next();
		System.out.print("Letra a comparar:");
		letra = input.next().charAt(0);
		StringUtilsLista.repetir(palavra,quant);
		StringUtilsLista.contaRepeticao(nome1,letra);


	}

}
