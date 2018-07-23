package mediator;

public class BBColleague extends Colleague{

	public BBColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("BB recebeu: " + mensagem);
		
	}

}
