package composite;

public class Circulo extends FiguraComposta implements Figura{
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		
	}
	
	public void perimetroFigura() {
		double perimetro = (2 * Math.PI)* raio;
		System.out.println("perimetro: "+ perimetro);
	}
	public void areaFigura() {
		double area = Math.PI * (raio * raio);
		System.out.println("area: "+area);
	}
	public void desenhaFigura() {
		System.out.println("O");
	}
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

}
