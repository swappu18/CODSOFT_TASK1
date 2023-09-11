package With5Trial;

import java.util.Scanner;

public class GuessingNumberWith5Trial {
	public static void main(String args[])

	{
		int number = 1 + (int)(100 * Math.random());

		int K=5;
		Scanner input = new Scanner(System.in);


		int i, guess;
		System.out.println("A number is choosen" +"between 1 to 100." +"Within 5 trials.");

			for(i = 0; i < K; i++){
				System.out.println("Guess the number: ");

				guess = input.nextInt();

				if(number == guess) {
					System.out.println("Congratualtions!"+"You Guessed the number.");
					break;
				}
				else if(number > guess && i != K-1) {
					System.out.println("The number is "+ "greater than" + guess);
				}
				else if(number < guess && i != K-1) {
					System.out.println("The number is "+"less than"+ guess);
				}
			}

			if (i == K) {
				System.out.println("You have exhausted"+"K trails.");

				System.out.println("The number was " + number);
			}
		}


	}


