/* program that will determine if user wins the lottery by
 * inputting 3-digit number 
 */


import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		
        //ask user to enter a 3 digit integer and store those numbers
        Scanner input = new Scanner(System.in);
     // Prompt the user to enter a three-digit number
        //Generate random number with 3 diggits
        int randomLottery = 100 + (int)(Math.random() * ((999 - 100)+1));
        //Start scanner

        //Prompt user to enter three digits
        System.out.println(" Enter 3 digits towards the lottery: ");
        int GuessUser = input.nextInt();

        int GUESS1 = GuessUser /100;
        int remainGuess = GuessUser % 100;

        int guess2 = remainGuess /10;
        int guess3= remainGuess % 10;


        //Get  3 digits from lottery

        int d1 = randomLottery /100;
        int remainL = randomLottery % 100;

        int d2 = remainL /10;
        int d3= remainL % 10;

        System.out.println(" The lottery numbers are " + d1 + " " + d2 + " " + d3 + "!");

        //**Check the guess and print out the award system.
        /* if users input matches the lottery input in exact order price is 10000$*/

        if (GuessUser == randomLottery ){
            System.out.println("Perfect match! You have won $10,000!");

            /* if all the DIGITS EQUAL $3000 */

        }else if (((GUESS1 == d1) || (GUESS1 == d2) || (GUESS1 == d3)) &&
                ((  guess2 == d1) || (guess2 == d2) || (guess2 == d3)) &&
                ((guess3 == d1) || (guess3 == d2) || (guess3 == d3))){
            System.out.println("You picked the right digits! You have won $3,000!");

            /* if at least one digit matches the lottery number the award is 1000$ */

        }else if (((GUESS1 == d1) || (GUESS1 == d2) || (GUESS1 == d3)) ||
                ((guess2 == d1) || (guess2 == d2) || (guess2 == d3)) ||
                ((guess3 == d1) || (guess3 == d2) || (guess3 == d3))){
            System.out.println("At least one digit is matched! You won $1,000!");
        }else
            System.out.println ("Better luck next time! :(");
        
        


		
		
		

	}

}
