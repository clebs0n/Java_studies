package test7;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = 0, area = 0, pi = 3.14159;
		System.out.println("Digite o valor do raio:");
		a = sc.nextDouble();
		area = pi * (a * a);
		System.out.printf("A área do círculo é de: %.4f%n", area);
		sc.close();
	}

}
