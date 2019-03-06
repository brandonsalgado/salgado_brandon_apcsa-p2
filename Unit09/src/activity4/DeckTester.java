package activity4;

import java.util.Arrays;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits = {"diamonds", "spades", "hearts", "clubs"};
		int[] val = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck deck1 = new Deck(ranks, suits, val);
		
		/*String[] ranks2 = {"nine", "ten"};
		String[] suits2 = {"hearts", "spades"};
		int[] val2 = {9, 10};
		
		Deck deck2 = new Deck(ranks2, suits2, val2);
		
		String[] ranks3 = {"jack", "queen", "king"};
		String[] suits3 = {"diamonds", "clubs"};
		int[] val3 = {11, 12, 13};
		
		Deck deck3 = new Deck(ranks3, suits3, val3);
		*/
				
		
		System.out.println(deck1);
		System.out.println(deck1.size());
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.deal());
		
		
		
		
		
		
		
		/*System.out.println(deck2);
		System.out.println(deck2.size());
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.deal());
		System.out.println(deck3);
		System.out.println(deck3.size());
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.deal());
		System.out.println(deck3.deal());
		System.out.println(deck3.deal());
		System.out.println(deck3.deal());
		System.out.println(deck3.deal());
		System.out.println(deck3.deal());
		System.out.println(deck3.isEmpty());
		*/
		
	}
}
