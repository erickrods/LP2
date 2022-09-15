package principal;

import java.util.Scanner;

import modelo.*;

public class DemoPessoa {

	public static void main(String[] args) {
		int contPessoas = 0;
		int contFuncionarios = 0;
		int contChefe=0;
		int controle = 0;
		int quantMaxCad = 50;
		Pessoa[] pessoas = new Pessoa[quantMaxCad];
		Funcionario[] funcionarios = new Funcionario[quantMaxCad];
		ChefeDeDepartamento[] chefeDep = new ChefeDeDepartamento[quantMaxCad];
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("\nCADASTRAR");
			System.out.println("1 - Pessoa");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Chefe de Departamento");
			System.out.println("4 - Buscar departamento por chefe");
			System.out.println("5 - Imprimir listas");
			System.out.println("6 - Encerrar");
			controle=input.nextInt();
			switch (controle) {
				 case 1:
				   if (contPessoas+1>quantMaxCad) {
						System.out.println("Quantidade máxima de cadastros atingida.");	 
					}else {
						pessoas[contPessoas] = new Pessoa();
						Data data = new Data();
						input.nextLine();
					 	System.out.println("\nNome:");
						pessoas[contPessoas].setNome(input.nextLine());
						System.out.println("\nCPF:");
						pessoas[contPessoas].setCpf(input.nextLine());
						System.out.println("\nData de nascimento:");
						System.out.println("Dia:");
						data.setDia(input.nextInt());
						System.out.println("Mes:");
						data.setMes(input.nextInt());
						System.out.println("Ano:");
						data.setAno(input.nextInt());
						pessoas[contPessoas].setDtNasc(data);
						contPessoas++;
						}
				   break;
				 case 2:
					 int idCont=999;
					 if (contFuncionarios+1>quantMaxCad) {
							System.out.println("Quantidade máxima de cadastros atingida.");	
						}
						double salario=0;
						Pessoa pessoaAux = new Pessoa();
					 	Data dataAux = new Data();
					 	Data dataAux2 = new Data();
						 int id=0;
						 for (int k=0;k<contPessoas;k++) {
							System.out.println("\nid: "+id);
							System.out.println(pessoas[k]);
							id++;
						 }
						 System.out.println("\nID da pessoa cadastrada:");
						 idCont = input.nextInt();
						 if(idCont>=0 && idCont<contPessoas) {
						 	System.out.println("\nData de contratacao:");
							System.out.println("Dia:");
							dataAux.setDia(input.nextInt());
							System.out.println("Mes:");
							dataAux.setMes(input.nextInt());
							System.out.println("Ano:");
							dataAux.setAno(input.nextInt());
							System.out.println("\nSalário: ");
							salario = input.nextDouble();
							funcionarios[contFuncionarios]= new Funcionario(pessoas[idCont], dataAux, salario);
							contFuncionarios++;
						 }
					 break;
				 case 3:
					 int idChefe=0;
					 for (int k=0;k<contFuncionarios;k++) {
							System.out.println("\nid: "+k);
							System.out.println(funcionarios[k]);
						 }
					 System.out.println("\nID do funcionario cadastrado:");
					 idChefe = input.nextInt();
					 if(idChefe>=0 && idChefe<contFuncionarios) {
						 String dpto;
						 Data dataAuxx = new Data();
						 System.out.println("Nome do departamento:");
						 input.nextLine();
						 dpto = input.nextLine();
					 	 System.out.println("\nData da promoção:");
						 System.out.println("Dia:");
						 dataAuxx.setDia(input.nextInt());
						 System.out.println("Mes:");
						 dataAuxx.setMes(input.nextInt());
						 System.out.println("Ano:");
						 dataAuxx.setAno(input.nextInt());
						 chefeDep[contChefe] = new ChefeDeDepartamento(funcionarios[idChefe], dpto, dataAuxx);
						 contChefe++;
					 }else {
						 System.out.println("Opção inválida!");
					 }
					 break;
				 case 4:
					 int contFor=0;
					 String chefe;
					 input.nextLine();
					 System.out.println("\nNome do chefe: ");
					 chefe=input.nextLine();
					 for(int k=0;k<contChefe;k++) {
						 if (chefeDep[k].buscaChefe(chefe)) {
							 System.out.println("\n"+chefeDep[k]);
							 contFor++;
						 }
					 }
					 if (contFor==0) {
						 System.out.println("\nNenhum departamento sob responsabilidade de "+chefe);
					 }
					 break;
				 case 5:
					 System.out.println("########################PESSOAS########################");
					 for (int k=0;k<contPessoas;k++) {
							System.out.println(pessoas[k]);
							System.out.println();
						 }
					 System.out.println("######################FUNCIONARIOS#####################");
					 for (int k=0;k<contFuncionarios;k++) {
							System.out.println(funcionarios[k]);
							System.out.println();
						 }
					 System.out.println("#######################CHEFES###########################");
					 for (int k=0;k<contChefe;k++) {
							System.out.println(chefeDep[k]);
							System.out.println();
						 }
					 break;
				 case 6:
					 break;
				 default:
				   System.out.println("O número escolhido é inválido!");
			}
		} while(controle!=6);
		input.close();
	}
}
	
