//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance;
	private double mph;
	private double time, minuteh, hours, minutes;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		minuteh = (double) (minutes/60);
		time = (double) hours + minuteh; 
		mph = (double) distance / time;
	}
	
	public double getMPH()
	{
		return mph;
	}

	public void print()
	{
		System.out.println("MPH : " + getMPH());
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}