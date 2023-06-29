import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl12 extends Level
{

    /**
     * Constructor for objects of class TestLevel.
     * 
     */
    public Lvl12()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200);
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * super.setCamera(player);
     */
    private void prepare()
    {
        for(int i = 100; i < 1200; i += 100){
            Player player = new Player();
            addObject(player,100, i - 50);
            Ground ground = new Ground(1900);
            addObject(ground,1000,i);
        }
    }
}
