import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bata extends Actor
{
    /**
     * Act - do whatever the bata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bata() 
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
