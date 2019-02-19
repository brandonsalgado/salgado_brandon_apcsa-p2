//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   
	   out.println("Enter number: ");
	   int num = keyboard.nextInt();
	   
	   Triples trip = new Triples(num);
	   out.println(trip);
	}
}