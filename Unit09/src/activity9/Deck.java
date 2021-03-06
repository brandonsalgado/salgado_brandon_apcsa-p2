package activity9;

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck 
{

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> card;
	//private Card[] card;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size = 0;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) 
	{
		// *** TO BE IMPLEMENTED IN ACTIVITY 2 *** 
		
		card = new ArrayList<Card>();
		
		//for(int i = 0; i < ranks.length*suits.length; i=i)
		//{
			for (int j = 0; j < ranks.length; j++)
			{
				for (int k = 0; k < suits.length; k++)
				{
					card.add(new Card(ranks[j], suits[k], values[j]));
					//i++;
					size++;
				}
			}
		//}
		shuffle();
		shuffle();
		shuffle();
	}
	
	/*public Deck(String[] ranks, String[] suits, int[] values) 
	{
		// *** TO BE IMPLEMENTED IN ACTIVITY 2 *** 
		
		card = new Card[ranks.length*suits.length];
		
		for(int i = 0; i < card.length; i=i)
		{
			for (int j = 0; j < ranks.length; j++)
			{
				for (int k = 0; k < suits.length; k++)
				{
					card[i] = new Card(ranks[j], suits[k], values[j]);
					i++;
					size++;
				}
			}
		}
		shuffle();
		
		
	}
*/

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size > 0)
		{
			return false;
		}
		return true;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//return card.length;
		//return card.size();
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	/*public void shuffle() 
	{
		// *** TO BE IMPLEMENTED IN ACTIVITY 4 *** 
		
		Card[] cardTemp = card;
		
		for (int i = card.length - 1; i > 0; i--)
		{
			int rand = (int)(Math.random() * card.length);
			card[i] = cardTemp[rand];
			card[rand] = cardTemp[i];
			
		}
		size = card.length;
	}
	*/
	public void shuffle() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		
		//List<Card> cardTemp = new ArrayList<Card>();
		//cardTemp = card;
		
		Card tempC;
		
		for (int i = card.size() - 1; i > 0; i--)
		{
			int rand = (int)(Math.random() * card.size());
			tempC = card.get(i);
			card.set(i, card.get(rand));
			card.set(rand, tempC);
			
		}
		size = card.size();
	}
	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	/*public Card deal() 
	{
		// *** TO BE IMPLEMENTED IN ACTIVITY 2 *** 
		if (size > 0)
		{
			size--;
			return card[size];
		}
		else
		{
			return null;
		}
	}
	*/
	
	public Card deal() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size > 0)
		{
			size--;
			return card.get(size);
		}
		else
		{
			return null;
		}
	}
	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	//@Override
	/*public String toString() 
	{
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size() - 1; k >= 0; k--) 
		{
			rtn = rtn + card[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) 
			{
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size() - 1; k >= size; k--) 
		{
			rtn = rtn + card[k];
			if (k != size) 
			{
				rtn = rtn + ", ";
			}
			if ((k - size()) % 2 == 0) 
			{
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
	*/
	
	@Override
	public String toString() 
	{
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size() - 1; k >= 0; k--) 
		{
			rtn = rtn + card.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) 
			{
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size() - 1; k >= size; k--) 
		{
			rtn = rtn + card.get(k);
			if (k != size) 
			{
				rtn = rtn + ", ";
			}
			if ((k - size()) % 2 == 0) 
			{
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
