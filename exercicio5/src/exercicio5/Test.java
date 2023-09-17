package exercicio5;

public class Test {

	public static void main(String[] args) {

		int i = 0, j = 5, k = 2;
		for (; i < 2; i++) {
			k--;
			for (; j > 0; j--) {
				k += 3;
			}
			k++;
		}
		
		System.out.println(k);
		
	}

}
