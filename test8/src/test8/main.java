package test8;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a=0,b=0,c=0,d=0,e=0,f=0, g=0;
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	a = sc.nextInt();
    e = a*b;
    f = c*d;
    g = e-f;
	System.out.println(g);
	sc.close();
	}

}
