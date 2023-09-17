package Entities;

public class Product {

	private String texto;
	private double valor;
	private int qnt;
	
	public Product() {}
	
	public Product(String texto, double valor, int qnt) {
		this.texto = texto;
		this.valor = valor;
		this.qnt = qnt;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	
}
