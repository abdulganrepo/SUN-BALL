import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    int x=3;
    int y=3;
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gerak();
        kanan();
        kiri();
        atas();
        papan();
       
    }    
    public void gerak()
    {
        setLocation(getX()-x,getY()+y);
    }
    public void kanan()
    {
        if(getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            x=x+1;
            
        }
    }
    public void kiri()
    {
        if(getX()<=getImage().getWidth()/2){
            x=x-1;
        }
    }
    public void atas()
    {
        Actor batamerah=getOneIntersectingObject(bata.class);
        if(getY()<=getImage().getHeight()/2){
            y=y+1;
        }
        if(batamerah !=null){
            Greenfoot.playSound("coin.mp3");
            getWorld().removeObject(batamerah);
            score gani = getWorld().getObjects(score.class).get(0);
            gani.tambahskor();
            
        }
    }    
    public void papan()
    {
        Actor kayu=getOneIntersectingObject(papan.class);
      
        if(kayu !=null){
            y=y-1;
            
        }
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            Greenfoot.stop();
            Greenfoot.playSound("kalah.wav");
            getWorld().addObject(new gameover(), getWorld().getWidth() /  2, getWorld().getHeight() / 2);
            
        }
 

 
}
}
