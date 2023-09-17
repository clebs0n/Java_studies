package conta;

public class aula11_conta {
	private int numero;
	private double saldo;
	
	public aula11_conta(int numero){
		this.numero = numero;
		saldo = 0;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		saldo = saldo - valor;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
