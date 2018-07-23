package state;

public class Main {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		
		semaforo.status();
		
		semaforo.on();
		semaforo.status();
		
		semaforo.tick();
		semaforo.status();
		
		semaforo.tick();
		semaforo.status();
		
		semaforo.tick();
		semaforo.status();
		
		semaforo.panic();
		semaforo.status();
		
		semaforo.on();
		semaforo.status();
		
		semaforo.off();
		semaforo.status();
		
	}

}
