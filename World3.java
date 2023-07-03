import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends Screen
{
    Nivel1 n1 = new Nivel1();
    Nivel2 n2 = new Nivel2();
    Nivel3 n3 = new Nivel3();
    Nivel4 n4 = new Nivel4();
    Regresar r = new Regresar();
    
    public World3()
    {
        GreenfootImage img = new GreenfootImage("Background-4.png");
        setBackground(img);
        addObject(n1,120,50);
        addObject(n2,240,150);
        addObject(n3,360,250);
        addObject(n4,480,350);
        addObject(r, 550, 50);
    }
    public void act(){
        if(Greenfoot.mouseClicked(n1)){
            Lvl1 lvl1 = new Lvl1(3);
            Camera c = new Camera(lvl1, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(n2)){
            Lvl2 lvl2 = new Lvl2(3);
            Camera c = new Camera(lvl2, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(n3)){
            Lvl3 lvl3 = new Lvl3(3);
            Camera c = new Camera(lvl3, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(n4)){
            Lvl4 lvl4 = new Lvl4(3);
            Camera c = new Camera(lvl4, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(r)){
            SubWorlds worldmenu = new SubWorlds();
            Greenfoot.setWorld(worldmenu);
        }
     }
}
