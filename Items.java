import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items extends Entity
{
    private Sprite texture;
    private boolean drawed = false;
    /**
     * Act - do whatever the Items wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Items(String textInitial) {
        super(new GreenfootImage(textInitial), 15, 1, true);
    }
    public Items() {
        super(15, 15);
    }
    public void act()
    {
        
    }
}
