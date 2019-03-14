//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] toyStr = toys.split(" ", 0);
		toyList.add(new Toy(toyStr[0]));
		for (int i = 1; i < toyStr.length; i++)
		{
				for (int j = 0; j < toyList.size(); j++)
				{
					if (toyStr[i].equals(toyList.get(j).getName()))
					{
						toyList.get(j).setCount(1);
					}
					else if (j == toyList.size() - 1)
					{
						toyList.add(new Toy(toyStr[i]));
					}
				}
		}	
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 0;
  		int maxIndex = 0;
  		for (int i = 0; i < toyList.size(); i++)
  		{
  			if (toyList.get(i).getCount() > max)
  			{
  				max = toyList.get(i).getCount();
  				maxIndex = i;
  			}
  		}
  		
  		return "Most Frequent: " + toyList.get(maxIndex).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		String output = "";
		
		for (int i = 0; i < toyList.size(); i++)
		{
			output += toyList.get(i).getName();
			output += " " + toyList.get(i).getCount();
			output += ", ";
		}
		
	   return output;
	}
}