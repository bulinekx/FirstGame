package game.boardbuilders;

import game.Board;
import game.State;
import game.fields.EmptyField;

public class EmptyBuilder implements BoardBuilderInterface {

	public void build(Board board, State state) {
		for (int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {
				board.setField(i, j,new EmptyField());
			}
		}
	}
}
