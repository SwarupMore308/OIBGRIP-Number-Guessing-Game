import java.util.Random;
import java.util.Scanner;
import java.io.*;
  
public class GuessGame {
    public static void main(String[] args)
    {
        int answer, guessing;
	    char choice;
  
        final int MAX = 100;

        Scanner sc = new Scanner(System.in);
  
        Random random = new Random();
  
        boolean correct = false;

        answer = random.nextInt(MAX) + 1;
  
	    System.out.println("**Welcome TO Number Guessing Game!!**\n\n");
	    System.out.println("To Start The game press 'Y'");
		
	    choice=sc.next().charAt(0);;
	
	    if(choice=='Y' || choice == 'y')
	{
      	  while (!correct) {

	    
		
            System.out.println("Guess a number between 1 and 100: ");

            guessing = sc.nextInt();

            if (guessing > answer) {
                System.out.println("Number Entered is Large!!");
            }
  
            else if (guessing < answer) {
                System.out.println("Number Entered is Small!!");
            }

            else {
  
                System.out.println("Yes, you guessed the number.");
  
                correct = true;
            }
	}
        }
        System.exit(0);
    }
}
