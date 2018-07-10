import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score2 extends Actor
{
    int skor2=0;
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public score2()
    {
        setImage("logo.png");
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-700,img.getHeight()-450);
        setImage(img);
    }
 
    public void act() 
    {
        if(skor2 == 24){
            Greenfoot.stop();
            Greenfoot.playSound("win.mp3");
            getWorld().addObject(new win(), getWorld().getWidth() /  2, getWorld().getHeight() / 2);
            getWorld().addObject(new home(), getWorld().getWidth() /  2, (getWorld().getHeight() / 2) + 150);
       }
    }
    public void tambahskor2(){
        skor2+=1;
    }
}
