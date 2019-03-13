//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter toys: ");
		String str = keyboard.nextLine();
		
		ToyStore TS = new ToyStore();
		
		TS.loadToys(str);
		System.out.println(TS);
		System.out.println(TS.getMostFrequentToy());
		
	}
}