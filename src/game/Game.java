package game;

import java.awt.Point;

import game.boardbuilders.BoardBuilderInterface;
import game.fields.PlayerException;

public class Game {
	protected int x;
	protected int y;
	protected Board board;
	protected int n;
	protected State state;

	public Game(int n) {
		this.n = n;
		this.state = new State();
	}

	public Game(String path) {
		this.state = new State();
		board = MapReader.read(path, state);
	}

	public void init(BoardBuilderInterface bbi) {
		board = new Board(this.n);
		bbi.build(board, this.state);
	}

	public void draw() {
		board.draw();
	}

	public void moveUp() throws PlayerException {
		move(-1, 0);

	}

	private void move(int x, int y) throws PlayerException {
		Point position = board.getPlayerPosition();
		board.getField((int) (position.getX() + x), (int) (position.getY() + y)).onEnter();
		board.getField((int) (position.getX()), (int) (position.getY())).onLeave();

	}

	public void moveLeft() throws PlayerException {
		move(0, -1);

	}

	public void moveRight() throws PlayerException {
		move(0, 1);

	}

	public void moveDown() throws PlayerException {
		move(1, 0);



	}

	public State getState() {
		return this.state;
	}
}
