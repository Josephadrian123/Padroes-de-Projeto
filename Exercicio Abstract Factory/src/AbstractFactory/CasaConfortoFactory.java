package AbstractFactory;

public class CasaConfortoFactory extends CasaFactory{
	
	
	public Piso criarPiso() {
		
		return new CeramicaEsmaltada();
	}


	public Parede criarParede() {
		
		return new Alvenaria();
	}

	
	public Porta criarPorta() {
		
		return new Madeira();
	}

	
	public Tinta criarTinta() {
		
		return new Acrilica();
	}

	
	public Metal criarMetal() {
		
		return new Aluminio();
	}

	
	public Louca criarLouca() {
		
		return new Elizabeth();
	}

}
