package game;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
	private int[] arr;
	private int left;
	private int right;
	private Player player1;
	private Player player2;


	public Game() {
		int arrlength = (int) ((Math.random()*10)+1)*4;
		arr = new int[arrlength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*20) + 1;
		}
		left = 0;
		right = arr.length - 1;
		player1 = new Player();
		player2 = new Player();
	}


	public void move(int player) {
		System.out.println("******************************");
		System.out.println(Arrays.toString(arr));
		if (player == 0) {
			System.out.println(player1.getName() + "'s" + " turn");
		}
		else {
			System.out.println(player2.getName() + "'s" + " turn");
		}
		String num = "";
		do{
			System.out.println("you can choose: " + arr[left] + "-l" + " or: " + arr[right] + "-r");
			Scanner playerSelect = new Scanner(System.in);
			System.out.print("Enter your select: ");
			num = playerSelect.next();
		} while(!num.equals("l") && !num.equals("r"));
		if (num.equals("l")) {
			if (player == 0) {
				player1.addPoints(arr[left]);
			}
			else {
				player2.addPoints(arr[left]);
			}
			arr[left] = 0;
			left++;
		}
		else {
			if (player == 0) {
				player1.addPoints(arr[right]);
			}
			else {
				player2.addPoints(arr[right]);
			}
			arr[right] = 0;
			right --;
		}

	}


	public boolean end() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				return false;
			}
		}
		return true;
	}


	public void score() {
		System.out.println("******************************");
		System.out.println(player1.getName() + ": " + player1.getPoints() + " points.");
		System.out.println(player2.getName() + ": " + player2.getPoints() + " points.");
		if (player1.getPoints() == player2.getPoints()) {
			System.out.println("***** it's a tie *****");
		}
		else if (player1.getPoints() > player2.getPoints()) {
			System.out.println(player1.getName() + " Won!!!");
		}
		else {
			System.out.println(player2.getName() + " Won!!!");
		}
	}
}