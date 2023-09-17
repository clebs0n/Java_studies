package test16;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, y = 0;
		String helper=null;
		System.out.println("Digite duas coordenadas em sequência:)");
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (x > 0 && y > 0) {
			helper = "Q1";
		} else if (x < 0 && y > 0) {
			helper = "Q2";
		} else if (x < 0 && y < 0) {
			helper = "Q3";
		} else if (x==0 && y==0) {
			helper = "ORIGEM";
		} else {
			helper = "Q4";
		}
		System.out.println(helper);
		sc.close();
	}

}
