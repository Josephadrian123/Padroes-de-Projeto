package state;

public class Vermelho implements SemaforoState{

	@Override
	public SemaforoState tick() {
		return new Verde();
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
		return new AmareloIntermitente();
	}

}
