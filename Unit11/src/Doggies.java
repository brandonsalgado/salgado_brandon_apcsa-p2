//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		if (spot < pups.length) pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int max = 0;
		int j = 0;
		for (int i = 0; i < pups.length; i++)
		{
			if (pups[i].getAge() > max)
			{
				max = pups[i].getAge();
				j = i;
			}
		}
		return pups[j].getName();
	}

	public String getNameOfYoungest()
	{
		int min = pups[0].getAge();
		int j = 0;
		for (int i = 0; i < pups.length; i++)
		{
			if (pups[i].getAge() < min)
			{
				min = pups[i].getAge();
				j = i;
			}
		}
		return pups[j].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}