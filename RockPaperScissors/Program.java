import java.util.Random; 
import java.util.Scanner;

class Program
{
    public static void main( String[] args)
    {
        /* Declare and Initialize Constant Variables to make the If/Else easier to understand */
        int R = 0; //R = Rock
        int P = 1; //P = Paper
        int S = 2; //S = Scissors

        /*Declare variables and objects*/
        int u; // User's Choice
        int c; // Computer's Choice
        Scanner myScan = new Scanner(System.in);//Object for getting input from keyboard
        Random myRand = new Random(); //Object for Generating Random Numbers
        
        /*Show user their choices */
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissors");
        
        u = myScan.nextInt(); // Get user input from keyboard
        
        c = myRand.nextInt(3); // Make a random number between 0 and 2 for the computer's choice.
        
        /* Show the results to the user */
        System.out.println("c = " + c + " u = " + u);
        
        if ( u==c )
        {
            System.out.println("Tie Game!");
        }
        else if ( (u==R && c==S) || (u==S && c==P) || (u==P && c== R) )
        {
            System.out.println("User Wins!");
        }
        else
        {
            System.out.println("Computer WIns!");
        }//end if else
    }//end main method
}//end Program