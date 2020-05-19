import java.util.Scanner;

class RockPaperScissors {
	static Scanner read = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Welcome to game of rock-paper-scissors.");
		System.out.print("Start? <y/n>");
		char go = read.next().charAt(0);
		int player = 0, computer = 0, games = 0;
		if (go == 'y') {
			play(player, computer, games);
		} else {
			System.out.println("Come back soon. Thank you.");
		}
		read.close();
	}

	public static void play(int player, int computer, int games) {
		games++;
		System.out.println("Enter your choice. R for Rock,P for Paper or S for Scissors.");
		char playerChoice = read.next().charAt(0);
		int randomInt = (int) (Math.random()) * 100;
		char compChoice = ' ';
		if (randomInt < 34) {
			compChoice = 'R';
		} else if (randomInt >= 34 && randomInt <= 67) {
			compChoice = 'P';
		} else {
			compChoice = 'S';
		}
		System.out.println("You chose " + playerChoice + " and computer chose " + compChoice);
		int point = decideWin(playerChoice, compChoice);
		if (point == 1) {
			System.out.println("Player Won.");
			player++;
		} else if (point == 2) {
			System.out.println("Computer Won.");
			computer++;
		} else {
			System.out.println("Error.");
		}
		System.out.println("Another game? <y/n>");
		char go = read.next().charAt(0);
		if (go == 'y') {
			play(0, 0, 0);
		} else {
			dispScoreBoard(player, computer, games);
			System.out.println("Thank you for playing.");
		}
	}

	public static int decideWin(char a, char b) {
		int point = 0;
		switch (a) {
		case 'R':
			if (b != 'R' && b != 'P') {
				point = 1;
			} else if (b == 'P') {
				point = 2;
			}
			break;
		case 'P':
			if (b != 'S' && b != 'P') {
				point = 1;
			} else if (b == 'S') {
				point = 2;
			}
			break;
		case 'S':
			if (b != 'R' && b != 'S') {
				point = 1;
			} else if (b == 'R') {
				point = 2;
			}
			break;
		default:
			System.out.println("Error.");
		}
		return point;
	}

	public static void dispScoreBoard(int p, int c, int g) {
		int s = p + c;
		System.out.println("You won " + p + "games out of " + s + " games.");
		System.out.println("Computer won " + p + "games out of " + s + " games.");
		System.out.println("Total games bearing results : " + s);
		System.out.println("Total games bearing no results : " + (g - s));
		System.out.println("Total games played : " + g);
	}
}