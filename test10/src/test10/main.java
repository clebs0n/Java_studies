package test10;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		if(num<0) {
			System.out.print("número negativo");
		}else if(num ==0 ){
			System.out.print("Zero");
		}else{
			System.out.println("Número positivo");
		}
		sc.close();
	}

}
