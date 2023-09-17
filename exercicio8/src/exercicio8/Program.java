package exercicio8;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero N: ");
	int n = sc.nextInt();
	
	System.out.println("Digite um numero M: ");
	int m = sc.nextInt();
	
	int[][] mat = new int[n][m];
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			mat[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Digite um numero X que pertença a matriz: ");
	int helper = sc.nextInt();
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			if(mat[i][j]==helper) {
				System.out.println("Position: " + i+","+j);
				System.out.println("Left: " + mat[i][j-1]);
				System.out.println("Right: " + mat[i][j+1]);
				System.out.println("Down: " + mat[1+i][j]);
				System.out.println("mat length "+mat[i].length+" "+ i);
			}
		}
	}
	
	sc.close();
	
	}

}
