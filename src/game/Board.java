package game;

import java.awt.Point;

import game.fields.Field;

public class Board {
	Field[][] fields;
	int size;
	public Board(int size) {
		super();
		fields = new Field[size][size]; 
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setField(int i, int j, Field field) {
		fields[i][j] = field;
	}
	
	public Field getField(int i, int j) {
		return fields[i][j];
	}	
	
	public void draw() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				getField(i, j).draw();
			}
			System.out.println("");
		}
	}
	
	
	public Point getPlayerPosition(){
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(getField(i, j).isPlayerPresent())
					return new Point(i, j);
			}
		}
		return null;
	}
}
