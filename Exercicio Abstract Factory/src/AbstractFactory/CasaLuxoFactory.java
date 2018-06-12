package AbstractFactory;

public class CasaLuxoFactory extends CasaFactory{
	
	
public Piso criarPiso() {
		
		return new Porcelanato();
	}


	public Parede criarParede() {
		
		return new AlvenariaDryWall();
	}

	
	public Porta criarPorta() {
		
		return new MadeiraDeLei();
	}

	
	public Tinta criarTinta() {
		
		return new Superlavavel();
	}

	
	public Metal criarMetal() {
		
		return new Inox();
	}

	
	public Louca criarLouca() {
		
		return new DECA();
	}

}
