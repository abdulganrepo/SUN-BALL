import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    int skor=0;
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public score()
    {
        setImage("score.png");
    }
    public void act() 
    { 
        if(skor == 16){
       ((bg)getWorld()).stopped();
       Greenfoot.setWorld(new bg2());
       }
    }
    public void tambahskor(){
        skor+=1;
    }
}
