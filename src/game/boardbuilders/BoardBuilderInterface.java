package game.boardbuilders;

import game.Board;
import game.State;

public interface BoardBuilderInterface {
	public void build(Board board, State state);
}
