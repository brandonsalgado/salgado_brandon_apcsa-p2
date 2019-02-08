//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter sentence: ");
		String s = keyboard.next();
		out.println("Enter character: ");
		String str = keyboard.next();
		char rem = str.charAt(0);
		
		LetterRemover LetRem = new LetterRemover(s, rem);
		
		
	}
}