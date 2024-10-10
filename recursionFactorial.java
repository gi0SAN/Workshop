/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class recursionFactorial {
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
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		System.out.print("Enter a non-negative integer: " );
		int n = reader.nextInt();
		//Display factorial
		System.out.println("Factorial of " + n + " is " + factorial(n));

	}

}
