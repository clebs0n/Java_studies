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
	(i) para a inicialização J = 12 e T = 3, ao final do laço, se somarmos os valores
	armazenados nas variáveis J e T, este valor será 20; 
	
	(ii) a inicialização J = 14
	e T = 4 resulta em um laço infinito; 
	
	
	(iii) para a inicialização J = 10 e T = 4, e
	se dentro deste laço houvesse o comando “if(T > J) break;”, então este
	comando “if( T > J)” seria executado exatamente quatro vezes
*/
