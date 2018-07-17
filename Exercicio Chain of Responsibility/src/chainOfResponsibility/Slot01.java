package chainOfResponsibility;

public class Slot01 extends SlotChain{

    
	public Slot01() {
		super(SlotValue.slot01);
	
	}
	
	
	public double insereMoeda(SlotValue slot) {
		if(SlotValue.slot01.equals(slot)) {
			
			System.out.println("Moeda inserida no slot01");
			return new Double(0.01);
					
		}else if(next != null) {
		return next.insereMoeda(slot);
	}else 
	
		return new Double(0.0);
		
	}


}
