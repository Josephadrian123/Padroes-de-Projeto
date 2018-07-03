package composite;

public class Manipulacao {

	public static void main(String[] args) {
		FiguraComposta f1 = new Quadrilatero(5);
		Figura f2 = new Circulo(4);
		Figura f3 = new Triangulo(4, 3);
		Figura f4 = new Ponto(1);
		Figura f5 = new Reta(4);
		
		f1.desenhaFigura();
		f1.areaFigura();
		f1.perimetroFigura();
		
		f2.desenhaFigura();
		f2.areaFigura();
		f2.perimetroFigura();
		
		f3.desenhaFigura();
		f3.areaFigura();
		f3.perimetroFigura();
		
		f4.desenhaFigura();
		
		f5.desenhaFigura();

	}

}
