//(c) A+ Computer Science
// www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{


	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{


	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{

		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
		
	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		String result="";
		
		distanceA = (double) Math.sqrt((Math.pow((x1), 2) + Math.pow((y1), 2)));
		distanceB = (double) Math.sqrt((Math.pow((x2), 2) + Math.pow((y2), 2)));

		if (distanceA < distanceB) 
		{
			result = "A is closest";
		}
		else if (distanceA > distanceB) 
		{
			result = "B is closest";
		}
		else 
		{
			result = "Same distance";
		}

		return result;
	}
	
	public String toString()
	{
		return "";
	}
}