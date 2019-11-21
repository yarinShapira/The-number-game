package game;

import java.util.Scanner;

public class Player {
	private String name;
	private int points;

	public Player() {
		Scanner playerName = new Scanner(System.in);
		System.out.print("Enter a player name: ");
		name = playerName.nextLine();
		if(name.equals("") || name.equals(" ")) {
			name = "Idiot!";
		}
	}


	public void addPoints (int add) {
		points = points + add;
	}


	public int getPoints() {
		return points;
	}


	public String getName() {
		return name;
	}

}