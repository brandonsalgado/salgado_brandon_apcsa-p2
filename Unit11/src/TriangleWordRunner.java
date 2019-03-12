//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String wrd = keyboard.next();
		
		System.out.println(TriangleWord.printTriangle(wrd));
		
		
	}
}