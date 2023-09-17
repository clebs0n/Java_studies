package Programa;
import Entities.Conta;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a qtd do depósito : ");
		double qtd = sc.nextDouble();
		System.out.println("Digite q qtd de saque");
		double rmv = sc.nextDouble();
		
		Conta conta = new Conta(123, 0);
		conta.creditar(qtd);
		System.out.println("Saldo pós deposito : " + conta.getSaldo());
		conta.debitar(rmv);
		System.out.println("Saldo após débitop : " + conta.getSaldo());
		
		sc.close();
	}

}
