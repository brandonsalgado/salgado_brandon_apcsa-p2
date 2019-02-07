//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
	private static int w1len;
	private static int w2len;
	private static double avg;
	
    public static double go( String a, String b )
	{
    	w1len = a.length();
    	w2len = b.length();
    	
    	avg = (double)(w1len + w2len)/2;
	   
		return avg;
	}
}