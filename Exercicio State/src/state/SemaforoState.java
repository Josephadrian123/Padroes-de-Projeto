package state;

public interface SemaforoState {

	SemaforoState tick();
	 
    SemaforoState panic();
 
    SemaforoState on();
 
    SemaforoState off();
	
}
