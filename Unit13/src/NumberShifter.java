//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] luck7 = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			luck7[i] = ((int)(Math.random()*10));
		}
		
		return luck7;
	}
	public static void shiftEm(int[] array)
	{
		int temp;
		
		for (int i = 1; i < array.length; i++)
		{
			for (int j = 1; j < array.length; j++)
			{
				if (array[j] == 7)
				{
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		
		
	}
}