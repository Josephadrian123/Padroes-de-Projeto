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
	     
	    cef.enviarMensagem("Transa��o feita no CEF!");
	    System.out.println("\n");
	    bb.enviarMensagem("Transa��o feita no BB!");
	    System.out.println("\n");
	    itau.enviarMensagem("Transa��o feita no Itau");
	    System.out.println("\n");
	    bradesco.enviarMensagem("Transa��o feita no Bradesco");

	}

}
