package test14;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod = 0, amt = 0;
		double price = 0;

		System.out.println("Digite o código do produto\n\n1 - Cachorro Quente \n"
				+ "2 - X-Salada \n3 - X-Bacon \n4 - Torrada simples \n5 - Refrigerante");
		
		cod = sc.nextInt();
		
		if(cod>0 && cod<6) {
		System.out.println("\nAgora digite a quantidade:");
		amt = sc.nextInt();
		}
		switch (cod) {
		
		case 1:
			price = amt * 4.00;
			break;

		case 2:
			price = amt * 4.50;
			break;

		case 3:
			price = amt * 5.00;
			break;
			
		case 4:
			price = amt * 2.00;
			break;
			
		case 5:
			price = amt * 1.50;
			break;
		
		default:
			System.out.println("Valor inválido");
			break;
		}
		if(cod>0 && cod<6) {
		System.out.printf("Preço Final: %.2f", price);
		sc.close();
		}
	}

}
