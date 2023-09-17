package test3;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		char v;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		v = sc.next().charAt(2);
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n", z);
		System.out.print(v);
		sc.close();

	}

}
