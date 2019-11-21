package game;

import java.util.Scanner;

public class Game {
	private int[] arr;
	private int left;
	private int right;



	public Game() {
		int arrlength = (int) ((Math.random()*10)+1)*2;
		arr = new int[arrlength];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random()*20) + 1;
			int ninegative = (int) (Math.random()*4) + 1;
			if (ninegative == 1) {
				num = num * -1;
			}
			arr[i] = num;
		}
		left = 0;
		right = arr.length - 1;
	}


	public void move(Player player) {
		System.out.println("******************************");
		System.out.println(toString(arr));
		System.out.println(player.getName() + "'s turn, you have " + player.getPoints() + " points.");
		String num = "";
		do{
			System.out.println("you can choose: " + arr[left] + "-l" + " or: " + arr[right] + "-r");
			Scanner playerSelect = new Scanner(System.in);
			System.out.print("Enter your select: ");
			num = playerSelect.next();
		} while(!num.equals("l") && !num.equals("r"));
		if (num.equals("l")) {
			player.addPoints(arr[left]);
			arr[left] = 0;
			left++;
		}
		else {
			player.addPoints(arr[right]);
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


	public void score(Player player1 ,Player player2) {
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

	public String toString(int[] arr) {
		String ans = "[";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (i != arr.length-1) {
					ans = ans + arr[i] + ", ";
				}
				else {
					ans = ans + arr[i] + "]";
				}
			}
		}
		return ans;
	}
}