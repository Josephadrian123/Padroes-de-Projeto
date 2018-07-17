package chainOfResponsibility;

import java.text.NumberFormat;
import java.util.Locale;

public class Maquina {

	private double preco;
	private double total;
	private SlotChain slot;
	
	public Maquina(double preco) {
		this.preco = preco;
		total = 0.0;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
	    
	    System.out.println("Preço a ser cobrado: R$ " + nf.format(preco));
	    
	    slot = new Slot01();
	    slot.setNext(new Slot05());
	    slot.setNext(new Slot10());
	    slot.setNext(new Slot25());
	    slot.setNext(new Slot50());
	    slot.setNext(new Slot100());
	}
	
	public void inserir(SlotValue slot) {
		total = total + this.slot.insereMoeda(slot);
		NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
		if(total < preco) 
		{
			System.out.println("Falta R$" + nf.format(preco - total));
		}
		else if(total == preco) 
		{
			System.out.println("Sucesso!");
		}
		else if(total > preco)
		{
			System.out.println("Sucesso! Seu troco é de R$" + nf.format(total - preco));
		}
	}
}
