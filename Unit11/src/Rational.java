//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables

	private int num1;
	private int num2;
	
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
		num1 = one;
		num2 = two;
	}
	//write  a set method for numerator and denominator

	public void setFraction()
	{
		
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}