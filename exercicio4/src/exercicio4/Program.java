package exercicio4;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {

		double valor;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Dados x;

		System.out.println("Digite o numero da conta: ");
		int num = sc.nextInt();
		System.out.println("Digite o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.println("Será depositado um valor inicial? (s/n)");
		char helper = sc.next().charAt(0);
		if (helper == 's') {
			System.out.println("Digite o valor inicial: ");
			valor = sc.nextDouble();

			x = new Dados(nome, valor, num);

		} else {

			x = new Dados(nome, num);

		}

		System.out.println("\nDados atualidos da conta: \n" + x.toString());

		System.out.println("\nDigite um valor para depósito: ");
		double saldo = sc.nextDouble();
		x.setSaldo(saldo);
		System.out.println("\nDados atualizados da conta: \n" + x.toString());

		System.out.println("\nDigite um valor para saque: ");
		double saldon = sc.nextDouble();
		x.setSaldoN(saldon);
		System.out.println("\nDados atualizados da conta: " + x.toString());
		sc.close();
	}

}
