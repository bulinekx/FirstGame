package game.fields;

public abstract class UnavailableField extends Field {

	@Override
	public boolean isAvailable() {
		return false;
	}
	
	@Override
	public void onEnter() throws PlayerException {
		throw new PlayerException();
	}
	
	@Override
	public void onLeave() throws PlayerException {
		throw new PlayerException();
	}

}