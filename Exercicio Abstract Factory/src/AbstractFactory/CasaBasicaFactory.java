package AbstractFactory;

public class CasaBasicaFactory extends CasaFactory{

	
	public Piso criarPiso() {
		
		return new Ceramica();
	}


	public Parede criarParede() {
		
		return new Gesso();
	}

	
	public Porta criarPorta() {
		
		return new Mdf();
	}

	
	public Tinta criarTinta() {
		
		return new Latex();
	}

	
	public Metal criarMetal() {
		
		return new Ferro();
	}

	
	public Louca criarLouca() {
		
		return new MaisBarata();
	}

}
