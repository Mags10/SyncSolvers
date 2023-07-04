import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Scenary
{
    
    private Sprite texture;
    private GreenfootImage image;
    private int numFrame = 0;
    private int textureIndex = 0;
    private boolean isDrawed = false;
    private boolean act = true;
    
    Orb(){
        super(24, 24);
        this.image = new GreenfootImage("orb1.png");
        this.texture = new Sprite(this.image, this, 1);
    }
    /**
     * Act - do whatever the Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(this.act){
            if(!isDrawed && this != null){
                this.getWorld().addObject(this.texture, 0, 0);
            }
            this.texture.setRotation(this.texture.getRotation()+1);
        }
    }
    
    public void delete(){
        this.act = false;
        this.setLocation(-500, -500);
    }
    
}
