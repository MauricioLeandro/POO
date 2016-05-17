
class Produto {
	private int codigo;
	private String nome;
	private double preco;
	private double desconto_a_vista;
	
	public Produto(int cod_prod,String nome_prod,double
preco_prod,double desc){
		setCodigo(cod_prod);
		setNome(nome_prod);
		preco =preco_prod;
		desconto_a_vista =desc;
	}
public double getPreco(){
	return preco;
	
}
public double getPrecoAVista(){
	double preco_a_vista;
	preco_a_vista=preco-preco*desconto_a_vista/100;
	return preco_a_vista;
}
public void setDesconto(double desc){
    if((desc > 100)||(desc < 0))
    	desconto_a_vista = 0;
    else
    	desconto_a_vista =desc;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}


}
