package exercicio;

public class ProdutoSemEncapsulamento {
	public int codigo;
	public String nome;
	public double preco;
	public double desconto_a_vista;
	
	//Construtor
	public ProdutoSemEncapsulamento(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setDesconto(double desconto) {
		if (desconto > 100 || desconto < 0) {
			desconto = 0;
		}
		this.desconto_a_vista = desconto;
	}
	
	public double getPrecoAVista() {
		return this.preco - this.preco / 100 * this.desconto_a_vista;
	}
}