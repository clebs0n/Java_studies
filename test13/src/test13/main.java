package test13;

import java.util.Scanner;

public class main {

public static void main(String[] args) {
		int ini = 0, fim = 0, res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora de início e de fim: ");
		ini = sc.nextInt();
		fim = sc.nextInt();
		if (ini - fim == 0) {
			res = 24;
		} else if (ini > fim) {
			ini = ini - 12;
			fim = fim + 12;
			res = fim - ini;
		} else {
			res = fim - ini;
		}
		System.out.printf("O jogo durou %d horas.", res);
		sc.close();
	}

}
