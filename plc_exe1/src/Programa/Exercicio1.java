package Programa;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome : ");
		String nome = sc.nextLine();
		
		System.out.println("O Nome completo é : " + nome);
		
		int len = nome.length();
		
		System.out.print("Primeiro nome : ");
		for(int i=0; i < len; i++) {
			System.out.print(nome.charAt(i));
			if(nome.charAt(i) == 32) {
				i = len;
			}
		}
		
		System.out.println();
		
		System.out.print("Segundo nome : ");
		
		for(int i=(len-1), k=0; i > 0; i--) {
			k++;
			if(nome.charAt(i) == 32 && k != 2) {
				for(int j=i+1; j < len; j++) {
					System.out.print(nome.charAt(j));
				}
				i = 0;
			}
		}
		
		sc.close();
	}

}
