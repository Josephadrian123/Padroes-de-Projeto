package mediator;

public class Main {

	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
		 
	    CEFColleague cef = new CEFColleague(mediador);
	    BBColleague bb = new BBColleague(mediador);
	    ItauColleague itau = new ItauColleague(mediador);
	    BradescoColleague bradesco = new BradescoColleague(mediador);
	 
	    mediador.adicionarColleague(cef);
	    mediador.adicionarColleague(bb);
	    mediador.adicionarColleague(itau);
	    mediador.adicionarColleague(bradesco);
	     
	    cef.enviarMensagem("Transação feita no CEF!");
	    System.out.println("\n");
	    bb.enviarMensagem("Transação feita no BB!");
	    System.out.println("\n");
	    itau.enviarMensagem("Transação feita no Itau");
	    System.out.println("\n");
	    bradesco.enviarMensagem("Transação feita no Bradesco");

	}

}
