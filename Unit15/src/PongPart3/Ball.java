package PongPart3;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 2;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int xs, int ys)
	{
		super(x, y);
		xSpeed = xs;
		ySpeed = ys;
	}
	
	
	public void setXS(int x)
	{
		xSpeed = x;
	}
	public void setYS(int y)
	{
		ySpeed = y;
	}
	public int getXS()
	{
		return xSpeed;
	}
	public int getYS()
	{
		return ySpeed;
	}
	public int getX()
	{
		return super.getX();
	}
	public int getY()
	{
		return super.getY();
	}
	public int getWidth()
	{
		return super.getWidth();
	}
	public int getHeight()
	{
		return super.getHeight();
	}
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window, Color.white);

      setX(super.getX()+xSpeed);
      setY(super.getY() + ySpeed);
		//setY

		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if (super.equals(other) && xSpeed == other.getXS() && ySpeed == other.getYS())
		{
			return true;
		}
		return false;
	}   

   //add the get methods

   //add a toString() method
	public String toString()
	{
		return super.toString() + " " + getXS() + " " + getYS();
	}
}