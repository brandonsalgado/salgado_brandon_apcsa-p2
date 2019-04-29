package PongPart3;

import javax.swing.JFrame;
import java.awt.Component;

public class PongGameExtension extends JFrame{
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
	public PongGameExtension()
	{
			super("PONG");
			setSize(WIDTH, HEIGHT);

			Pong2 game = new Pong2();
			((Component)game).setFocusable(true);
			getContentPane().add(game);

			setVisible(true);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main( String args[] )
	{
		PongGameExtension run = new PongGameExtension();
	}
	
}
