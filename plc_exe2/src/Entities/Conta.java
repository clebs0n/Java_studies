package Entities;

public class Conta {
	private int numero;
	private double saldo;
	
	public Conta() {}
	
	public Conta(int numero, int saldo) {
		this.saldo = saldo;
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void creditar(double qtd) {
		this.saldo = this.saldo + qtd;
	}
	
	public void debitar(double qtd) {
		this.saldo = this.saldo - qtd;
	}
	
	
}
