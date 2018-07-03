package composite;

public class Ponto implements Figura{
	
	private double tam;
	
	public Ponto(double tam) {
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
		System.out.println(".");
	}
	@Override
	public String toString() {
		return "Ponto [tam=" + tam + "]";
	}

}
