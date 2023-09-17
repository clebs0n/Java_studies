package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o numero de produtos: ");
	int n = sc.nextInt();
	
	double[] vprod = new double[n]; 
	
	for(int i=0; i<vprod.length; i++) {
	
		System.out.println("Digite nome e preço");
		sc.next();
		vprod[i] = sc.nextDouble();
	}
	
	double sum=0; 
	for(int i=0; i<vprod.length; i++) {
		sum += vprod[i];	
	}
	double avg = sum/n;
	System.out.println(avg);
	sc.close();
}
}
