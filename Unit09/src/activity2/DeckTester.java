package activity2;

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
		String[] ranks = {"five", "six", "seven", "eight"};
		String[] suits = {"diamonds", "spades"};
		int[] val = {5, 6, 7, 8};
		
		Deck deck1 = new Deck(ranks, suits, val);
		
		String[] ranks2 = {"nine", "ten"};
		String[] suits2 = {"hearts", "spades"};
		int[] val2 = {9, 10};
		
		Deck deck2 = new Deck(ranks2, suits2, val2);
		
		String[] ranks3 = {"jack", "queen", "king"};
		String[] suits3 = {"diamonds", "clubs"};
		int[] val3 = {11, 12, 13};
		
		Deck deck3 = new Deck(ranks3, suits3, val3);
		
		System.out.println(deck1);
		System.out.println(deck2);
		System.out.println(deck3);
		System.out.println(deck1.size() + " " + deck2.size() + " " + deck3.size());
		System.out.println(deck1.deal() + " " + deck2.deal() + " " + deck3.deal() + " " + deck3.deal());
		
		
		
		
		
	}
}
