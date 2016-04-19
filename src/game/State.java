package game;

import game.fields.PlayerException;
import game.fields.PlayerGameOverException;


public class State {
	int coins;

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
		if (this.getCoins() <= 0)
			throw new PlayerGameOverException();
	}
			
	}

