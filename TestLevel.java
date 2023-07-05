import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestLevel extends Level
{

    public TestLevel()
    {   
        super(2000, 1200, 1, new GreenfootImage("Map002.png"), 1);
        prepare();
        
    }
    
    private void prepare()
    {

        Player player = new Player();
        addObject(player,62,750);
        
        player = new Player();
        addObject(player,82,750);
        
        player = new Player();
        addObject(player,102,750);

        Ground g = new Ground(2000);
        addObject(g, 1000, 800);
    }
    
    
}
