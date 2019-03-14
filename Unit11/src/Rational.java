//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables

	private int num1;
	private int den1;
	private int newNum;
	private int newDen;
	
	//write two constructors
	
	public Rational()
	{
		
	}
	public Rational(int one, int two)
	{
		setRational(one, two);
	}
	

	//write a setRational method
	
	public void setRational(int one, int two)
	{
		setNumerator(one);
		setDenominator(two);
	}
	//write  a set method for numerator and denominator

	public void setNumerator(int one)
	{
		num1 = one;
	}
	
	public void setDenominator(int two)
	{
		den1 = two;
	}
	
	public int getNumerator()
	{
		return num1;
	}
	
	public int getDenominator()
	{
		return den1;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		num1 = (num1 * other.getDenominator()) + (other.getNumerator() * den1);
		den1 = (den1 * other.getDenominator());


		reduce();
	}

	private void reduce()
	{
		if (gcd(num1, den1) != 0)
		{
			num1 = num1 / gcd(num1, den1);
			den1 = den1 / gcd(num1, den1);
		}
		
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 0;
		
		for (int i = 1; i < Math.max(numOne, numTwo); i++)
		{
			if (numOne%i == 0 && numTwo%i == 0)
			{
				gcd = i;
			}
		}
		
		return gcd;
	}

	public Object clone ()
	{
		Rational obj = new Rational(num1, den1);
		
		return obj;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals(Rational obj)
	{		
		obj.reduce();
		reduce();
		if (obj.getNumerator() == num1 && obj.getDenominator() == den1)
		{
			return true;
		}
		
		return false;
	}

	public int compareTo(Rational other)
	{
		other.reduce();
		reduce();
		if (equals(other))
		{
			return 0;
		}
		double num2 = other.getNumerator();
		double den2 = other.getDenominator();
		
		if ((double)(num2 / den2) > (double)(num1 / den1))
		{
			return -1;
		}
		else if ((double)(num2 / den2) < (double)(num1 / den1))
		{
			return 1;
		}

		return -1;
	}


	
	//write  toString() method
	public String toString()
	{
		String output = "";
		
		output += num1 + "/" + den1;
		
		return output;
	}
	
}