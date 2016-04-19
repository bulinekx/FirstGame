package game.fields;

import game.State;

public abstract class Field {
	public abstract boolean isAvailable();
	
	public void draw(){
		System.out.print(this.getSymbol());
	}
	
	protected State state;

	protected abstract String getSymbol();
	
	public abstract void onEnter() throws PlayerException;
	
	public abstract void onLeave() throws PlayerException;

	public boolean isPlayerPresent() {
		return false;
	}
}
