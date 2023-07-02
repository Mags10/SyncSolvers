import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Scenary
{
    private Ground top, button;
    private Wall left, right;
    
    private int Vdensity;
    private int Hdensity;
    
    public Block(int width, int height){
        super(width, height);
        this.Vdensity = height;
        this.Hdensity = 6;
        this.top = new Ground(width, this.Vdensity);
        this.left = new Wall(this.Hdensity, height - 2, true);
        this.right = new Wall(this.Hdensity, height - 2, false);
    }
    
    private boolean drawed = false;
    
    public void act(){
        if(!this.drawed){
            this.getWorld().addObject(this.top, this.getX(), this.getTop() + this.Vdensity / 2);
            this.getWorld().addObject(this.left, this.getLeft() + this.Hdensity/2, this.getY());
            this.getWorld().addObject(this.right, this.getRight() - this.Hdensity/2, this.getY());
            this.drawed = true;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
