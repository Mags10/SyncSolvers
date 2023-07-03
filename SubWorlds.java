import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class SubWorlds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubWorlds extends Screen
{   MenuDificil b1 = new MenuDificil();
    MenuMedio b2 = new MenuMedio();
    MenuFacil b3 = new MenuFacil();
    Regresar r = new Regresar();
    private GreenfootSound music;
    public SubWorlds()
    {
        GreenfootImage img = new GreenfootImage("Background-4.png");
        setBackground(img);
        addObject(b1,150,300);
        addObject(b2,150,200);
        addObject(b3,150,100);
        Button t = new TituloJuego();
        addObject(t,439,200);
        addObject(r, 550, 50);
    }
    public SubWorlds(GreenfootSound music)
    {
        GreenfootImage img = new GreenfootImage("Background-4.png");
        setBackground(img);
        addObject(b1,150,300);
        addObject(b2,150,200);
        addObject(b3,150,100);
        Button t = new TituloJuego();
        addObject(t,439,200);
        addObject(r, 550, 50);
        this.music = music;
    }
    public void act(){
        if(Greenfoot.mouseClicked(b3)){
            World1 world1 = new World1();
            Greenfoot.setWorld(world1);
        }
        if(Greenfoot.mouseClicked(b2)){
            World2 world2 = new World2();
            Greenfoot.setWorld(world2);
        }
        if(Greenfoot.mouseClicked(b1)){
            World3 world3 = new World3();
            Greenfoot.setWorld(world3);
        }
        if(Greenfoot.mouseClicked(r)){
            IntroMenu worldmenu = new IntroMenu(this.music);
            music.stop();
            Greenfoot.setWorld(worldmenu);
        }
    }
}
