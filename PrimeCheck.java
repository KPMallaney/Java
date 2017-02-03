
package homework2Prob1;

import java.util.Scanner;

public class homework2Prob1 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int x;
		
		System.out.println("Please enter a number to check for prime ");
		
		int numb = keyboard.nextInt();
		boolean isPrime = true;
		for(int i = 2; i <= numb / 2; i++)
		{
			x = numb % i;
			
			if(x == 0)
			{
				isPrime=false;
				break;
			
			}
			
		}
		
		if(isPrime)
			System.out.println(numb + " is a prime number");
		else
			System.out.println(numb + " is not a prime number");
		

	
		
			
		 
		 
		 
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

