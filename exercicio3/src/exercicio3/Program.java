package exercicio3;

import java.util.Locale;
import java.util.Scanner;

import New.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student x = new Student();
		System.out.println("Digite seu nome: ");
		x.Nome = sc.nextLine();

		System.out.println("Digite sua 1� nota: ");
		x.Nota1 = sc.nextDouble();

		System.out.println("Digite sua 2� nota: ");
		x.Nota2 = sc.nextDouble();

		System.out.println("Digite sua 3� nota: ");
		x.Nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f\n", x.FinalGrade());

		if (x.FinalGrade() >= 60) {
			System.out.println("PASS:)");
		} else {
			System.out.printf("FAILED\nMISSING POINTS: %.2f", x.MissingPoints());

		}
		sc.close();

	}

}
