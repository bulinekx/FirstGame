package game.fields;

import game.State;


public class TrapField extends AvailableField {

	//protected boolean used = false;
	
	
	
	public TrapField(State state) {
		this.state = state;
		}


	@Override
	protected String getSymbol() {
	//	if (used) return "" ;
		return "#" ;
		}

	
	public void onEnter() throws PlayerException {
		super.onEnter();
	//	this.used = true; 
		this.state.loselive();
		this.state.dead();
		this.state.loseCoins();
		
		}
}
