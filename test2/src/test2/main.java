package test2;

public class main {

	public static void main(String[] args) {
	
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.printf("%nProducts: %s, which price is $ %.1f%n"
			+ "%s, which price is $ %.2f%n"
			+ "%nRecord: %d years old, code %d, and gender: %c%n", product1,
			price1, product2, price2, 
			age, code, gender);
	
	System.out.printf("Measure: %.8f%n"
			+ "Rouded: %.3f%n", measure, measure);
		

	}

}
