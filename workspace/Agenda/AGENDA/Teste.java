
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Agenda	agenda=new Agenda();
	
	agenda.armazenaPessoa("Thiago", 27, 1.68f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Julio", 28, 1.73f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Fabio", 33, 1.45f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Samuel", 19, 1.60f);
//    agenda.imprimeAgenda();
	agenda.armazenaPessoa("Jo�o", 22, 1.80f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Miguel", 25, 1.69f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Sidney", 47, 1.72f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Victor", 20, 1.80f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Yuri", 19, 1.73f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Gabriel", 23, 1.74f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Wallace", 22, 1.65f);
//	agenda.imprimeAgenda();
	agenda.armazenaPessoa("Leonardo", 23, 1.76f);
    agenda.removePessoa("Miguel");
	
	System.out.println(agenda.buscaPessoa("Gabriel"));
    agenda.imprimeAgenda();
	
	
	}
	

}