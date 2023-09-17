package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class HeightVec {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de alturas:");
		int n = sc.nextInt();
		double[] vnomes = new double[n];
		
		for(int i=0; i<n; i++) {
			vnomes[i] = sc.nextDouble();
		}
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += vnomes[i];
		}
		
		double avg = sum/n;
		System.out.println(avg);

		sc.close();
	}

}
