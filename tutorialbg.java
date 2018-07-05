import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorialbg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorialbg extends World
{

    /**
     * Constructor for objects of class tutorialbg.
     * 
     */
    public tutorialbg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back2 = new back();
        addObject(back2,137,537);
        back2.setLocation(53,573);
    }
}
