package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int n=0;
	double helper=0, sum=0;
	
	System.out.println("Digite a quantidade de alturas:");
	n = sc.nextInt();
	
	for(int i=0; i<n; i++) {
		System.out.println("Digite sua altura: ");
		helper = sc.nextDouble();
		sum += helper;
	}
	
	double avg = sum/n;
	System.out.println(avg);
	sc.close();
	}

}
