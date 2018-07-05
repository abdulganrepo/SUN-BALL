import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bataplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bataplay extends Actor

{
    /**
     * Act - do whatever the bataplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public bataplay() 
{
         GreenfootImage img=getImage();
        img.scale(img.getWidth()-900,img.getHeight()-470);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
