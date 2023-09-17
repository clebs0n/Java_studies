package Entities;

public class IndividualTax extends TaxPayer{
	
	private Double healthExpenditures;
	
	public IndividualTax() {
	}

	public IndividualTax(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		double total = 0;
		if(getAnualIncome()<20000) {
			if(getHealthExpenditures()>0) {
				total = (getAnualIncome()*0.15) - (0.5 * getHealthExpenditures());
				return total;
			}else{
			total = (getAnualIncome()*0.15);
			return total;
			}
		}
		if(getAnualIncome()>=20000) {
			if(getHealthExpenditures()>0) {
				total = getAnualIncome() * 0.25 - (0.5 * getHealthExpenditures());
			}else {
			total = (getAnualIncome()*0.25);
			return total;
			}
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
