package test15;

import java.util.Scanner;

public class novo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double helper = 0;
		System.out.println("Digite um valor qualquer entre 0 e 100:)");
		helper = sc.nextDouble();
		if (helper < 0 || helper > 100) {
			System.out.println("Fora do intervalo");
		} else if (helper <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (helper <= 50) {
			System.out.println("Intervalo [25,50]");
		} else if (helper <= 75) {
			System.out.println("Intervalo [50,75]");
		} else if (helper <= 100) {
			System.out.println("Intervalo [75,100]");
			
		}
		sc.close();
	}

}
