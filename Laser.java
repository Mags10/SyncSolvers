import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Scenary
{
    private Sprite laser, top, button;
    private Wall left, right;
    
    Laser(int height){
        super(24, height);
        GreenfootImage ls = new GreenfootImage("laser.png");
        ls.scale(12, height-6);
        this.laser = new Sprite(ls, this, 1, true);
        this.laser.setToButton(false);
        ls = new GreenfootImage("FromLaser.png");
        ls.scale(24, 6);
        this.button = new Sprite(ls, this, 1, true);
        ls = new GreenfootImage("FromLaser.png");
        ls.scale(24, 6);
        this.top = new Sprite(ls, this, 1, true);
        this.top.setToButton(false);
        this.left = new Wall(1, height, true);
        this.right = new Wall(1, height, false);
    }
    
    private boolean drawed = false;
    
    private boolean isOpened = false;
    private boolean drawOpened = false;
    
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(!drawed){
            this.getWorld().addObject(this.laser, 0, 0);
            this.getWorld().addObject(this.button, 0, 0);
            this.getWorld().addObject(this.top, 0, 0);
            this.top.setOffset(0, -this.getHeight()/2 + 3);
            this.getWorld().addObject(this.left, this.getLeft(), this.getY());
            this.getWorld().addObject(this.right, this.getRight() - 1, this.getY());
            this.drawed = true;
        }
        if(isOpened && !drawOpened){
            this.getWorld().removeObject(this.left);
            this.getWorld().removeObject(this.right);
            this.getWorld().removeObject(this.laser);
            drawOpened = true;
        }
        if(!isOpened && !drawOpened){
            this.getWorld().addObject(this.laser, 0, 0);
            this.getWorld().addObject(this.left, this.getLeft(), this.getY());
            this.getWorld().addObject(this.right, this.getRight() - 1, this.getY());
            drawOpened = true;
        }
    }
    
    public void changeState(){
        this.isOpened = !this.isOpened;
        this.drawOpened = false;
    }
}
