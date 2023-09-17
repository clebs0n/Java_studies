package exercicio1;

public class Retangulo {

	public double width;
	public double height;

	public double Area() {
		
	double res = width*height;
	return res;
	
	}
	
	public double Perimetro() {
		
		double res2 = width*2 + height*2;
		return res2;
	}
	
	public double Diagonal() {
		double res3 = Math.sqrt(((height*height)+(width*width)));
		return res3;
	}

}
 