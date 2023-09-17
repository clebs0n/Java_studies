package test27;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=0;
    System.out.println("Digite um número: ");
    num = sc.nextInt();
    sc.close();
    for(int i=1; i<=num; i++) {
    	System.out.printf("%d %d %d\n", i, i*i, i*i*i);
    }
    
	}

}
