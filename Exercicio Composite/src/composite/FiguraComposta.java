package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class FiguraComposta {

	private List<Figura> figuras;
	
	public FiguraComposta(){
		this.figuras = new ArrayList<Figura>();
	}

	public List<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(List<Figura> figuras) {
		this.figuras = figuras;
	}
	
	public void addFigura(Figura figura) {
		this.figuras.add(figura);
	}
	
	public abstract void perimetroFigura();
	public abstract void areaFigura();
	public abstract void desenhaFigura();
}
