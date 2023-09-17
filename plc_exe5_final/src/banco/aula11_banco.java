package banco;
import conta.aula11_conta;

public class aula11_banco {
	private int index;
	private aula11_conta contas[] = new aula11_conta[1000];
	
	public aula11_banco() {
		for(int index=100; index > 0; index--) {
			contas[index] = new aula11_conta(index);
		}
		index = 100;
	}
	
	public int cadastrar() {
		contas[index] = new aula11_conta(index);
		return index;
	}
	
	public void creditar(double valor, int index) {
		contas[index].creditar(valor);
	}
	
	public void debitar(double valor, int index) {
		contas[index].debitar(valor);
	}
	
	public double getSaldo(int index) {
		return contas[index].getSaldo();
	}
}
