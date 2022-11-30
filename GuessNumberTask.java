import java.util.Random;
import java.util.Scanner;

public class GuessNumberTask {
	public static void main(String[] args) {
		int Ans, Gu;
		final int MAX = 50;

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		boolean correct = false;
		Ans = rand.nextInt(MAX) + 1;

		while (!correct) {
			System.out.println("Guess a Number between 1 and 50:");

			Gu = sc.nextInt();
			if (Gu > Ans) {
				System.out.println(" You are Entered a Number to Large, Please Try Again");
			} else {
				if (Gu < Ans) {
					System.out.println(" You are Entered to Number to Small ,Please Try again");
				} else {
					System.out.println("Yes,You Guessed the Number !!! .");
					correct = true;
				}
			}
		}
		System.exit(0);
	}
}