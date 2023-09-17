package Test;

import java.util.Locale;
import java.util.Scanner;

import exercicio1.Retangulo;

public class Novo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Digite a largura e comprimento");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f\nPerimetro: %.2f\nDiagonal: %.2f\n"
				, x.Area(), x.Perimetro(), x.Diagonal());
		
		sc.close();
	}

}
