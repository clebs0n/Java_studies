package exercicio5;

public class TEST3 {

	public static void main(String[] args) {
		int j=10, t=4; 

		  for(; (j<10)||(t<10);j--,t+=2){
			  
			  if(t>j) {
				  break;
			  }
			  
		  }
		  System.out.println(t);
		  }

}

/*
	(i) para a inicializa��o J = 12 e T = 3, ao final do la�o, se somarmos os valores
	armazenados nas vari�veis J e T, este valor ser� 20; 
	
	(ii) a inicializa��o J = 14
	e T = 4 resulta em um la�o infinito; 
	
	
	(iii) para a inicializa��o J = 10 e T = 4, e
	se dentro deste la�o houvesse o comando �if(T > J) break;�, ent�o este
	comando �if( T > J)� seria executado exatamente quatro vezes
*/
