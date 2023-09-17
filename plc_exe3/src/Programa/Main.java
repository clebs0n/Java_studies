package Programa;
import Entities.Product;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a descrição do produto : ");
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		System.out.println("Quantidade : ");
		int qtd = sc.nextInt();
		System.out.println("Valor unitário : ");
		double valor = sc.nextDouble();
		
		Product prod = new Product(test, valor, qtd);
		
		System.out.println("Dados : \n- Descrição : " + prod.getTexto() + "\n- Valor : " + prod.getValor()
		+ "\n- Quantidade : " + prod.getQnt());
		
		System.out.println("Deseja alterar algo ? \n 1 - Sim\n 2 - Não");
		int in = sc.nextInt();
		
		if(in == 1) {
			System.out.println("Digite o número do atributo a ser alterado : \n1 - Texto\n2 - Valor\n3 - Quantidade");
			int foo = sc.nextInt();
			
			switch (foo) {
			case 1:
				System.out.println("Digite o novo texto : ");
				test = sc.nextLine();
				prod.setTexto(test);
				break;
			case 2:
				System.out.println("Digite o novo valor : ");
				valor = sc.nextDouble();
				prod.setValor(valor);
				break;

			case 3:
				System.out.println("Digite a nova quantidade : ");
				qtd = sc.nextInt();
				prod.setQnt(qtd);
				break;
				
			default :
				System.out.println("Digite uma opção correta!");
			}
		}
		
		System.out.println("Dados : \n- Descrição : " + prod.getTexto() + "\n- Valor : " + prod.getValor()
		+ "\n- Quantidade : " + prod.getQnt());
		
		sc.close();
	}

}
