package principal;
import java.util.*;
import dados.Clientes;
public class Main {

	public static void main(String[] args) {
		String nomeBusca;
		int controleCondicao=0;
		int i=0;
		int controle = 0;
		int quant =50;
		Clientes[] clientes;
		clientes = new Clientes[quant];
		for (int h=0;h<50;h++) {
			clientes[h] = new Clientes();
		}
		Scanner sc = new Scanner(System.in);
		while (controle!=4) {
				System.out.println("1 - Cadastrar");
				System.out.println("2 - Buscar por cliente");
				System.out.println("3 - Exibir dados");
				System.out.println("4 - Sair");
				controle = sc.nextInt();
		
				if (controle==1) {
					if (i>=50) {
						System.out.println("Quantidade máxima de cadastro atingida.");
					}else {
						clientes[i] = new Clientes();
						System.out.print("\nCódigo:");
						clientes[i].setCodigo(sc.nextInt());
						System.out.print("\nNome:");
						clientes[i].setNome(sc.next());
						System.out.print("\nCPF:");
						clientes[i].setCpf(sc.next());
						System.out.print("\nTelefone:");
						clientes[i].setTelefone(sc.next());
						i++;
					}
				}else if (controle==2) {
					System.out.println("Entre com o nome:");
					nomeBusca = sc.next();
					for(int j=0;j<clientes.length;j++) {
						if(clientes[j].getNome().equals(nomeBusca)) {
							System.out.println("Dados atrelados ao nome:");
							System.out.println(clientes[j]);
							System.out.println();
							controleCondicao++;
							break;
						}else if(controleCondicao==0) {
							System.out.println("Nome não encontrado");
						}
					}
					
				}else if (controle==3) {
					for(int k=0;k<i;k++)
					{
						System.out.println(clientes[k]);
					}
					
				}else if (controle>4 | controle <1) {
					System.out.println("Opção inválida");
				}
				
				}
		
	}
		
		
}

