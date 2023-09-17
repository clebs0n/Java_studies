package test12;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	int num1=0, num2=0, helper=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite dois numeros em sequencia:)");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	if(num2>num1) {
		helper=num1;
		num1=num2;
		num2=helper;
	}
	if(num1%num2!=0) {
		System.out.println("Não são múltiplos:)");
	}else{
	System.out.println("São múltiplos:)");
	}
	sc.close();
	}

}
