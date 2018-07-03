package composite;

public class Quadrilatero extends FiguraComposta implements Figura{

	private double lado;
	
	public Quadrilatero(double lado) {
		this.lado = lado;
	}
	
	public void perimetroFigura() {
		double perimetro = lado * 4;
		System.out.println("perimetro: " + perimetro);
	}
	public void areaFigura() {
		double area = lado * lado;
		System.out.println("area: " + area);
	}
	public void desenhaFigura() {
		System.out.println("#");
	}
	

	
	@Override
	public String toString() {
		return "Quadrilatero [lado=" + lado + "]";
	}
	
	
	
}
