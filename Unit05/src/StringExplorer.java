/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		int pos = sample.indexOf("slow");
		if (pos != -1)
		{
			System.out.println("slow is found at position " + pos);
		}
		else
		{
			System.out.println("slow is not found");
		}
		
		String sample1 = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		

		for (int i = 0; i < sample1.length() - 1; i++)
		{
			if (i < sample1.length() - 3)
			{
			if (sample1.substring(i, i + 3).equals("the"))
			{
				System.out.println(i + "");		
			}
			}
				
		}
		
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:

	}

}
