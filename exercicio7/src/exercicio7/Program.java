package exercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import New.Dados;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int n=0;
	System.out.println("Digite o numero de funcionarios: ");
	n = sc.nextInt();
	
	List<String> list = new ArrayList<>();
	List<Integer> id = new ArrayList<>();
	List<Double> sal = new ArrayList<>();
	
	for(int i=0; i<n; i++) {
		
		System.out.println("Digite seu id: ");
		int idf = sc.nextInt();
		id.add(idf);
		sc.nextLine();
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		list.add(nome);
		
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();
		sal.add(salario);
		
		list.
		
	}
	
	
	
	sc.close();
	
	}
	
}

/* for(int k=0; k<3; k++) {
		
	System.out.println(id);	
	System.out.println(sal);
	System.out.println(list);
	} 
*/
