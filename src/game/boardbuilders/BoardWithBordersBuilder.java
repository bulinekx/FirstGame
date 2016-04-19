package game.boardbuilders;

import game.Board;
import game.State;
import game.fields.WallField;

public class BoardWithBordersBuilder extends EmptyBuilder {

	@Override
	public void build(Board board, State state) {
		super.build(board, state);
		
		int n = board.getSize();
		for (int j = 0; j < board.getSize(); j++) {
			board.setField(0, j, new WallField());
			board.setField(n-1, j, new WallField());
			board.setField(j, 0, new WallField());
			board.setField(j, n-1, new WallField());
		}
	}
}
