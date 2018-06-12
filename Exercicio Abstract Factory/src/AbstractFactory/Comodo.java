package AbstractFactory;

import java.util.ArrayList;

public class Comodo {

	String nome;
	Piso piso;
	ArrayList<Parede> paredes;
	ArrayList<Porta> portas;
	Tinta tinta;
	ArrayList<Metal> metais;
	ArrayList<Louca> loucas;
	
	public Comodo(String nome, Piso piso, ArrayList<Parede> paredes, ArrayList<Porta> portas, Tinta tinta,
			ArrayList<Metal> metais, ArrayList<Louca> loucas) {
		super();
		this.nome = nome;
		this.piso = piso;
		this.paredes = paredes;
		this.portas = portas;
		this.tinta = tinta;
		this.metais = metais;
		this.loucas = loucas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public ArrayList<Parede> getParedes() {
		return paredes;
	}

	public void setParedes(ArrayList<Parede> paredes) {
		this.paredes = paredes;
	}
	
	public void addParedes(Parede parede) {
		this.paredes.add(parede);
	}

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public void setPortas(ArrayList<Porta> portas) {
		this.portas = portas;
	}
	
	public void addPortas(Porta porta) {
		
	}

	public Tinta getTinta() {
		return tinta;
	}

	public void setTinta(Tinta tinta) {
		this.tinta = tinta;
	}

	public ArrayList<Metal> getMetais() {
		return metais;
	}

	public void setMetais(ArrayList<Metal> metais) {
		this.metais = metais;
	}

	public ArrayList<Louca> getLoucas() {
		return loucas;
	}

	public void setLoucas(ArrayList<Louca> loucas) {
		this.loucas = loucas;
	}
	
	
}
