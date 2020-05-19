
/**Quiz in Comp. Book(Misc Only)
Date- June 23,2013
Place- Bahi, HP*/
//a quiz
import java.io.IOException; //import an in-built package from java library
import java.util.Scanner;

class BookQuiz {
	public static int score = 0; // variable score initialized with data type ":P "

	public static void main(String args[]) throws IOException {
		System.out.println("~~~~~ Welcome to the game of Champions! ~~~~~");
		System.out.println("*********************************************");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Get Ready for BRAIN STORMING Session");
		System.out.println("##################################");
		System.out.println("\n" + "\n");
		System.out.println("**** Q1. Which is the biggest ocean in the world? ****");
		System.out.println("---- 1. Arctic ocean ----");
		System.out.println("---- 2. Indian Ocean ----");
		System.out.println("---- 3. Arctic Ocean ----");
		System.out.println("---- 4. Pacific ocean ----");
		System.out.println("Enter your choice... ");
		Scanner read = new Scanner(System.in);
		int v = read.nextInt();
		if (v == 4) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out
				.println("**** Q2. What is the science of nature,functions and phenomenon of human mind called? ****");
		System.out.println("---- 1. Geology ----");
		System.out.println("---- 2. Ecology ----");
		System.out.println("---- 3. Psychology ----");
		System.out.println("---- 4. Biology ----");
		System.out.println("Enter your choice... ");
		int a = read.nextInt();
		if (a == 3) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println("**** Q3. What was Khan Abdul Gaffar Khan popularly knows as? ****");
		System.out.println("---- 1. Loknayak ----");
		System.out.println("---- 2. Froniter Gandhi ----");
		System.out.println("---- 3. Man  of Blood and Iron ----");
		System.out.println("---- 4. None of the above ----");
		System.out.println("Enter your choice... ");
		int kl = read.nextInt();
		if (kl == 2) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println(
				"**** Q4. In which game do people jump from a considerable height while attached to an elastic rope? ****");
		System.out.println("---- 1. Sky Diving ----");
		System.out.println("---- 2. Bungee Jumping ----");
		System.out.println("---- 3. Hand Gliding ----");
		System.out.println("---- 4. Scuba Diving ----");
		System.out.println("Enter your choice... ");
		int r = read.nextInt();
		if (r == 2) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println("**** Q5. Find the odd one? ****");
		System.out.println("---- 1. 1920 ----");
		System.out.println("---- 2. 1812 ----");
		System.out.println("---- 3. 1634 ----");
		System.out.println("---- 4. 1731 ----");
		System.out.println("Enter your choice... ");
		int hl = read.nextInt();
		if (hl == 3) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println("**** Q6. Which animal can sleep even while standing? ****");
		System.out.println("---- 1. Horse ----");
		System.out.println("---- 2. Elephant ----");
		System.out.println("---- 3. Cat ----");
		System.out.println("---- 4. Monkey ----");
		System.out.println("Enter your choice... ");
		int p = read.nextInt();
		if (p == 1) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println("**** Q7. Who is the inventor of ATM? ****");
		System.out.println("---- 1. Marconi ----");
		System.out.println("---- 2. Isaac Newton ----");
		System.out.println("---- 3. Galileo Galilei ----");
		System.out.println("---- 4. John Shepherd-Barron ----");
		System.out.println("Enter your choice... ");
		int nm = read.nextInt();
		if (nm == 4) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println("**** Q8. Which is the biggest flower in the world? ****");
		System.out.println("---- 1. Raffflesia----");
		System.out.println("---- 2. Rose ----");
		System.out.println("---- 3. Gulmohar ----");
		System.out.println("---- 4. Lilly ----");
		System.out.println("Enter your choice... ");
		int mn = read.nextInt();
		if (mn == 1) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println("**** Q9. Which animal has a tongue bigger than its body? ****");
		System.out.println("---- 1. Snake ----");
		System.out.println("---- 2. Chameleon ----");
		System.out.println("---- 3. Allegator ----");
		System.out.println("---- 4. Dog ----");
		System.out.println("Enter your choice... ");
		int ak = read.nextInt();
		if (ak == 2) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println(
				"**** Q10. Which Bollywood movie is based on Chetan Bhagat's famous novel:- Five Point Someone-What no do at IIT ? ****");
		System.out.println("---- 1. Faltu ----");
		System.out.println("---- 2. 3 Idiots ----");
		System.out.println("---- 3. Rang de basanti ----");
		System.out.println("---- 4. Dabang ----");
		System.out.println("Enter your choice... ");
		int w = read.nextInt();
		if (w == 2) {
			System.out.println("Correct Answer.");
			score = score + 50;
			System.out.println("\n");
		} else {
			System.out.println("Wrong Answer, Sorry..");
			System.out.println();
		}
		System.out.println("You have scored: " + score + " points..");
		if (score < 200)
			System.out.println("You get grade C");
		else if (score == 200 && score < 400)
			System.out.println("You get grade B");
		else if (score == 400 && score < 500)
			System.out.println("You get grade A");
		else
			System.out.println("You get grade.... A+");
		read.close();
	}
}