//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		
		char tempLetter = letter;
		
		for (int i = 0; i < amount; i++)
		{
			for (int j = 0; j < (amount - i); j++)
			{
				if (tempLetter == 'Z' && j > 0)
				{
					tempLetter = 'A';
				}
				else if (j == 0)
				{
					tempLetter = letter;
				}
				else
				{
					tempLetter++;
				}
				for (int k = 0; k < (amount - j); k++)
				{
					output += tempLetter;
				}
				output += " ";
			}
			output += "\n";
		}
		
		
		
		return output;
	}
}