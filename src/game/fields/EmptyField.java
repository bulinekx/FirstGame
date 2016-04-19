package game.fields;

public class EmptyField extends AvailableField {

	@Override
	protected String getSymbol() {
		return " ";
	}

	@Override
	public void onEnter()throws PlayerException {
		playerPresent = true;
	}

}
