package test20;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, helper = 0;
		System.out.println("Digite o tipo de combustível: ");
		helper = sc.nextInt();
		while (helper != 4) {
			if (helper == 1) {
				a += 1;
			} else if (helper == 2) {
				b += 1;
			} else if (helper == 3) {
				c += 1;
			}
			helper = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO!\n\n" + "Alcool: %d\nGasolina: %d\nDiesel: %d\n", a, b, c);
	}
}