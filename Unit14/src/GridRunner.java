//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "b", "c", "7", "9", "x", "2"};
		Grid g = new Grid(10, 10, vals);
		System.out.println(g);
		
		for (int i = 0; i < vals.length; i++)
		{
			System.out.println(vals[i] + " occurs: " + g.countVals(vals[i]));
		}
		
		System.out.println(g.findMax(vals));
	}
}