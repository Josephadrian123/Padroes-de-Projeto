package chainOfResponsibility;



public abstract class SlotChain {
	
	protected SlotChain next;
	

	public SlotChain(SlotValue value) {
		next = null;
		
	}
	
	public void setNext(SlotChain forma) {
		if(next == null) {
			next = forma;
		}else {
			next.setNext(forma);
		}
	}
	
	
	public abstract double insereMoeda(SlotValue slot);
	
}
