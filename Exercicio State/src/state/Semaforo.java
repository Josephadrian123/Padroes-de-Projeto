package state;

public class Semaforo {
	protected SemaforoState estado;
	
	public Semaforo() {
		estado = new AmareloIntermitente();
	}
	
	public void tick() {
		estado = estado.tick();
	}
	
	public void panic() {
		estado = estado.panic();
	}
	
	public void on() {
		estado = estado.on();
	}
	
	public void off() {
		estado = estado.off();
	}
	
	public void status() {
		if(estado instanceof AmareloIntermitente) {
			System.out.println("Cor atual: Amarelo Intermitente");
		} else if(estado instanceof Vermelho) {
			System.out.println("Cor atual: Vermelho");
		} else if(estado instanceof Verde) {
			System.out.println("Cor atual: Verde");
		} else if(estado instanceof Amarelo) {
			System.out.println("Cor atual: Amarelo");
		}
	}
}
