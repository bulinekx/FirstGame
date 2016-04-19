package game.fields;

import game.State;

public class FinishField extends AvailableField {

	public FinishField(State state) {
		this.state = state;
	}

	@Override
	protected String getSymbol() {
		// TODO Auto-generated method stub
		return "M";
	}

	@Override
	public void onEnter() throws PlayerException {
		if (this.state.getCoins() > 0)
			throw new PlayerWinsException();
	}
}
