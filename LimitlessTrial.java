package CodSoftTask1;

import java.util.Scanner;

public class LimitlessTrial {
	 public static void main(String[] args) {
	        Game obj = new Game();
	        Scanner sc = new Scanner(System.in);
	        

	        while(true){
	            System.out.println("Enter a number between 1 to 100 (1-100): ");
	            int n = sc.nextInt();
	            obj.setNumber(n);

	            if(obj.isCorrect() == 0){
	                obj.setCounter();
	                System.out.println("Congratulations!! You have guessed the correct number");
	                obj.getCounter();
	                break;
	            }
	            else if(obj.isCorrect() == -1){
	                obj.setCounter();
	                System.out.println("Enter smaller number!!");
	            }
	            else if(obj.isCorrect() == 1){
	                obj.setCounter();
	                System.out.println("Enter larger number!!");
	            }
	        }
	    }
}
