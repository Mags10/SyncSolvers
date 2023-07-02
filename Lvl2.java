import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends Level
{

    /**
     * Constructor for objects of class Lvl2.
     * 
     */
    public Lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200);
        prepare();
    }
    
    private void prepare(){

        Ground ground = new Ground();
        addObject(ground,274,316);
        Ground ground2 = new Ground();
        addObject(ground2,438,272);
        ground.setLocation(134,326);
        Player player = new Player();
        addObject(player,174,253);
        Block block = new Block(50, 70);
        addObject(block,400,180);
    }
}
