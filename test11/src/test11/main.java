package test11;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.print("n�mero par");
		}else {
			System.out.println("N�mero impar");
		}
		sc.close();
	}

}
