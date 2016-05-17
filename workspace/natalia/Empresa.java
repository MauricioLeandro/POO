package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List<Funcionario> funcionarios;
	
	public Empresa() {
		this.funcionarios = new ArrayList<>();
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void listarFuncionarios() {
		for (Funcionario funcionario : this.funcionarios) {
			funcionario.imprimirFuncionario();
		}
	}
}
