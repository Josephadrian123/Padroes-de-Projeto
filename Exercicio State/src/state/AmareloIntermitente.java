package state;

public class AmareloIntermitente implements SemaforoState{

	@Override
	public SemaforoState tick() {
		return null;
	}

	@Override
	public SemaforoState panic() {
		return new Vermelho();
	}

	@Override
	public SemaforoState on() {
		return new Vermelho();
	}

	@Override
	public SemaforoState off() {
		return null;
	}

}
