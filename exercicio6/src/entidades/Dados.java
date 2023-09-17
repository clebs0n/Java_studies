package entidades;

public class Dados {
	
	private String nome;
	private String email;
	private int num;
	private int number;
	
	public Dados(String nome, String email, int num) {
		
		this.nome = nome;
		this.email = email;
		this.num = num;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setNumber(int number) {	
		this.number=number+1;
	}
	
	public String toString() {
		return "\n Aluguel " + number + "\n |Quarto Nº: " + num + 
				"\n |Nome: " + nome + "\n |email: " + email;
	}
}
