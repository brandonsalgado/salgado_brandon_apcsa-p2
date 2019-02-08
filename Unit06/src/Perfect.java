//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int sum;

	//add constructors
   public Perfect()
   {  
   }
   
   public Perfect(int num)
   {
	   setNum(num);
   }
   
   public void setNum(int num)
   {
	   number = num;
   }
   
	//add a set method

	public boolean isPerfect()
	{
		for (int i = 1; i < number; i++)
		{
			if (number%i == 0)
			{
				sum +=i;
			}

		}
		if (sum == number)
		{
			return true;
		}
		
		return false;
	}

	public String toString()
	{
		if (isPerfect())
		{
			return number + " is perfect";
		}
		return number + " is not perfect";
		
	}
	
	//add a toString	
	
}