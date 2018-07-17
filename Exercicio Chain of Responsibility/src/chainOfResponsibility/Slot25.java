package chainOfResponsibility;

public class Slot25 extends SlotChain{

	
	public Slot25() {
		super(SlotValue.slot25);
		
	}

	public double insereMoeda(SlotValue slot) {
		if(SlotValue.slot25.equals(slot)) {
			
			System.out.println("Moeda inserida no slot25");
			return new Double(0.25);
					
		}else if(next != null) {
		return next.insereMoeda(slot);
	}else 
	
		return new Double(0.0);
		
	}
	
	

}
