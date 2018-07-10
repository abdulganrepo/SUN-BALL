import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg extends World
{

    GreenfootSound backgroundMusic = new GreenfootSound("play.mp3");
    /**
     * Constructor for objects of class bg.
     * 
     */
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        started();
        prepare();
        setBackground("langit.jpg");
    }
    public void started(){
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(75);
        //Greenfoot.setSpeed(55);
    }
    
    public void stopped(){
        backgroundMusic.stop();
    }
   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        papan papan = new papan();
        addObject(papan,191,572);
        bola bola = new bola();
        addObject(bola,171,511);
        bata bata = new bata();
        addObject(bata,67,89);
        bata bata2 = new bata();
        addObject(bata2,186,91);
        bata bata3 = new bata();
        addObject(bata3,308,81);
        bata.setLocation(62,40);
        bata2.setLocation(166,42);
        bata2.setLocation(157,57);
        bata2.setLocation(165,41);
        bata3.setLocation(269,42);
        bata bata4 = new bata();
        addObject(bata4,341,120);
        bata4.setLocation(341,91);
        bata bata5 = new bata();
        addObject(bata5,233,98);
        bata5.setLocation(238,92);
        bata bata6 = new bata();
        addObject(bata6,138,96);
        bata6.setLocation(133,91);
        bata bata7 = new bata();
        addObject(bata7,63,157);
        bata7.setLocation(58,142);
        bata bata8 = new bata();
        addObject(bata8,196,159);
        bata8.setLocation(161,142);
        bata bata9 = new bata();
        addObject(bata9,282,154);
        bata9.setLocation(264,142);
        bata bata10 = new bata();
        addObject(bata10,369,206);
        bata10.setLocation(348,190);
        bata10.setLocation(342,191);
        bata bata11 = new bata();
        addObject(bata11,233,211);
        bata11.setLocation(237,191);
        bata bata12 = new bata();
        addObject(bata12,151,186);
        bata12.setLocation(132,191);

        addObject(bata,351,48);
        bata.setLocation(108,40);
        bata.setLocation(56,32);

        bata5.setLocation(106,174);
        bata3.setLocation(270,170);
        bata4.setLocation(187,170);
        bata5.setLocation(105,168);
        bata8.setLocation(230,46);
        bata2.setLocation(139,33);
        bata8.setLocation(220,36);
        bata8.setLocation(220,32);
        bata8.setLocation(222,34);
        bata6.setLocation(304,34);
        bata6.setLocation(304,34);
        bata9.setLocation(353,97);
        bata3.setLocation(267,101);
        bata7.setLocation(183,100);
        bata9.setLocation(352,101);
        bata5.setLocation(99,100);
        bata11.setLocation(59,157);
        bata4.setLocation(143,156);
        bata4.setLocation(142,156);
        bata12.setLocation(228,156);
        bata10.setLocation(310,158);
        bata10.setLocation(318,165);
        bata11.setLocation(59,163);
        bata4.setLocation(142,162);
        bata12.setLocation(226,157);
        bata10.setLocation(309,161);
        bata12.setLocation(225,161);
        bata10.setLocation(309,162);
        bata bata13 = new bata();
        addObject(bata13,276,306);
        bata13.setLocation(362,206);
        bata9.setLocation(354,81);
        bata3.setLocation(270,83);
        bata7.setLocation(188,82);
        bata5.setLocation(106,83);
        bata11.setLocation(57,169);
        bata11.setLocation(56,132);
        bata4.setLocation(140,132);
        bata12.setLocation(224,135);
        bata12.setLocation(224,131);
        bata10.setLocation(306,131);
        bata13.setLocation(356,179);
        bata bata14 = new bata();
        addObject(bata14,321,184);
        bata14.setLocation(274,179);
        bata bata15 = new bata();
        addObject(bata15,210,207);
        bata15.setLocation(188,181);
        bata bata16 = new bata();
        addObject(bata16,35,184);
        bata16.setLocation(103,182);
        bata16.setLocation(92,177);
        bata16.setLocation(105,180);
        bata13.setLocation(357,177);
        bata14.setLocation(274,176);
        bata15.setLocation(190,177);
        bata16.setLocation(108,177);
        bola.setLocation(192,554);
        score score = new score();
        addObject(score,48,569);
        removeObject(score);
        score score2 = new score();
        addObject(score2,23,586);

        score2.setLocation(43,586);
        score2.setLocation(20,585);
        removeObject(papan);
        papan2 papan2 = new papan2();
        addObject(papan2,189,572);
        bola.setLocation(192,529);
        papan2.setLocation(188,563);
        papan2.setLocation(183,556);
        removeObject(bola);
        bola2 bola2 = new bola2();
        addObject(bola2,188,545);
        papan2.setLocation(190,556);
        bola2.setLocation(185,540);
        papan2.setLocation(191,556);
        bola2.setLocation(186,538);
        removeObject(bola2);
        bola bola3 = new bola();
        addObject(bola3,198,536);
        removeObject(papan2);
        removeObject(bola3);
        papan papan3 = new papan();
        addObject(papan3,203,553);
        bola2 bola22 = new bola2();
        addObject(bola22,193,530);
        papan3.setLocation(199,549);
        bola22.setLocation(195,529);
        removeObject(bola22);
        bola bola4 = new bola();
        addObject(bola4,203,538);
        bola4.setLocation(198,534);
        score2.setLocation(43,584);
        score2.setLocation(33,584);
        gameover gameover = new gameover();
        addObject(gameover,282,384);
        gameover.setLocation(234,302);
        removeObject(gameover);
    }
}
    