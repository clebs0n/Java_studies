package Entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct(){
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		double sum = getPrice() + getCustomsFee();
		return sum;
	}
	
	@Override
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" - ");
		sb.append(totalPrice() + " ");
		sb.append("(Customs fee: ");
		sb.append("$ " + getCustomsFee() + ")");
		
		return sb.toString();
	}
	

}
