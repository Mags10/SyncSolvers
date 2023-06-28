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
        addObject(n1,120,50);
        addObject(n2,240,150);
        addObject(n3,360,250);
        addObject(n4,480,350);
        addObject(r, 550, 50);
    }
    public void act(){
        if(Greenfoot.mouseClicked(n1)){
            Lvl9 lvl1 = new Lvl9();
            Greenfoot.setWorld(lvl1);
        }
        if(Greenfoot.mouseClicked(n2)){
            Lvl10 lvl2 = new Lvl10();
            Greenfoot.setWorld(lvl2);
        }
        if(Greenfoot.mouseClicked(n3)){
            Lvl11 lvl3 = new Lvl11();
            Greenfoot.setWorld(lvl3);
        }
        if(Greenfoot.mouseClicked(n4)){
            Lvl12 lvl4 = new Lvl12();
            Greenfoot.setWorld(lvl4);
        }
        if(Greenfoot.mouseClicked(r)){
            SubWorlds worldmenu = new SubWorlds();
            Greenfoot.setWorld(worldmenu);
        }
     }
}
