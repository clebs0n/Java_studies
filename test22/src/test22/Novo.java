package test22;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = 0, i = 0, in = 0, out = 0, helper = 0;
			System.out.println("Digite um número");
			num = sc.nextInt();
			System.out.println("Digite outros números: ");
			for (i = 0; i < num; i++) {
				helper = sc.nextInt();
				if (helper >= 10 && helper <= 20) {
					in += 1;
				} else {
					out += 1; 
				}
			}
			System.out.printf("In: %d\nOut: %d\n", in, out);
			sc.close();
		}
	}

}
