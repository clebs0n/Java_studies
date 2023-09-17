package New;

public class Dados {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double liq;
	
	public double NetSalary() {
		liq = GrossSalary - Tax;
		return liq;
	}
	
	public void IncreaseSalary(double percentage) {
		
	liq += GrossSalary*(percentage)/100;
		
	}
}
