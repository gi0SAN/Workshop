/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class recursionFactorial {
	//Method to find a a factorial
	static int factorial (int n)
	{
		if (n == 0) {
			return 1;
		}
		else 
		{
			return (n * factorial(n-1)); // Recursive call
		}
	}
	public static void main(String[] args) {
		//Scanner is called
		Scanner reader = new Scanner (System.in);
		//Ask the user to input a random integer
		System.out.print("Enter a non-negative integer: " );
		// User can input a non negative integer
		int n = reader.nextInt();
		//Display factorial
		System.out.println("Factorial of " + n + " is " + factorial(n));
		//Facotrial is returned 

	}

}
