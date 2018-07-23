package state;

public class Verde implements SemaforoState{

	@Override
	public SemaforoState tick() {
		return new Amarelo();
	}

	@Override
	public SemaforoState panic() {
		return new Vermelho();
	}

	@Override
	public SemaforoState on() {
		return null;
	}

	@Override
	public SemaforoState off() {
		return new AmareloIntermitente();
	}

}
