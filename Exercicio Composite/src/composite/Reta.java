package composite;

public class Reta implements Figura{
	
	private double tam;
	
	public Reta(double tam) {
		this.tam = tam;
	}
	
	public double getTam() {
		return tam;
	}
	public void setTam(double tam) {
		this.tam = tam;
	}
	public void perimetroFigura() {
	}
	public void areaFigura() {
	}
	public void desenhaFigura() {
		System.out.println("__");
	}
	@Override
	public String toString() {
		return "Reta [tam=" + tam + "]";
	}

}
