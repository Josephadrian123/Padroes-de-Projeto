package composite;

public class Triangulo extends FiguraComposta implements Figura{
	
	private double lado;
	private double altura;
	
	public Triangulo(double lado, double altura) {
		this.altura = altura;
		this.lado = lado;
	}
	
	public void perimetroFigura() {
		double perimetro = lado * 3;
		System.out.println("perimetro: "+perimetro);
	}
	public void areaFigura() {
		double area = (lado * altura)/2;
		System.out.println("area: "+area);
	}
	public void desenhaFigura() {
		System.out.println("^");
	}
	@Override
	public String toString() {
		return "Triangulo [lado=" + lado + ", altura=" + altura + "]";
	}

}
