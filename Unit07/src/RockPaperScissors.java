//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int cchoice = (int)(Math.random() * 3);
		switch (cchoice)
		{
		case 0 : compChoice = "R";
		case 1 : compChoice = "P";
		case 2 : compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice.equals("R"))
		{
			if (compChoice.equals("R"))
			{
				winner = "Neither, it's a draw";
			}
			else if (compChoice.equals("P"))
			{
				winner = "Computer";
			}
		}
		
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}