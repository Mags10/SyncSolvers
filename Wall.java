import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Scenary
{
    private boolean leftColition;
    
    Wall(int width, int height, boolean leftColition) {
        super(width, height);
        this.leftColition = leftColition;
    }
    
    Wall() {
        super(15, 200);
    }
    
    public boolean isLeftColition(){
        return this.leftColition;
    }
    
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
