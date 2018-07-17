package chainOfResponsibility;

public class Slot100 extends SlotChain{

	
	public Slot100() {
		super(SlotValue.slot100);
		
	}

	public double insereMoeda(SlotValue slot) {
		if(SlotValue.slot100.equals(slot)) {
			
			System.out.println("Moeda inserida no slot100");
			return new Double(1.00);
					
		}else if(next != null) {
		return next.insereMoeda(slot);
	}else 
	
		return new Double(0.0);
		
	}
	
	

}
