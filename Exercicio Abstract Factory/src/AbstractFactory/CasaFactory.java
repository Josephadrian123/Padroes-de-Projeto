package AbstractFactory;

public abstract class CasaFactory {
	
	public abstract Piso criarPiso();
	public abstract Parede criarParede();
	public abstract Porta criarPorta();
	public abstract Tinta criarTinta();
	public abstract Metal criarMetal();
	public abstract Louca criarLouca();
}
