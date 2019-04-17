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
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightscore, leftscore;


	public Pong()
	{
		//set up all variables related to the game
		rightscore = 0;
		leftscore = 0;
		ball = new Ball();
		leftPaddle = new Paddle(20, 0, 8, 40, 5);
		rightPaddle = new Paddle(770, 0, 8, 40, 5);


		keys = new boolean[4];

    
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

		graphToBack.drawString("Right Score: " + rightscore, 500, 500);
		graphToBack.drawString("Left Score: " + leftscore, 100, 500);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10))
		{
			graphToBack.setColor(Color.white);
		    graphToBack.fillRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setX(200);
			ball.setY(200);
			graphToBack.setColor(Color.white);
			graphToBack.drawString("Right Score: " + rightscore, 200, 500);
			rightscore++;
		}
		if(!(ball.getX()<=780))
		{
			graphToBack.setColor(Color.white);
		    graphToBack.fillRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setX(200);
			ball.setY(200);
			graphToBack.setColor(Color.white);
			graphToBack.drawString("Left" + leftscore, 200, 500);
			leftscore++;
		}
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYS(-ball.getYS());
		}


		//see if the ball hits the left paddle
		if ((ball.getY() < leftPaddle.getY() + 40 && ball.getY() > leftPaddle.getY())&&(ball.getX() == leftPaddle.getX() + 2))
		{
			ball.setXS(-ball.getXS());
		}
		
		
		//see if the ball hits the right paddle
		if ((ball.getY() < rightPaddle.getY() + 40 && ball.getY() > rightPaddle.getY())&&(ball.getX() == rightPaddle.getX() - 2))
		{
			ball.setXS(-ball.getXS());
		}
		


		//see if the paddles need to be moved

		if(keys[1] == true && leftPaddle.getY() < 450)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[0] == true && leftPaddle.getY() > 10)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true && rightPaddle.getY() < 450)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true && rightPaddle.getY() > 10)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}


		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
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