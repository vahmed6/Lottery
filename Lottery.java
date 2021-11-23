/* program that will determine if user wins the lottery by
 * inputting 3-digit number 
 */


import.java.util.Scanner;

public class Lottery {
	public static void main(String args[]) {
		
		//generate random lottery numbers 
        int lottery = (int)(Math.random() * 1000);

        //ask user to enter a 3 digit integer and store those numbers
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please enter your lottery pick. Three Digits Only");
        int guess = numbers.nextInt();

        // numbers for lottery
        int lotteryDigit1 = lottery % 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery / 100;

        //get digits from guess
        int guessDigit1 = guess % 100; 
        int guessDigit2 = guess % 100 / 10; 
        int guessDigit3 = guess / 100; 

        //print out lottery numbers
        System.out.println("The lottery numbers are: " + lottery);

        if (guess == lottery)
            System.out.println("Perfect match! You won $10,000!");
        else if (guessDigit2 == lotteryDigit1 
                && guessDigit1 == lotteryDigit2
                && guessDigit3 == lotteryDigit3)
            System.out.println("You match all the numbers, you won $3,000!");
        else if (guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit1 == lotteryDigit3
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2
            || guessDigit2 == lotteryDigit3
            || guessDigit3 == lotteryDigit1
            || guessDigit3 == lotteryDigit2
            || guessDigit3 == lotteryDigit3)  
            System.out.println("You matched one number, you won $1,000!");
        else enter code here
            System.out.println("No Match, Better Luck Next Time!");		
		

	}

}
