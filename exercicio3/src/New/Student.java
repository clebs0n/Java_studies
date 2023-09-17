package New;

public class Student {

	public String Nome;
	public double Nota1;
	public double Nota2;
	public double Nota3;
	public double res;

	public double FinalGrade() {
		res = Nota1 + Nota2 + Nota3;
		return res;
	}
	
	public double MissingPoints() {
		res = 60-res;
		return res;
	}
}
