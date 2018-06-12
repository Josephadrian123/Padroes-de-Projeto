package AbstractFactory;

public class Casa {
	
	Piso piso;
	Parede parede;
	Porta porta;
	Tinta tinta;
	Metal metal;
	Louca louca;
	
	public Piso getPiso() {
		return piso;
	}
	
	public void setPiso(Piso piso) {
		this.piso = piso;
	}
	
	public Parede getParede() {
		return parede;
	}
	
	public void setParede(Parede parede) {
		this.parede = parede;
	}
	
	public Porta getPorta() {
		return porta;
	}
	
	public void setPorta(Porta porta) {
		this.porta = porta;
	}
	
	public Tinta getTinta() {
		return tinta;
	}
	
	public void setTinta(Tinta tinta) {
		this.tinta = tinta;
	}
	
	public Metal getMetal() {
		return metal;
	}
	
	public void setMetal(Metal metal) {
		this.metal = metal;
	}
	
	public Louca getLouca() {
		return louca;
	}
	
	public void setLouca(Louca louca) {
		this.louca = louca;
	}
	
	
}
