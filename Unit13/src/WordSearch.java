//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int strcount = 0;
    	for (int i = 0; i < size; i++)
    	{
    		for (int j = 0; j < size; j++)
    		{
    			m[i][j] = str.substring(strcount, strcount + 1);
    			strcount++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length; i++)
    	{
    		for (int j = 0; j < m[i].length; j++)
    		{
    			if (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownLeft(word, i, j) || checkDiagDownRight(word, i, j))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
    {
		String temp = "";
		for (int i = c; i < Math.min(w.length(), m.length); i++)
		{
			temp += m[r][i];
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String temp = "";
		for (int i = c; i > Math.max(c - w.length(), 0); i--)
		{
			temp += m[r][i];
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String temp = "";
		for (int i = r; i > Math.max(r - w.length(), 0); i--)
		{
			temp += m[i][c];
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
    {
		String temp = "";
		for (int i = r; i < Math.min(w.length(), m.length); i++)
		{
			temp += m[i][c];
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String temp = "";
		int incC = c;
		for (int i = r; i > Math.max(r - w.length(), 0); i--)
		{
			temp += m[r][incC];
			if (incC < m.length - 1)
			{
				incC++;
			}
			else
				break;
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String temp = "";
		int incC = c;
		for (int i = r; i > Math.max(r - w.length(), 0); i--)
		{
			temp += m[i][incC];
			if (incC > 0)
			{
				incC--;
			}
			else
				break;
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
    {
		String temp = "";
		int incC = c;
		for (int i = r; i < Math.min(w.length(), m.length); i++)
		{
			temp += m[i][incC];
			if (incC > 0)
			{
				incC--;
			}
			else
				break;
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String temp = "";
		int incC = c;
		for (int i = r; i < Math.min(w.length(), m.length); i++)
		{
			temp += m[i][incC];
			if (incC < m.length - 1)
			{
				incC++;
			}
			else
				break;
		}
		if (w.equals(temp))
		{
			return true;
		}
		return false;
	}

    public String toString()
    {
    	String output = "";
    	
    	for (int i = 0; i < m.length; i++)
    	{
    		output += Arrays.toString(m[i]);
    		output += "\n";
    	}
    	
 		return output;
    }
}
