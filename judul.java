import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class judul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class judul extends Actor
{
    /**
     * Act - do whatever the judul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public judul() 
{
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-300,img.getHeight()-300);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
