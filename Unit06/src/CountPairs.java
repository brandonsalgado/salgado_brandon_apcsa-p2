//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		
		for (int i = 1; i < (str.length()); i++)
		{
			char prevChar = str.charAt(i - 1);
			char ch = str.charAt(i);
			
			if (ch == prevChar)
			{
				count++;
			}
		}
		
		return count;
	}
}