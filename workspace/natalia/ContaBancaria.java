package exercicio;

public class ContaBancaria {
	private int codigo;
	private double saldo;
	
	public ContaBancaria(int codigo, double saldo) {
		if (saldo < 0) {
			saldo = 0;
		}
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	public void imprimirSaldo() {
		System.out.println("conta " + this.codigo + ":" + this.saldo);
	}
	
	public void creditarValor(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacarValor(double valor) {
		if (valor > this.saldo) {
			valor = this.saldo;
		}
		this.saldo = this.saldo - valor;
		System.out.println("Valor sacado:" + valor);
	}
	
	
}
