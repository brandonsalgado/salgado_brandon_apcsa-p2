//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	private static char first;
	private static char last;
	private static String vow = "aeiouAEIOU";
	
	public static String go( String a )
	{	   
	   first = a.charAt(0);
	   last = a.charAt(a.length() - 1);
	   
	   if (vow.indexOf(first) > -1 || vow.indexOf(last) > -1)
	   {
		   return "yes";
	   }
	   
	   return "no";
	}
}