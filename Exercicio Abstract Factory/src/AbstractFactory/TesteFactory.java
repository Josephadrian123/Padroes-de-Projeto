package AbstractFactory;

public class TesteFactory {

	private static Casa criarCasa(String tipo) {
		CasaFactory cf = null;
		
		if(tipo == "Basica") {
			cf = new CasaBasicaFactory();
		}
		
		if(tipo == "Conforto") {
			cf = new CasaConfortoFactory();
		}
		
		if(tipo == "Luxo") {
			cf = new CasaLuxoFactory();
		}
		
		Casa casa = new Casa();
		
		casa.setPiso(cf.criarPiso());
		casa.setParede(cf.criarParede());
		casa.setPorta(cf.criarPorta());
		casa.setTinta(cf.criarTinta());
		casa.setMetal(cf.criarMetal());
		casa.setLouca(cf.criarLouca());
		
		return casa;
	}
	
	public static void main(String[] args) {
	
		Casa c1 = criarCasa("Basica");
		Casa c2 = criarCasa("Conforto");
		Casa c3 = criarCasa("Luxo");
		
		System.out.println("FIM");
	}
	
}
