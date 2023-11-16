package numbergame;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
	public static void main(String args[]) {
		int comp,user;
		int Range=100;
		int maxAttempts=5;
		int score=0;
		Scanner input=new Scanner(System.in);
		Random rand=new Random();
		
		comp=rand.nextInt(Range) +1;
		System.out.println("Enter your Number between 1 to 100, Let's see whether it matches with the computer:");
		for(int attempts=1;attempts<=maxAttempts;attempts++)
		{
		user=input.nextInt();
		System.out.println("Attempt " + attempts + ":");
		
		
		if(comp!=user)
		{
			System.out.println("OOPS!, The number is not matched");
		}
		else
		{	
			 int points=10-(attempts-1)*2;
			 score+=points;
			System.out.println("Hurray!!, You matched with the computer");
			
			break;
		}
		if(attempts<maxAttempts) {
			System.out.println("You have "+(maxAttempts-attempts)+" attempts left");
			
		}
		else
		{
			System.out.println("Sorry, You have used all the attempts.");
			System.out.println("The number generated by computer was "+comp);
			System.out.println("Better luck next time!");
		}
		
		
	}
		System.out.println("Your Score is "+score);
}
}
