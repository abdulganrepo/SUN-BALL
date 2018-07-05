import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends Actor
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       public back() 
{
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-350,img.getHeight()-150);
        setImage(img);
        
    }
    public void act() 
    {
          {
        if(Greenfoot.mouseClicked(this)){
               (getWorld()).stopped();
            World Start = getWorld();
            Start = new play();
            Greenfoot.setWorld(Start);
        }
    }   // Add your action code here.
    }    
}
