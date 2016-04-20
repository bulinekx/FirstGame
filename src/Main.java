import java.util.Date;
import java.util.Scanner;

import game.Game;
import game.boardbuilders.RandomBuilder;
import game.fields.CoinField;
import game.fields.PlayerException;
import game.fields.PlayerGameOverException;
import game.fields.PlayerWinsException;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		Game game = null;
		in = new Scanner(System.in);
		if (args.length > 0) {
			game = new Game(args[0]);
		} else {
			System.out.println("Podaj n: ");
			game = new Game(in.nextInt());
			game.init(new RandomBuilder(new Date().getTime()));
		}
		game.draw();

		while (true) {
			
			System.out.println("coins: "+ game.getState().getCoins() ); // licznik coins�w 
			System.out.println("live: "+ game.getState().getLive() ); // �ycie
			
			
			String input = in.next(".").toUpperCase(); //poruszanie si�
			try {
				switch (input) {
				case "W":
					game.moveUp();
					break;
				
				case "A":
						game.moveLeft();
						break;
						
				case "D":
					game.moveRight();
					break;
					
				case "S":
					game.moveDown();
					break;
					
				}
			} 
			catch(PlayerWinsException e) { 
				System.out.println("Winner!");
				return;
			} 
			
			catch (PlayerGameOverException e) {
				System.out.println("Game Over.");
				return; 
			}

			
			catch (PlayerException e) {
				System.out.println("you can not enter them.");
			}
			
			
			System.out.println();
			game.draw();
		}
	}

}
