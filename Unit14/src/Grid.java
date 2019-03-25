import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				grid[i][j] = vals[(int)(Math.random() * vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		int count = 0;
		String maxN = "";
		
		for (int i = 0; i < vals.length; i++)
		{
			if (countVals(vals[i]) > max)
			{
				max = countVals(vals[i]);
				maxN = vals[i];
			}
		}
		
		return maxN + " occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	public int countVals( String val )
	{
		int count = 0;
		
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				if (grid[i][j].equals(val))
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";
		
		for (int i = 0; i < grid.length; i++)
		{
			output += Arrays.toString(grid[i]);
			output += "\n";
		}
		return output;
	}
}