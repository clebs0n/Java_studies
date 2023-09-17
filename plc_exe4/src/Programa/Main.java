package Programa;
import Conta_Poup.Poupanca;

public class Main {

	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca(1, 0.0);
		poupanca.creditar(500.87);
		poupanca.debitar(45.00);
		
		System.out.println("Saldo : " + poupanca.getSaldo());
		poupanca.renderJuros(0.54);
		System.out.println("Saldo : " + poupanca.getSaldo());
	}

}
