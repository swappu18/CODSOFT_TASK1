package CodSoftTask1;

public class Game {
	 private int counter = 0;
	    private int myNumber; //myNumber (the player's guess)//
	    private int compNumber;//compNumber (the randomly generated number)//

	    public Game(){
	        compNumber = (int) (Math.random()*100);
	    }
	    public void setNumber(int n){
	        myNumber = n;
	    }
	    public int isCorrect(){
	        if(myNumber == compNumber){
	            return 0;
	        }
	        else if(myNumber > compNumber){
	            return -1;
	        }
	        else{
	            return 1;
	        }
	    }
	    public void setCounter(){
	        counter++;
	    }
	    public void getCounter(){
	        System.out.println("The number of guesses were "+ counter);
	    }
}
