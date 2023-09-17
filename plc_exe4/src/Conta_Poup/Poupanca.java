package Conta_Poup;
import Entidades.Conta;

public class Poupanca extends Conta {
	public Poupanca (int numero, double saldo) {
		super(numero, saldo);
	}
	
	public void renderJuros(double taxa) {
		double juros = this.getSaldo() * taxa;
		creditar(juros);
	}
}
