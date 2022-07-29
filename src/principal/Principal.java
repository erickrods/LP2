package principal;
import dadosFuncionarios.Funcionario;
public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		f1.funcionarios("Erick",2456.40,"187.862.862-40",2021);
		f2.funcionarios("Fernando",1000,"182.572.952-10",2016);

		//Aumenta salário em 30%
		System.out.println("\nPré acréscimo: " +f1);
		f1.aumentaSalario(30);
		System.out.println("\nApós acréscimo: "+f1);
		
		//Aumenta salário em 45%
		System.out.println("\nPré acréscimo: "+f2);
		f2.aumentaSalario(45);
		System.out.println("\nApós acréscimo: "+f2);
		
		
		
		System.out.println("\nGetters f1:");
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		System.out.println(f1.getAnoContratacao());
		
		System.out.println();
		
		System.out.println("\nGetters f2:");
		System.out.println(f2.getNome());
		System.out.println(f2.getCpf());
		System.out.println(f2.getSalario());
		System.out.println(f2.getAnoContratacao());

		// TODO Auto-generated method stub
	}

}
