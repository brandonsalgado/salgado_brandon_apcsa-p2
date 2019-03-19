//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		List<String> words = new ArrayList<String>();
		for (int i = 0; i < size; i++)
		{
			words.add(file.next());
			file.nextLine();
		}
		
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				Word wrdi = new Word(words.get(i));
				Word wrdj = new Word(words.get(j));
				
				if (wrdi.compareTo(wrdj) > 0)
				{
					words.remove(i);
					words.add(j, wrdi.toString());
				}

			}
		}


		for (int i = size - 1; i >= 0; i--)
		{
			System.out.println(words.get(i));
		}






	}
}