//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter first word: ");
		String w1 = keyboard.next();
		out.println("Enter next word: ");
		String w2 = keyboard.next();
		
		StringEquality strEq = new StringEquality(w1, w2);
		out.println(strEq.toString() + "");
	}
}