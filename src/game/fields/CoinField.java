package game.fields;

import game.State;

public class CoinField extends AvailableField {

	protected boolean used = false;
	
	public CoinField(State state) {
		this.state = state;
	}

	@Override
	protected String getSymbol() {
		if (used) return " ";
		return "$";
	}

	@Override
	public void onEnter() throws PlayerException {
		super.onEnter();
		this.used = true;
		this.state.addCoin();
	}

}
