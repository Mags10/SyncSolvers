import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends Scenary
{
    /**
     * Act - do whatever the Finish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Sprite texture;
    private boolean isDrawed = false;
    
    public Finish(){
        super(48, 72);
        this.texture = new Sprite(new GreenfootImage("portal1.png"), this, 0.15, true);
    }
    
    private int keyFrame = 0;
    private boolean toUp = true;
    private boolean alternate = true;
    
    public void act()
    {
        // Add your action code here.
        if(!isDrawed){
            this.getWorld().addObject(this.texture, 0, 0);
        }
        
        if(alternate){
            if(keyFrame < 3 && toUp){
                keyFrame++;
                toUp = true;
            }else{
                keyFrame--;            
                if(keyFrame < -3)
                    toUp = true;
                else
                    toUp = false;
            }
            this.texture.setOffset(0, keyFrame);
        }
        this.alternate = !this.alternate;
    }
}
