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
		
		
		System.out.println("Monster 1 - " + Mon1);
		System.out.println("Monster 2 - " + Mon2);
		//smaller samename
		
		if (Mon1.isSmaller(Mon2))
			System.out.println("Monster1 is smaller than Monster2");
		else if (Mon2.isSmaller(Mon1))
			System.out.println("Monster2 is smaller than Monster 1");
		
		if (Mon1.namesTheSame(Mon2))
			System.out.println("Monster1 and Monster2 have the same name");
		else
			System.out.println("Monster1 and Monster2 have different names");
		
		
	}
}