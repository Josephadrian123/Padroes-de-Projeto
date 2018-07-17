package chainOfResponsibility;

public class Slot05 extends SlotChain{
	
	
	public Slot05() {
		super(SlotValue.slot05);
		
		
	}

	public double insereMoeda(SlotValue slot) {
		if(SlotValue.slot05.equals(slot)) {
			
			System.out.println("Moeda inserida no slot05");
			return new Double(0.05);
					
		}else if(next != null) {
		return next.insereMoeda(slot);
	}else 
	
		return new Double(0.0);
		
	}

	
}
