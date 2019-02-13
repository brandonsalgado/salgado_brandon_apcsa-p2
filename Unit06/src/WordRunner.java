//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		String str = "Hello";
		Word wrd = new Word(str);
		out.println(wrd);
		str = "World";
		wrd.setString(str);
		out.println(wrd);
		str = "JukeBox";
		wrd.setString(str);
		out.println(wrd);
		str = "TCEA";
		wrd.setString(str);
		out.println(wrd);
		str = "UIL";
		wrd.setString(str);
		out.println(wrd);

		
		
	}
}