package Principal;
import java.util.*;

import dados.Cliente;
public class main {

	public static void main(String[] args) {
		int i=0;
		int controle = 0;
		
		Scanner sc = new Scanner(System.in);
		Cliente[] cliente;

		/**System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar por cliente");
		System.out.println("3 - Exibir dados");
		System.out.println("4 - Sair");**/
		//sc.nextInt(0);
		while (controle != 4) {
			controle=sc.nextInt();
		//Scanner sc = new Scanner(System.in);
		//Cliente[] cliente;
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Buscar por cliente");
			System.out.println("3 - Exibir dados");
			System.out.println("4 - Sair");
			if (sc.nextInt()==1) {
			cliente = new Cliente[i];
			System.out.println("\nCódigo:");
			cliente[i].setCodigo(sc.nextInt());
			System.out.println("\nNome:");
			cliente[i].setNome(sc.nextLine());
			System.out.println("\nCPF:");
			cliente[i].setCpf(sc.nextLine());
			System.out.println("\nTelefone:");
			cliente[i].setTelefone(sc.nextInt());
	
			
			}else if (sc.nextInt()==2) {
				
			}else if (sc.nextInt()==3) {
				
			}else
				break;
			}
		

		/**int produto []= {1,2,3,4,6,7,8,9,11,22,33,44};
		Scanner sc = new Scanner(System.in);
		System.out.println(produto);
		int i =0;
		for (i=0;i<produto.length;i++)
			System.out.print(produto[i]);**/
		

		// TODO Auto-generated method stub

	}

}
