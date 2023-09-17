package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(	"Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double limit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, limit);
		
		try {
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
		}
		
		catch(DomainException x) {
			System.out.println("Error: " + x.getMessage());
		}
		
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
