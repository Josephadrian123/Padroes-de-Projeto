package AbstractFactory;

import java.util.ArrayList;

public class Casa {

	Piso piso;
	Parede parede;
	Porta porta;
	Tinta tinta;
	Metal metal;
	Louca louca;
	ArrayList<Comodo> comodos;
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
	public ArrayList<Comodo> getComodos() {
		return comodos;
	}
	public void setComodos(ArrayList<Comodo> comodos) {
		this.comodos = comodos;
	}
	public void addComodos(Comodo comodo) {
		this.comodos.add(comodo);
	}





}
