package chainOfResponsibility;

public class Slot50 extends SlotChain{

	
	public Slot50() {
		super(SlotValue.slot50);
		
	}

	public double insereMoeda(SlotValue slot) {
		if(SlotValue.slot50.equals(slot)) {
			
			System.out.println("Moeda inserida no slot50");
			return new Double(0.50);
					
		}else if(next != null) {
		return next.insereMoeda(slot);
	}else 
	
		return new Double(0.0);
		
	}
	
	

}
