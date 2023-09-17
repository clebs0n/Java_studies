package test24;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double res = 0, a = 0, b = 0;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		System.out.println("Digite os pares: ");
		for (int i = 0; i < num; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			res = a / b;
			if (b == 0) {
				System.out.println("Divisal impossível");
			} else {
				System.out.printf("%.1f\n", res);
			}
		}

	}

}
