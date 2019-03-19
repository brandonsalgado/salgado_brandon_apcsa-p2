//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{

	private int size;
	private String name;
	
	public Skeleton()
	{
		
	}
	
	public Skeleton(String nm, int sz)
	{
		name = nm;
		size = sz;
	}
	
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		if (size > other.getHowBig())
		{
			return false;
		}
		return false;
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		if (size < other.getHowBig())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		if (name.equals(other.getName()))
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		return name + " " + size;
	}
}