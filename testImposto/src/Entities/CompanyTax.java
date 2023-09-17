package Entities;

public class CompanyTax extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	public CompanyTax() {
	}
	
	public CompanyTax(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double tax() {
		double total = 0;
		if(getNumberOfEmployees()>10) {
			total = getAnualIncome()*0.14;
			return total;
		}else{
			total = getAnualIncome()*0.16;
		}
		return total;
	}
	
	@Override
	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(": $ ");
		sb.append(tax());
		
		return sb.toString();
	}
}
