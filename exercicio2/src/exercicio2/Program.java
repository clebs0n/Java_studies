package exercicio2;

import java.util.Scanner;

import New.Dados;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Dados x;
		x = new Dados();

		System.out.println("Digite seu nome:");
		x.Name = sc.nextLine();

		System.out.println("Digite seu salário bruto:");
		x.GrossSalary = sc.nextDouble();

		System.out.println("Digite o imposto:");
		x.Tax = sc.nextDouble();

		System.out.printf("\nNome: %s\n" + "Salário Líquido: "+ x.NetSalary()+"\n" 
				,x.Name);

		System.out.println("\nDigite uma porcentagem de aumento: ");
		
		double percentage = sc.nextDouble();
		x.IncreaseSalary(percentage);
		
		System.out.printf("Dados atualizados:\nNome: %s\nSalário: %.2f", x.Name, x.liq);
		
		sc.close();
	}

}


