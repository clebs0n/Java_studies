package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Double price = null;
		String name = null;
		
		for(int i=0; i<num; i++) {
			System.out.printf("Product #%d data: ", i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char aswr = sc.next().charAt(0);
			sc.nextLine();
			if(aswr == 'i') {
				System.out.print("Name: ");
				name = sc.nextLine();
				
				System.out.print("Price: ");
				price = sc.nextDouble();
				
				System.out.print("Customs Fee: ");
				double fee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, fee));
			}
			
			if(aswr == 'c') {
				
				System.out.print("Name: ");
				name = sc.nextLine();
				
				System.out.print("Price: ");
				price = sc.nextDouble();
				
				list.add(new Product(name , price));
			}
			
			if(aswr == 'u') {
				
				System.out.print("Name: ");
				name = sc.nextLine();
				
				System.out.print("Price: ");
				price = sc.nextDouble();
				
				System.out.print("Manufacture Date: ");
				Date date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, date));
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
