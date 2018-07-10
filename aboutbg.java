import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aboutbg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aboutbg extends World
{

    /**
     * Constructor for objects of class aboutbg.
     * 
     */
    public aboutbg()
    {    
        super(400, 600, 1);
        prepare();
        setBackground("aboutbg.jpg");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,147,570);
        back.setLocation(61,561);
    }
}
