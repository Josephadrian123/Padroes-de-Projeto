package mediator;

public class BradescoColleague extends Colleague{

	public BradescoColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Bradesco recebeu: " + mensagem);
		
	}

}
