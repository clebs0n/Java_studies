package entities;

public class Dados {

	public String nome;
	private int num;
	private double saldo;

	public Dados() {
	}

	public Dados(String nome, double saldo, int num) {
		this.nome = nome;
		this.saldo = saldo;
		this.num = num;
	}

	public Dados(String nome, int num) {
		this.nome = nome;
		this.num = num;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public void setSaldoN(double saldon) {
		this.saldo = saldo - saldon - 5 ;
	}

	public String toString() {
		return "\n |Conta Nº: " + num + "\n |Nome: " + nome + "\n |Saldo: R$ " + getSaldo();
	}
}