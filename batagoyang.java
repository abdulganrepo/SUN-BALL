import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class batagoyang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class batagoyang extends Actor
{
private int direction = 5;  
    public void act() 
    { 
        move(); 
    }
 
private void move() 
  { 
        // checking edges  
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        // movement  
        move(direction);
    }
   public batagoyang() 
{
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-900,img.getHeight()-470);
        setImage(img);
    }
   
}
