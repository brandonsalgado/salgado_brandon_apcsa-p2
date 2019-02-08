//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter a word: ");
		String s = keyboard.next();
		
		TriangleOne T1 = new TriangleOne(s);
		T1.print();
		
	}
}