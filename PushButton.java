import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PushButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PushButton extends Scenary
{
    private Sprite btn;
    private boolean state = false;
    private boolean drawed = false;
    private Laser asoc;
    private String color;
    
    PushButton(Laser asoc, String color){
        super(24, 24);
        this.asoc = asoc;
        this.color = color;
        GreenfootImage ls = new GreenfootImage(this.color + "Button.png");
        this.btn = new Sprite(ls, this, 1, true);
    }
    /**
     * Act - do whatever the PushButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(!drawed){
            this.getWorld().addObject(this.btn, 0, 0);
            this.drawed = true;
        }
    }
    
    public void push(){
        this.state = !this.state;
        this.asoc.changeState();
        if(this.state)
            this.btn.updateSprite(new GreenfootImage(this.color + "ButtonPushed.png"));
        else
            this.btn.updateSprite(new GreenfootImage(this.color + "Button.png"));
    }
}
