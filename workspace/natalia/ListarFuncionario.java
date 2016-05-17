package exercicio;

import exercicio.ContaBancaria;
import exercicio.Empresa;
import exercicio.Funcionario;
import exercicio.ProdutoSemEncapsulamento;

public class Main {
	public static void main(String[] args){
		ProdutoSemEncapsulamento prdt = new ProdutoSemEncapsulamento(1, "teste", 100.00);
		prdt.setDesconto(23);
		System.out.println(prdt.getPrecoAVista());
		
		ContaBancaria conta = new ContaBancaria(1, 325);
		conta.imprimirSaldo();
		conta.sacarValor(23);
		conta.imprimirSaldo();
		
		Funcionario f1 = new Funcionario("Gah", "Gerente");
		Funcionario f2 = new Funcionario("Lucas", "Desenvolvedor", f1);
		Funcionario f3 = new Funcionario("Naty", "Aprediz", f1);
		
		Empresa empresa = new Empresa();
		empresa.adicionarFuncionario(f1);
		empresa.adicionarFuncionario(f2);
		empresa.adicionarFuncionario(f3);
		
		empresa.listarFuncionarios();
		
		
	}
	
}
