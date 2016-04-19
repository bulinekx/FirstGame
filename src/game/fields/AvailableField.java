package game.fields;

public abstract class AvailableField extends Field {

	@Override
	public boolean isAvailable() {
		return true;
	}
	
	protected boolean playerPresent = false;
	
	@Override
	public void onEnter() throws PlayerException {
		playerPresent = true;
	}
	
	@Override
	public void onLeave() {
		playerPresent = false;
	}
	
	@Override
	public void draw() {
		if(playerPresent)
			System.out.print("P");
		else
			super.draw();
	}
	
	@Override
	public boolean isPlayerPresent() {
		// TODO Auto-generated method stub
		return playerPresent;
	}
}
