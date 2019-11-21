package game;

import java.util.Arrays;
import java.util.Scanner;

public class main { 
	public static void main(String[] args) {
		while(true) {
			Scanner game = new Scanner(System.in);
			System.out.println("******* The number game ******");
			System.out.println("New game - 1");
			System.out.println("credits - 2");
			System.out.println("exit - 3");
			System.out.print("Enter your select: ");
			int act = game.nextInt();
			if(act == 1) {
				Game one = new Game();
				System.out.println("******************************");
				
				Player player1 = new Player();
				Player player2 = new Player();
				int whoPLay = (int) (Math.random()*2);
				while(!one.end()) {
					if (whoPLay == 0) {
						one.move(player1);
						whoPLay = 1;
					}
					else {
						one.move(player2);
						whoPLay = 0;
					}
				}
				one.score(player1, player2);
			}
			if(act == 2) {
				System.out.println("******************************");
				System.out.println("written by Yarin Shapira");
			}
			if(act == 3) {

				break;
			}
		}
	}
}
