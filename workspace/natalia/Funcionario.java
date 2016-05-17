package exercicio;

public class Funcionario {
	private String nome;
	private String cargo;
	private Funcionario superior;
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public Funcionario(String nome, String cargo, Funcionario superior) {
		this.nome = nome;
		this.cargo = cargo;
		this.superior = superior;
	}
	
	public void imprimirFuncionario() {
		String superior = this.superior != null ? " Superior: " + this.superior.nome : " Superior:  Sem superior";
		System.out.println("Nome: " + this.nome + " Cargo: " + this.cargo + superior);
	}
}
