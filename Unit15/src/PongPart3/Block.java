package PongPart3;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;
	}

	//add other Block constructors - x , y , width, height, color
	
	
	public Block(int xp, int yp)
	{
		xPos = xp;
		yPos = yp;
		width = 10;
		height = 10;
		color = Color.black;
	}
	
	public Block(int x, int y, int w)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = 10;
		color = Color.black;
	}
	
	public Block(int xp, int yp, int w, int h)
	{
		xPos = xp;
		yPos = yp;
		width = w;
		height = h;
		color = Color.black;
	}
	
	public Block(int xp, int yp, int w, int h, Color c)
	{
		xPos = xp;
		yPos = yp;
		width = w;
		height = h;
		color = c;
	}
	
	public void setX(int x)
	{
		xPos = x;
	}
	
	public void setY(int y)
	{
		yPos = y;
	}
	
	public void setW(int w)
	{
		width = w;
	}
	
	public void setH(int h)
	{
		height = h;
	}
   //add the other set methods
   
	public void setColor(Color col)
	{
		color = col;
	}

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   //use window class
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block)obj;
		if (xPos == other.getX() && yPos == other.getY() && width == other.getWidth() && height == other.getHeight() && color == other.getColor())
		{
			return true;
		}
		return false;
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}   

	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	public Color getColor()
	{
		return color;
	}

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}