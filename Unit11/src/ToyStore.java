//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		
	}

	public void loadToys( String toys )
	{
		String[] toyStr = toys.split(" ", 0);
		for (int i = 0; i < toyStr.length; i++)
		{
			toyList.add(new Toy(toyStr[i]));
		}	
	}
  
  	public Toy getThatToy( String nm )
  	{
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}