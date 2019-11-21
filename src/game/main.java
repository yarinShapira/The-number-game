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
				int whoPLay = (int) (Math.random()*2);
				while(!one.end()) {
					one.move(whoPLay);
					if(whoPLay == 0){
						whoPLay = 1;
					}
					else {
						whoPLay = 0;
					}
				}
				one.score();
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
