package Bank;
import Entidades.Conta;

public class Banco {
	private Conta[] contas;
	private int indice;

	public Banco() {}
	public void cadastrarConta(Conta c) {
		contas[indice] = c;
		indice = indice + 1;
	}
	
public void creditarConta(String numero, double valor) {}

}