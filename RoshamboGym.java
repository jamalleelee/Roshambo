package com.RoshamboPlayers;

import java.util.Scanner;

public class RoshamboGym {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userMove = null;
		String opponent = null;
		User myUser = new User(null, 0);
		DwayneTheRockJohnson theRock = new DwayneTheRockJohnson(null, 0);
		CrazyHoboMan theHobo = new CrazyHoboMan(null, 0);
		Spazzz theSpaz = new Spazzz(null, 0);
		boolean validInput = false;
		String playAgain = null;
		boolean wantsToPlayAgain = false;

		System.out.println("Please Enter Your Name");
		myUser.setName(keyboard.nextLine().toUpperCase());

		do {
			theSpaz.setMoveTaken((int) ((Math.random() * 3) + 1));
			theHobo.setMoveTaken((int) ((Math.random() * 3) + 1));

			System.out.println("Why Hello " + myUser.getName() + "!");
			do {
				System.out.println("What would you like to throw?");
				System.out.println("1: Rock");
				System.out.println("2: Paper");
				System.out.println("3: Scissors");
				userMove = keyboard.nextLine();
				if (userMove.equals("1") || userMove.equals("2") || userMove.equals("3")) {
					myUser.setMoveTaken(Integer.parseInt(userMove));
					validInput = false;

				} else {
					System.out.println("Please Select 1,2 or 3");
					validInput = true;
				}
			} while (validInput);
			System.out.println("Great Choice!");
			System.out.println("Choose Your Opponent... If you dare:");
			System.out.println("1: " + theRock.getName());
			System.out.println("2: " + theHobo.getName());
			System.out.println("3: " + theSpaz.getName());

			do {
				opponent = keyboard.nextLine();

				switch (opponent) {
				case "1":

					System.out.println(theRockMoves(myUser.getMoveTaken(), theRock.getMoveTaken()));
					validInput = false;
					break;

				case "2":

					System.out.println(theHoboMoves(myUser.getMoveTaken(), theHobo.getMoveTaken()));
					validInput = false;
					break;
				case "3":

					System.out.println(theSpazMoves(myUser.getMoveTaken(), theSpaz.getMoveTaken()));
					validInput = false;
					break;
				default:
					System.out.println("Please Select 1,2 or 3");
					validInput = true;

				}

			} while (validInput);

			do {

				System.out.println("Would you like to play again? Y/N");

				playAgain = keyboard.nextLine().toUpperCase();

				switch (playAgain) {
				case "Y":
					wantsToPlayAgain = true;
					validInput = false;

					break;

				case "N":
					wantsToPlayAgain = false;
					validInput = false;
					break;

				default:
					System.out.println("Please enter only Y or N");
					validInput = true;
				}
			} while (validInput);

		} while (wantsToPlayAgain);

