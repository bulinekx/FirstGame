package game;

import game.fields.PlayerException;
import game.fields.PlayerGameOverException;


public class State {
	int coins;
	int live=3;

	public void addCoin() {
		this.coins++;
	}

	
	
	public int getCoins() {
		return coins;
	}



	public State() {
		super();
		this.coins = 0;
	}
	
	public void loseCoins() {
		this.coins=0 ;
		
	}
	
	public void dead() throws PlayerException {
		if (this.getLive() <= 0)
			throw new PlayerGameOverException();
	}
	
	public int getLive(){
	return live; 
			
	}
	
	public void addLive() {
		this.live++;
	}

	public void loselive() {
		this.live-- ;
		
	}
	

}