import java.util.ArrayList;

public class Agenda {

	Pessoa pessoa = new Pessoa();

	ArrayList<Pessoa> agenda = new ArrayList();

	int cont = 0;

	void armazenaPessoa(String nome, int idade, float altura) {
		
		Pessoa pessoa = new Pessoa(nome, idade, altura);
		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setNome(nome);
//		pessoa.setIdade(idade);
//		pessoa.setAltura(altura);

		if (cont < 10) {
			agenda.add(pessoa);
			cont += 1;
		} else {
			System.out.println("Tamanho Maximo 10");
		}

	}

	void removePessoa(String nome) {
		int index = buscaPessoa(nome);
		if(index<cont){
			agenda.remove(index);
			cont -= 1;			
		}
		else{
			System.out.println("Esse nome n�o existe na Agenda");
		}
	}

	int buscaPessoa(String nome) {
		for (int i = 0; i < cont; i++) {
			if (agenda.get(i).getNome() == nome) {
				return i;
			}
		}

		return 10;
	}

	public void imprimeAgenda() {

		for (int i = 0; i < cont; i++) {
			System.out.println("Nome: " + agenda.get(i).getNome());
			System.out.println("Idade: " + agenda.get(i).getIdade());
			System.out.println("Altura: " + agenda.get(i).getAltura() + "\n");

		}
	}

	public void imprimePessoa(int index) {


		System.out.println("Nome: " + agenda.get(index).getNome());
		System.out.println("Idade: " + agenda.get(index).getIdade());
		System.out.println("Altura: " + agenda.get(index).getAltura() + "\n");


	}
}

