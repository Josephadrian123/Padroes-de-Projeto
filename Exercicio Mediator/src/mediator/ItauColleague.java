package mediator;

public class ItauColleague extends Colleague{

	public ItauColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Itau recebeu: " + mensagem);
		
	}

}
