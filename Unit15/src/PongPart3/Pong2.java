package PongPart3;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Pong2 extends Canvas implements KeyListener, Runnable
{
	private Paddle leftPaddle;
 	private boolean[] keys;
	private Ball ball;
	private BufferedImage back;
	private int leftscore;
	private ArrayList<Block> blocks;
	private static int level;

	public Pong2()
	{
		level++;
		//set up all variables related to the game
		leftscore = 0;
		leftPaddle = new Paddle(300, 300, 40, 40, 5);
		ball = new Ball();

		keys = new boolean[4];
		
		blocks = new ArrayList<Block>();
		if (level == 1)
		{
		for (int i = 0; i < 4; i++)
		{
			blocks.add(new Block(80 + (i*150), 0, 125, 30));
			blocks.add(new Block(80 + (i*150), 70, 125, 30));
			blocks.add(new Block(80 + (i*150), 400, 125, 30));
			blocks.add(new Block(80 + (i*150), 470, 125, 30));
		}
		for (int i = 0; i < 2; i++)
		{
			blocks.add(new Block(10, 120 + (i*150), 30, 125));
			blocks.add(new Block(60, 120 + (i*150), 30, 125));
			blocks.add(new Block(650, 120 + (i*150), 30, 125));
			blocks.add(new Block(710, 120 + (i*150), 30, 125));
		}
		}
		if (level == 2)
		{
			for (int i = 0; i < 8; i++)
			{
				blocks.add(new Block(80 + (i*75), 0, 62, 30));
				blocks.add(new Block(80 + (i*75), 70, 62, 30));
				blocks.add(new Block(80 + (i*75), 400, 62, 30));
				blocks.add(new Block(80 + (i*75), 470, 62, 30));
			}
			for (int i = 0; i < 4; i++)
			{
				blocks.add(new Block(10, 120 + (i*75), 30, 62));
				blocks.add(new Block(60, 120 + (i*75), 30, 62));
				blocks.add(new Block(650, 120 + (i*75), 30, 62));
				blocks.add(new Block(710, 120 + (i*75), 30, 62));
			}
		}
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes

	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.drawString("Level: " + level, 10, 10);
		//graphToBack.drawString("Left Score: " + leftscore, 100, 500);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		for (int i = 0; i < blocks.size(); i++)
		{
			blocks.get(i).draw(graphToBack);
		}

		for (int i = 0; i < blocks.size(); i++)
		{
			if (ball.getX() > blocks.get(i).getX() && ball.getX() < blocks.get(i).getX() + blocks.get(i).getWidth())
			{
				if (ball.getY() < blocks.get(i).getY() + blocks.get(i).getHeight() && ball.getY() > blocks.get(i).getY())
				{
					//hits tile

					if (blocks.get(i).getHeight() > blocks.get(i).getWidth())
					{
						ball.setXS(-ball.getXS());
					}
					else
					{
					ball.setYS(-ball.getYS());
					}
					blocks.get(i).draw(graphToBack, Color.white);
					blocks.remove(i);
					if (blocks.size() == 0)
					{
						//finished level
						PongGameExtension run2 = new PongGameExtension();
						//level = 2;
						
					}
				}
			}
		}
		
		
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10))
		{
			/*
			graphToBack.setColor(Color.white);
		    graphToBack.fillRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setX(200);
			ball.setY(200);
			graphToBack.setColor(Color.white);
			//graphToBack.drawString("Right Score: " + rightscore, 200, 500);
			//rightscore++;
			*/
			ball.setXS(-ball.getXS());

		}
		if(!(ball.getX()<=780))
		{
			/*graphToBack.setColor(Color.white);
		    graphToBack.fillRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setX(200);
			ball.setY(200);
			graphToBack.setColor(Color.white);
			graphToBack.drawString("Left" + leftscore, 200, 500);
			leftscore++;
			*/
			ball.setXS(-ball.getXS());
		}
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=550))
		{
			ball.setYS(-ball.getYS());
		}


		//see if the ball hits the left paddle
		if ((ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight() && ball.getY() > leftPaddle.getY())&&(ball.getX() > leftPaddle.getX() && ball.getX() + ball.getWidth() < leftPaddle.getX() + leftPaddle.getWidth()))
		{
			if (ball.getX() > leftPaddle.getX() + ball.getWidth() && ball.getX() < leftPaddle.getX() + leftPaddle.getWidth() - ball.getWidth())
			{
				ball.setYS(-ball.getYS());
			}
			else
			{
				ball.setXS(-ball.getXS());
			}
		}
		
		
		//see if the ball hits the right paddle
		
		


		//see if the paddles need to be moved

		if(keys[1] == true && leftPaddle.getY() < 520)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[0] == true && leftPaddle.getY() > 0)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[2] == true && leftPaddle.getX() > 0)
		{
			leftPaddle.moveLeftAndDraw(graphToBack);
		}
		if (keys[3] == true && leftPaddle.getX() < 745)
		{
			leftPaddle.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}