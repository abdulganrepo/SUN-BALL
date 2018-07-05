import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola2 extends Actor
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
        gerak2();
        kanan2();
        kiri2();
        atas2();
        papan2();
       
    }    
    public void gerak2()
    {
        setLocation(getX()+x,getY()+y);
    }
    public void kanan2()
    {
        if(getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            x=x-1;
            
        }
    }
    public void kiri2()
    {
        if(getX()<=getImage().getWidth()/2){
            x=x+1;
        }
    }
    public void atas2()
    {
        Actor batamerah2=getOneIntersectingObject(bata2.class);
        Actor batagoyang=getOneIntersectingObject(batagoyang.class);
        if(getY()<=getImage().getHeight()/2){
            y=y+1;
        }
        if(batamerah2 !=null){
            Greenfoot.playSound("coin.mp3");
            getWorld().removeObject(batamerah2);
            score2 gani2 = getWorld().getObjects(score2.class).get(0);
            gani2.tambahskor2();
            
            
        }
         if(batagoyang !=null){
            Greenfoot.playSound("coin.mp3");
            getWorld().removeObject(batagoyang);
            score2 gani2 = getWorld().getObjects(score2.class).get(0);
            gani2.tambahskor2();
               
            
        }
    }    
    public void papan2()
    {
        Actor kayu2=getOneIntersectingObject(papan2.class);
      
        if(kayu2 !=null){
            y=y-1;
            
        }
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            Greenfoot.stop();
            Greenfoot.playSound("kalah.wav");
            getWorld().addObject(new gameover(), getWorld().getWidth() /  2, getWorld().getHeight() / 2);
            
        }
 

 
}
}
