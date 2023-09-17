package test23;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double a = 0, b = 0, c = 0, res = 0;
		System.out.println("Digite o numero de casos: ");
		num = sc.nextInt();
		System.out.println("Digite os valores:");
		for (int i = 0; i < num; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			res = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("%.2f\n", res);
		}
		sc.close();
	}

}
