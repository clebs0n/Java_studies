package conta_poup;
import conta.aula11_conta;

public class aula11_conta_poup extends aula11_conta {
	public aula11_conta_poup(int numero){
		super(numero);
	}
	
	public void renderJuros(double taxa) {
		double juros = taxa * this.getSaldo();
		creditar(juros);
	}
}
