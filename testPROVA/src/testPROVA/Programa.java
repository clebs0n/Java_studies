package testPROVA;

import NEW.Entidades;

public class Programa {

	public static void main(String[] args) {
		
		
		int NUM=1, A=0, B=0;
		Entidades x = new Entidades();
		

		  for(int i = 0;i<5; i++){
			 NUM = i+1;
		    if(i == 0){
		      A = NUM;
		    }else if(i == 1){
		      if (x.f(NUM, A))
		      {B = NUM;}
		      else
		      {B = A; A = NUM;}
		    }else{
		      if(x.f(B,NUM) && x.f(A,NUM))
		      {B=A; A=NUM;}
		      if(x.f(B,NUM)&&x.f(NUM,A))
		      {B=NUM;}
		    }
		  }
		  System.out.printf("%d,%d,%d",A,B,NUM);

	}

}
