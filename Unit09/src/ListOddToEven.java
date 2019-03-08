//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int i, j;
		for (i = 0; i < ray.size(); i++)
		{
			if (ray.get(i)%2 != 0)
			{
				for (j = ray.size() - 1; j > 0; j--)
				{
					if (ray.get(j)%2 == 0)
					{
						return j - i;
					}
				}
			}
		}
		return -1;
	}
}