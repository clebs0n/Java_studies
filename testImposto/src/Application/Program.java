package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.CompanyTax;
import Entities.IndividualTax;
import Entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers: ");
		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.printf("Tax payer #%d data: ", i + 1);
			System.out.println("Individual or Company (i/c)? ");
			char aswr = sc.next().charAt(0);
			sc.nextLine();

			if (aswr == 'i') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Anual income: ");
				double income = sc.nextDouble();
				System.out.println("Health Expenditures: ");
				double expenditures = sc.nextDouble();
				list.add(new IndividualTax(name, income, expenditures));
			}
			
			if(aswr == 'c') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Anual income: ");
				double income = sc.nextDouble();
				System.out.println("Number of employees: ");
				int number = sc.nextInt();
				sc.nextLine();
				list.add(new CompanyTax(name, income, number));
			}
		}
		
		System.out.println("TAXES PAID: ");
		
		for(TaxPayer payer : list) {
			System.out.println(payer.print());
		}
		
		double total = 0;
		for(TaxPayer x : list) {
			total += x.tax();
		}
		
		System.out.println(total);
		
		sc.close();
	}

}
