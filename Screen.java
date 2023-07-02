import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends World
{
    Mute m = new Mute();
    Unmute um = new Unmute();
    private GreenfootSound bkgMusic;
    /**
     * Constructor for objects of class Screen.
     * 
     */
    public Screen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(m,60, 380);
        addObject(um,20, 380);
    }
    public void controlMusica(){
        if(Greenfoot.mouseClicked(m)){
            bkgMusic.stop();
        }
        if(Greenfoot.mouseClicked(um)){
            bkgMusic.playLoop();
        }
    }
}
