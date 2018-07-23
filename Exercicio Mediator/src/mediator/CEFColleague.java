package mediator;

public class CEFColleague extends Colleague{

	public CEFColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("CEF recebeu: " + mensagem);
		
	}

}
