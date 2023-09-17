package exercicio6;

import java.util.Locale;
import java.util.Scanner;

import entidades.Dados;

public class Users {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = 0, n = 0;
		System.out.println("Quantos quartos serão alugados? MAX:10");
		n = sc.nextInt();
		if (n > 10 || n < 1) {
			while (n > 10 || n < 1) {
				System.out.println("Digite um valor válido");
				n = sc.nextInt();
			}
		}
		sc.nextLine();
		Dados[] dados = new Dados[10];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o seu nome:");
			String nome = sc.nextLine();
			System.out.println("Digite seu email");
			String email = sc.nextLine();
			System.out.println("Digite o numero do quarto:");
			num = sc.nextInt();
			sc.nextLine();
			dados[num] = new Dados(nome, email, num);
			dados[num].setNumber(i);
		}

		for (int i = 0; i < 10; i++) {
			if (dados[i] != null) {
				System.out.println(dados[i].toString());
			}
		}

		sc.close();
	}

}
