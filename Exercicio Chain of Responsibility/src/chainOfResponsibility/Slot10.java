package chainOfResponsibility;

public class Slot10 extends SlotChain{

	
	public Slot10() {
		super(SlotValue.slot10);
		
	}

	public double insereMoeda(SlotValue slot) {
		if(SlotValue.slot10.equals(slot)) {
			
			System.out.println("Moeda inserida no slot10");
			return new Double(0.10);
					
		}else if(next != null) {
		return next.insereMoeda(slot);
	}else 
	
		return new Double(0.0);
		
	}




}
