import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sprite extends Actor
{
    private Entity asoc;
    private double scale;
    private boolean isDrawed = false;
    private boolean fixedToButton = true;
    private GreenfootImage imgLocal;
    private int dx = 0;
    private int orgdx = 0;
    private int dy = 0;
    private int orgdy = 0;
    
    Sprite(GreenfootImage img, Entity e, double scale){
        this.asoc = e;
        this.imgLocal = img;
        this.scale = e.getHeight() / img.getHeight() + scale;
        img.scale(((int)((double)e.getWidth() * scale)), ((int)((double)e.getHeight() * scale)));
        //img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, Entity e, double scale, int dx, int dy){
        this.orgdx = this.dx = dx;
        this.orgdy = this.dy = dy;
        this.asoc = e;
        this.imgLocal = img;
        this.scale = e.getHeight() / img.getHeight() + scale;
        img.scale(((int)((double)e.getWidth() * scale)), ((int)((double)e.getHeight() * scale)));
        //img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, double scale){
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    public void updateSprite(GreenfootImage img){
        //img.scale(((int)((double)this.asoc.getWidth() * this.scale)), ((int)((double)this.asoc.getHeight() * this.scale)));
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    public void modifyCameraXOfset(int stepSize, int max){
        if(this.dx < this.orgdx+max && this.dx > this.orgdx-max)
        this.dx += stepSize;
    }
    
    public void modifyCameraYOfset(int stepSize, int max){
        if(this.dy < this.orgdy+max && this.dy > this.orgdy-max)
        this.dy += stepSize;
    }
    
    public void goToOriginalOfsetByStep(int XstepSize, int YstepSize){
        if(this.dx < this.orgdx){
            this.dx += XstepSize;
            if(this.dx > this.orgdx)
                this.dx = this.orgdx;
        }
        if(this.dx > this.orgdx){
            this.dx -= XstepSize;
            if(this.dx < this.orgdx)
                this.dx = this.orgdx;
        }
        if(this.dy < this.orgdy){
            this.dy += YstepSize;
            if(this.dy > this.orgdy)
                this.dy = this.orgdy;
        }
        if(this.dy > this.orgdy){
            this.dy -= YstepSize;
            if(this.dy < this.orgdy)
                this.dy = this.orgdy;
        }
    }

    int steps = 400;
    int currentStep;
    
    public void goTo(Actor a){
        return;
    }
    
    public void act()
    {
        // Add your action code here.
        if(this.fixedToButton){
            setLocation(this.asoc.getX() + this.dx, this.asoc.getBotton() - this.imgLocal.getHeight() / 2 + this.dy);
        }else{
            setLocation(this.asoc.getX() + this.dx, this.asoc.getY() + this.dy);
        }
        
    }
    
}
