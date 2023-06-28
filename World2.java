import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends Screen
{
    Nivel1 n1 = new Nivel1();
    Nivel2 n2 = new Nivel2();
    Nivel3 n3 = new Nivel3();
    Nivel4 n4 = new Nivel4();
    Regresar r = new Regresar();
    
    public World2()
    {
        addObject(n1,120,50);
        addObject(n2,240,150);
        addObject(n3,360,250);
        addObject(n4,480,350);
        addObject(r, 550, 50);
    }
    public void act(){
        if(Greenfoot.mouseClicked(n1)){
            Lvl5 lvl1 = new Lvl5();
            Greenfoot.setWorld(lvl1);
        }
        if(Greenfoot.mouseClicked(n2)){
            Lvl6 lvl2 = new Lvl6();
            Greenfoot.setWorld(lvl2);
        }
        if(Greenfoot.mouseClicked(n3)){
            Lvl7 lvl3 = new Lvl7();
            Greenfoot.setWorld(lvl3);
        }
        if(Greenfoot.mouseClicked(n4)){
            Lvl8 lvl4 = new Lvl8();
            Greenfoot.setWorld(lvl4);
        }
        if(Greenfoot.mouseClicked(r)){
            SubWorlds worldmenu = new SubWorlds();
            Greenfoot.setWorld(worldmenu);
        }
    }
}
