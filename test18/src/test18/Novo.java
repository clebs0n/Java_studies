package test18;

import java.util.Scanner;

public class Novo {

	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int helper = 0;
		System.out.println("Digite a senha: ");
		helper = br.nextInt();
		while (helper != 2002) {
			System.out.println("Senha inválida, digite novamente: ");
			helper = br.nextInt();
		}
				System.out.println("Acesso permitido:)");
		br.close();

}
}