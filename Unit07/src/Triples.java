//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int gcd;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		for (int m = 1; m <= a && m <= b && m <= c; m++)
		{
			if (a%m == 0 && b%m == 0 && c%m == 0)
			{
				gcd = m;
			}
			
		}
		
		return 1;
	}

	public String toString()
	{
		String output="";

		for (int i = 1; i < number; i++)
		{
			for (int j = 1; j < number; j++)
			{
				for (int k = 1; k < number; k++)
				{
					if ((i*i) + (j*j) == (k*k))
					{
						if (k%2 != 0)
						{
							if ((i%2 == 0 && j%2 != 0)||(i%2 != 0 && j%2 == 0))
							{
								greatestCommonFactor(i, j, k);
								if (gcd == 1)
								{
									output += i + " " + j + " " + k + "\n";
								}
							}

						}
						
					
				}
			}
		}
		
		}


		return output+"\n";
	}
}