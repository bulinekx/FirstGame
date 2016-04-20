package game;

import game.fields.CoinField;
import game.fields.EmptyField;
import game.fields.Field;
import game.fields.FinishField;
import game.fields.RockField;
import game.fields.StartField;
import game.fields.TrapField;
import game.fields.WallField;

public class FieldFactory {

	public static Field charToField(char x, State state) {
		switch (x) {
		case 'X':
			return new WallField();
		case '$':
			return new CoinField(state);
		case '#':
			return new TrapField(state);
		case 'S':
			return new StartField();
		case 'M':
			return new FinishField(state);
		case 'O':
			return new RockField();
		}
		return new EmptyField();
	}

}
