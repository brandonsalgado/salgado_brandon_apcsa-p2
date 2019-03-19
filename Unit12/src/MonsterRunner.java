//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		
		System.out.println("Enter name: ");
		String nm = keyboard.next();
		System.out.println("Enter size: ");
		int sz = keyboard.nextInt();
		
		//instantiate monster one
		
		Skeleton Mon1 = new Skeleton(nm, sz);
		
		//ask for name and size
		
		System.out.println("Enter name: ");
		nm = keyboard.next();
		System.out.println("Enter size: ");
		sz = keyboard.nextInt();
		
		//instantiate monster two
		
		Skeleton Mon2 = new Skeleton(nm, sz);
		
		
		System.out.println(Mon1);
		System.out.println(Mon2);
		//smaller samename
		
	}
}