		keyboard.close();
	}

	private static String theSpazMoves(int userMoveTaken, int spazMoveTaken) {
		String results = null;
		if (userMoveTaken == 1 && spazMoveTaken == 1) {
			results = "You and The Spazzz both chose Rock! You Tie!";

		} else if (userMoveTaken == 2 && spazMoveTaken == 2) {
			results = "You and The Spazzz both chose Paper! You Tie!";

		} else if (userMoveTaken == 3 && spazMoveTaken == 3) {
			results = "You and The Spazzz both chose Scissors! You Tie!";

		} else if (userMoveTaken == 1 && spazMoveTaken == 3) {
			results = "You chose Rock and The Spazzz chose Scissors! Rock destroys Scissors! Yay you win!";
		} else if (userMoveTaken == 2 && spazMoveTaken == 1) {
			results = "You chose Paper and The Spazzz chose Rock! Paper covers Rock! Yay you win!";
		} else if (userMoveTaken == 3 && spazMoveTaken == 2) {
			results = "You chose Scissors and The Spazzz chose Paper! Scissors cut Paper! Yay you win!";
		} else if (userMoveTaken == 1 && spazMoveTaken == 2) {
			results = "You chose Rock and The Spazzz chose Paper! Paper covers Rock! Aww you lose!";
		} else if (userMoveTaken == 2 && spazMoveTaken == 3) {
			results = "You chose Paper and The Spazzz chose Scissors! Scissors cut Paper! Aww you lose!";
		} else if (userMoveTaken == 3 && spazMoveTaken == 1) {
			results = "You chose Scissors and The Spazzz chose Rock! Rock destroys Scissors! Aww you lose!";
		} else {
			results = "I don't know what you chose :(";
		}

		return results;
	}

	private static String theHoboMoves(int userMoveTaken, int hoboMoveTaken) {
		String results = null;
		if (userMoveTaken == 1 && hoboMoveTaken == 1) {
			results = "You and The Hobo both chose Rock! You Tie!";

		} else if (userMoveTaken == 2 && hoboMoveTaken == 2) {
			results = "You and The Hobo both chose Paper! You Tie!";

		} else if (userMoveTaken == 3 && hoboMoveTaken == 3) {
			results = "You and The Hobo both chose Scissors! You Tie!";

		} else if (userMoveTaken == 1 && hoboMoveTaken == 3) {
			results = "You chose Rock and The Hobo chose Scissors! Rock destroys Scissors! Yay you win!";
		} else if (userMoveTaken == 2 && hoboMoveTaken == 1) {
			results = "You chose Paper and The Hobo chose Rock! Paper covers Rock! Yay you win!";
		} else if (userMoveTaken == 3 && hoboMoveTaken == 2) {
			results = "You chose Scissors and The Hobo chose Paper! Scissors cut Paper! Yay you win!";
		} else if (userMoveTaken == 1 && hoboMoveTaken == 2) {
			results = "You chose Rock and The Hobo chose Paper! Paper covers Rock! Aww you lose!";
		} else if (userMoveTaken == 2 && hoboMoveTaken == 3) {
			results = "You chose Paper and The Hobo chose Scissors! Scissors cut Paper! Aww you lose!";
		} else if (userMoveTaken == 3 && hoboMoveTaken == 1) {
			results = "You chose Scissors and The Hobo chose Rock! Rock destroys Scissors! Aww you lose!";
		} else {
			results = "I don't know what you chose :(";
		}

		return results;

	}

	private static String theRockMoves(int userMoveTaken, int rockMoveTaken) {
		String results = null;
		if (userMoveTaken == 1 && rockMoveTaken == 1) {
			results = "You and Dwayne both chose Rock! You Tie!";

		} else if (userMoveTaken == 2 && rockMoveTaken == 2) {
			results = "You and Dwayne both chose Paper! You Tie!";

		} else if (userMoveTaken == 3 && rockMoveTaken == 3) {
			results = "You and Dwayne both chose Scissors! You Tie!";

		} else if (userMoveTaken == 1 && rockMoveTaken == 3) {
			results = "You chose Rock and Dwayne chose Scissors! Rock destroys Scissors! Yay you win!";
		} else if (userMoveTaken == 2 && rockMoveTaken == 1) {
			results = "You chose Paper and Dwayne chose Rock! Paper covers Rock! Yay you win!";
		} else if (userMoveTaken == 3 && rockMoveTaken == 2) {
			results = "You chose Scissors and Dwayne chose Paper! Scissors cut Paper! Yay you win!";
		} else if (userMoveTaken == 1 && rockMoveTaken == 2) {
			results = "You chose Rock and Dwayne chose Paper! Paper covers Rock! Aww you lose!";
		} else if (userMoveTaken == 2 && rockMoveTaken == 3) {
			results = "You chose Paper and Dwayne chose Scissors! Scissors cut Paper! Aww you lose!";
		} else if (userMoveTaken == 3 && rockMoveTaken == 1) {
			results = "You chose Scissors and Dwayne chose Rock! Rock destroys Scissors! Aww you lose!";
		} else {
			results = "I don't know what you chose :(";
		}

		return results;

	}

}
