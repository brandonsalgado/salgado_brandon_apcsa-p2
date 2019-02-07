//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner

{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter a wordcat: ");
		String w = keyboard.next();
		
		StringOddOrEven StrVal = new StringOddOrEven(w);
		out.println(StrVal.toString());
		
		
	}
}