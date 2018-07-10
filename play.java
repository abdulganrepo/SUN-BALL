import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{

    /**
     * Constructor for objects of class play.
     * 
     */
  
    public play()
    {    
        super(400, 600, 1); 
        prepare();
        setBackground("langit.jpg");
    } 

        


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bataplay bataplay = new bataplay();
        addObject(bataplay,362,23);
        bataplay bataplay2 = new bataplay();
        addObject(bataplay2,341,198);
        bataplay2.setLocation(361,99);
        bataplay bataplay3 = new bataplay();
        addObject(bataplay3,368,182);
        bataplay3.setLocation(362,176);
        bataplay bataplay4 = new bataplay();
        addObject(bataplay4,365,264);
        bataplay4.setLocation(361,254);
        bataplay bataplay5 = new bataplay();
        addObject(bataplay5,367,339);
        bataplay5.setLocation(361,332);
        bataplay bataplay6 = new bataplay();
        addObject(bataplay6,350,414);
        bataplay6.setLocation(360,410);
        bataplay bataplay7 = new bataplay();
        addObject(bataplay7,354,494);
        bataplay7.setLocation(361,487);
        bataplay bataplay8 = new bataplay();
        addObject(bataplay8,350,586);
        bataplay8.setLocation(360,565);
        start start = new start();
        addObject(start,223,307);
        removeObject(start);
        bataplay bataplay9 = new bataplay();
        addObject(bataplay9,260,65);
        bataplay2.setLocation(145,37);
        bataplay3.setLocation(38,79);
        bataplay4.setLocation(370,132);
        bataplay4.setLocation(369,127);
        bataplay4.setLocation(368,337);
        bataplay5.setLocation(372,129);
        bataplay4.setLocation(151,148);
        bataplay6.setLocation(264,166);
        bataplay7.setLocation(366,251);
        bataplay8.setLocation(36,180);
        bataplay bataplay10 = new bataplay();
        addObject(bataplay10,164,257);
        bataplay bataplay11 = new bataplay();
        addObject(bataplay11,271,282);
        bataplay10.setLocation(50,270);
        bataplay11.setLocation(153,239);
        bataplay bataplay12 = new bataplay();
        addObject(bataplay12,264,265);
        bataplay bataplay13 = new bataplay();
        addObject(bataplay13,376,372);
        bataplay bataplay14 = new bataplay();
        addObject(bataplay14,255,370);
        bataplay13.setLocation(374,352);
        bataplay14.setLocation(66,367);
        bataplay bataplay15 = new bataplay();
        addObject(bataplay15,169,336);
        bataplay15.setLocation(161,332);
        bataplay14.setLocation(52,367);
        bataplay bataplay16 = new bataplay();
        addObject(bataplay16,272,360);
        bataplay bataplay17 = new bataplay();
        addObject(bataplay17,383,456);
        bataplay bataplay18 = new bataplay();
        addObject(bataplay18,338,478);
        bataplay18.setLocation(159,421);
        bataplay17.setLocation(382,438);
        bataplay bataplay19 = new bataplay();
        addObject(bataplay19,282,466);
        bataplay19.setLocation(273,459);
        bataplay bataplay20 = new bataplay();
        addObject(bataplay20,56,460);
        bataplay20.setLocation(51,458);
        bataplay bataplay21 = new bataplay();
        addObject(bataplay21,364,569);
        bataplay21.setLocation(365,545);
        bataplay bataplay22 = new bataplay();
        addObject(bataplay22,175,550);
        bataplay22.setLocation(163,511);
        bataplay bataplay23 = new bataplay();
        addObject(bataplay23,264,558);
        bataplay21.setLocation(381,542);
        bataplay23.setLocation(276,553);
        bataplay bataplay24 = new bataplay();
        addObject(bataplay24,60,556);
        bataplay24.setLocation(56,554);
        start start2 = new start();
        addObject(start2,260,362);
        start2.setLocation(197,301);
        start2.setLocation(198,302);
        bolaplay bolaplay = new bolaplay();
        addObject(bolaplay,235,484);
        start2.setLocation(199,305);
        start2.setLocation(204,309);
        bolaplay bolaplay2 = new bolaplay();
        addObject(bolaplay2,74,411);
        bolaplay bolaplay3 = new bolaplay();
        addObject(bolaplay3,342,429);
        bataplay9.setLocation(259,26);
        bataplay.setLocation(345,40);
        bataplay5.setLocation(347,120);
        bataplay5.setLocation(346,120);
        bataplay6.setLocation(347,198);
        bataplay21.setLocation(347,557);
        bataplay19.setLocation(235,456);
        bataplay23.setLocation(178,504);
        bataplay17.setLocation(344,477);
        bataplay13.setLocation(345,397);
        bataplay19.setLocation(245,400);
        bataplay16.setLocation(243,479);
        bataplay23.setLocation(242,556);
        bataplay22.setLocation(143,553);
        bataplay22.setLocation(133,556);
        bataplay22.setLocation(139,556);
        bataplay24.setLocation(39,555);
        bataplay20.setLocation(39,477);
        bataplay18.setLocation(142,478);
        bataplay15.setLocation(144,400);
        bataplay15.setLocation(141,396);
        bataplay14.setLocation(37,398);
        bataplay9.setLocation(244,40);
        bataplay2.setLocation(141,41);
        bataplay3.setLocation(41,44);
        bataplay4.setLocation(241,119);
        bataplay8.setLocation(139,123);
        bataplay10.setLocation(36,124);
        bataplay12.setLocation(242,199);
        bataplay11.setLocation(137,203);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(366,251);
        bataplay7.setLocation(33,202);
        start2.setLocation(204,308);
        bolaplay3.setLocation(315,311);
        start2.setLocation(182,337);
        removeObject(start2);
        bolaplay.setLocation(250,314);
        bolaplay2.setLocation(124,322);
        bolaplay.setLocation(237,314);
        bolaplay2.setLocation(108,300);
        bolaplay.setLocation(218,300);
        bolaplay3.setLocation(319,303);
        start start3 = new start();
        addObject(start3,215,322);
        start3.setLocation(208,318);
        bataplay12.act();
        start3.setLocation(196,431);
        removeObject(bolaplay3);
        removeObject(bolaplay);
        start3.setLocation(203,304);
        judul judul = new judul();
        addObject(judul,246,227);
        judul.setLocation(191,188);
        judul.setLocation(190,193);
        judul.setLocation(189,140);
        judul.setLocation(189,133);
        bataplay19.setLocation(298,52);
        judul.setLocation(189,133);
        judul.setLocation(189,133);
        judul.setLocation(189,133);
        judul.setLocation(189,133);
        judul.setLocation(189,133);
        removeObject(judul);
        bataplay6.setLocation(362,60);
        bataplay13.setLocation(360,151);
        bataplay12.setLocation(309,170);
        bataplay4.setLocation(188,165);
        bataplay11.setLocation(147,190);
        bataplay8.setLocation(207,101);
        bataplay2.setLocation(118,121);
        bataplay10.setLocation(79,159);
        bataplay7.setLocation(176,197);
        bataplay15.setLocation(161,28);
        bataplay14.setLocation(53,103);
        bataplay20.setLocation(244,187);
        bataplay16.setLocation(265,112);
        bataplay17.setLocation(368,195);
        bataplay21.setLocation(104,49);
        bataplay18.setLocation(32,142);
        bataplay24.setLocation(64,201);
        bataplay22.setLocation(363,76);
        bataplay23.setLocation(157,84);
        judul judul2 = new judul();
        addObject(judul2,222,202);
        judul2.setLocation(238,153);
        start3.setLocation(196,320);
        start3.setLocation(206,319);
        start3.setLocation(201,329);
        bolaplay2.setLocation(200,330);
        tutorial tutorial = new tutorial();
        addObject(tutorial,259,425);
        tutorial.setLocation(203,399);
        about about = new about();
        addObject(about,269,516);
        about.setLocation(206,470);
        about.setLocation(204,470);
    }
}