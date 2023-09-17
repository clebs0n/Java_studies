package test21;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int helper = 0, i = 0, aux = 1;
		System.out.println("Digite um número entre 0 e 1000: ");
		helper = sc.nextInt();
		if (helper >= 1 && helper <= 1000) {
			for (i = 1; i <= helper; i += 2) {
				System.out.println(aux);
				aux += 2;
			}
		}
	}
}
