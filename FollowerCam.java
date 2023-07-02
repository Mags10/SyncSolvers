import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FollowerCam extends Entity
{
    private Entity asoc;
    private boolean isDrawed = false;
    private boolean fixedToButton = true;
    private GreenfootImage imgLocal;
    private int dx = 0;
    private int orgdx = 0;
    private int dy = 0;
    private int orgdy = 0;
    private boolean shakeEnabled = false;
    
    FollowerCam(Entity e, int dx, int dy){
        this.orgdx = this.dx = dx;
        this.orgdy = this.dy = dy;
        this.asoc = e;
        GreenfootImage image = new GreenfootImage(1, 1);
        setImage(image);
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
    
    public void goToOriginalOfset(){
        this.dx = this.orgdx;
        this.dy = this.orgdy;
    }
    
    private int cont = 0;
    
    public void enableShake(){
        shakeEnabled = true;
    }
    
    public void act()
    {
        int x, y;
        if (shakeEnabled) {
            cont++;
            int shakeOffsetX = Greenfoot.getRandomNumber(11) - 5;
            int shakeOffsetY = Greenfoot.getRandomNumber(11) - 5;
            dx += shakeOffsetX;
            dy += shakeOffsetY;
            if(cont >= 50) {
                shakeEnabled = false;
                cont = 0;
            }
        }
        x = this.asoc.getX() + this.dx;
        y = this.asoc.getY() + this.dy;
        if(this.asoc.getX() + this.dx - 300 <= 0){
            x = 300;
        }
        if(this.asoc.getY() + this.dy - 200 <= 0){
            y = 200;
        }
        if(this.asoc.getX() + this.dx + 300 >= this.getWorld().getWidth()){
            x = this.getWorld().getWidth() - 300;
        }
        if(this.asoc.getY() + this.dy + 200 >= this.getWorld().getHeight()){
            y = this.getWorld().getHeight() - 200;
        }
        setLocation(x, y);
        //setLocation(this.asoc.getX() + this.dx, this.asoc.getY() + this.dy);
        
        
        
    }
    
}

