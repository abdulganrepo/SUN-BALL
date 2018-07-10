import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg2 extends World
{
    
    GreenfootSound backgroundMusic = new GreenfootSound("play.mp3");
    /**
     * Constructor for objects of class bg2.
     * 
     */
    public bg2()
    {    
        super(400, 600, 1); 
        started();
        prepare();
        setBackground("langit.jpg");
    }
     public void started(){
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(50);
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

        bata2 bata2 = new bata2();
        addObject(bata2,101,52);
        bata2.setLocation(56,30);
        bata2 bata22 = new bata2();
        addObject(bata22,172,49);
        bata22.setLocation(140,31);
        bata2 bata23 = new bata2();
        addObject(bata23,238,58);
        bata23.setLocation(226,31);
        bata2 bata24 = new bata2();
        addObject(bata24,324,40);
        bata24.setLocation(311,31);
        bata2.setLocation(50,28);
        bata22.setLocation(133,29);
        bata22.setLocation(132,28);
        bata23.setLocation(216,28);
        bata24.setLocation(298,27);
        bata23.setLocation(215,28);
        bata24.setLocation(298,28);
        batagoyang batagoyang = new batagoyang();
        addObject(batagoyang,200,76);
        batagoyang.setLocation(44,79);
        batagoyang batagoyang2 = new batagoyang();
        addObject(batagoyang2,110,73);
        batagoyang2.setLocation(109,79);
        batagoyang2.setLocation(107,79);
        batagoyang batagoyang3 = new batagoyang();
        addObject(batagoyang3,186,71);
        batagoyang3.setLocation(169,78);
        batagoyang batagoyang4 = new batagoyang();
        addObject(batagoyang4,280,105);
        batagoyang3.setLocation(170,80);
        batagoyang4.setLocation(232,81);
        batagoyang3.setLocation(168,79);
        batagoyang4.setLocation(229,78);
        batagoyang batagoyang5 = new batagoyang();
        addObject(batagoyang5,365,150);
        batagoyang4.setLocation(230,80);
        batagoyang5.setLocation(292,82);
        batagoyang batagoyang6 = new batagoyang();
        addObject(batagoyang6,374,119);
        batagoyang6.setLocation(354,84);
        batagoyang6.setLocation(359,79);
        batagoyang5.setLocation(298,81);
        batagoyang5.setLocation(299,78);
        batagoyang4.setLocation(237,80);
        batagoyang3.setLocation(175,79);
        batagoyang4.setLocation(237,77);
        batagoyang2.setLocation(113,79);
        batagoyang.setLocation(51,79);
        bata2 bata25 = new bata2();
        addObject(bata25,364,166);
        bata25.setLocation(348,133);
        bata25.setLocation(355,133);
        bata25.setLocation(351,133);
        bata2 bata26 = new bata2();
        addObject(bata26,268,140);
        bata26.setLocation(267,133);
        bata25.setLocation(354,130);
        bata26.setLocation(272,129);
        bata26.setLocation(273,130);
        bata26.setLocation(270,130);
        bata25.setLocation(350,129);
        bata26.setLocation(267,129);
        bata2 bata27 = new bata2();
        addObject(bata27,185,146);
        bata27.setLocation(184,128);
        bata2 bata28 = new bata2();
        addObject(bata28,99,111);
        bata28.setLocation(101,129);
        batagoyang batagoyang7 = new batagoyang();
        addObject(batagoyang7,69,194);
        batagoyang7.setLocation(53,175);
        batagoyang batagoyang8 = new batagoyang();
        addObject(batagoyang8,127,167);
        batagoyang8.setLocation(115,173);
        batagoyang batagoyang9 = new batagoyang();
        addObject(batagoyang9,186,218);
        batagoyang9.setLocation(177,174);
        batagoyang batagoyang10 = new batagoyang();
        addObject(batagoyang10,342,207);
        batagoyang10.setLocation(239,175);
        batagoyang batagoyang11 = new batagoyang();
        addObject(batagoyang11,291,185);
        batagoyang11.setLocation(300,175);
        batagoyang batagoyang12 = new batagoyang();
        addObject(batagoyang12,367,199);
        batagoyang12.setLocation(361,176);
        bata2 bata29 = new bata2();
        addObject(bata29,102,237);
        bata29.setLocation(50,221);
        bata2 bata210 = new bata2();
        addObject(bata210,220,259);
        bata210.setLocation(134,221);
        bata2 bata211 = new bata2();
        addObject(bata211,306,252);
        bata211.setLocation(218,223);
        bata2 bata212 = new bata2();
        addObject(bata212,398,257);
        bata212.setLocation(305,227);
        bata212.setLocation(303,225);
        papan2 papan2 = new papan2();
        addObject(papan2,185,582);
        papan2.setLocation(193,584);
        papan2.setLocation(193,584);
        papan2.setLocation(193,584);
        papan2.setLocation(193,584);
        papan2.setLocation(193,584);
        papan2.setLocation(193,584);
        papan2.setLocation(193,584);
        bola2 bola2 = new bola2();
        addObject(bola2,202,569);
        removeObject(bola2);
        removeObject(papan2);

        papan2 papan22 = new papan2();
        addObject(papan22,198,573);
        bola2 bola22 = new bola2();
        addObject(bola22,198,530);
        score2 score2 = new score2();
        addObject(score2,23,585);
        papan22.setLocation(204,548);
        bola22.setLocation(186,484);
        bola22.setLocation(202,524);
        score2.setLocation(36,585);
        score2.setLocation(36,581);
    }
   
}
