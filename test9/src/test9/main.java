package test9;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	double valor1=0, valor2=0, total=0;
	int num1=0, num2=0;
	System.out.println("Digite o c�digo da pe�a 1: ");
	sc.nextInt();
	System.out.println("Digite o numeros de pe�as: ");
	num1 = sc.nextInt();
	System.out.println("Digite o valor de cada pe�a: ");
	valor1 = sc.nextDouble();
	
	///----------------------------------------------///
	
	System.out.println("Digite o c�digo da pe�a 2: ");
	sc.nextInt();
	System.out.println("Digite o numeros de pe�as: ");
	num2 = sc.nextInt();
	System.out.println("Digite o valor de cada pe�a: ");
	valor2 = sc.nextDouble();
	
	total = num1*valor1 + num2*valor2;
	
	System.out.printf("O valor total � de: R$ %.2f%n", total);
	sc.close();
	}

}
