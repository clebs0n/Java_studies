package test17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double renda = 0, imp = 0, helper = 0;
		System.out.println("Digite sua renda: ");
		renda = sc.nextDouble();

		if (renda >= 0.00 && renda <= 2000.00) {
			System.out.println("Isento:)");
		} else if (renda > 2000.00 && renda <= 3000.00) {
			helper = renda - 2000.00;
			imp = helper * 0.08;
		} else if (renda > 3000.00 && renda < 4500.00) {
			helper = renda - 3000.00;
			imp = (helper * 0.18) + 80;
		} else if (renda > 4500.00) {
			helper = renda - 4500.00;
			imp = (helper * 0.28) + 350;

		} else {
			System.out.println("Valor inválido:)");
		}

		if (renda > 0) {
			System.out.printf("R$ : %.2f", imp);
			sc.close();
		}

	}

}
