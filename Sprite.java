import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sprite extends Actor
{
    private Entity asoc = null;
    private Actor asocActor = null;
    private double scale = 1;
    private boolean fixedToButton = true;
    private GreenfootImage imgLocal;
    private int dx = 0;
    private int dy = 0;
    
    Sprite(GreenfootImage img, Entity e, double scale){
        this.asoc = e;
        this.imgLocal = img;
        this.scale = e.getHeight() / img.getHeight() + scale;
        img.scale(((int)((double)e.getWidth() * scale)), ((int)((double)e.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, Entity e, double scale, boolean notScaleToEntity){
        this.asoc = e;
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, Actor e, double scale){
        this.asocActor = e;
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, Actor e, double scale, boolean notScaleToEntity){
        this.asocActor = e;
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, double scale){
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, int width, int height){
        this.imgLocal = img;
        img.scale(width, height);
        setImage(img);
    }
    
    public void updateSprite(GreenfootImage img){
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * this.scale)), ((int)((double)img.getHeight() * this.scale)));
        setImage(img);
    }
    
    public void updateSprite(GreenfootImage img, double scale){
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    public void setOffset(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
        setLocation(this.getX() + this.dx, this.getY() + this.dy);
    }
    
    public void changeEntityObjetive(Entity e){
        this.asoc = e;
    }
    
    public void changeActorObjetive(Actor e){
        this.asocActor = e;
    }
    
    public void setToButton(boolean val){
        this.fixedToButton = val;
    }
    
    public void setTransparency(int value){
        this.imgLocal.setTransparency(value);
        this.setImage(this.imgLocal);
    }
    
    public void act()
    {
        // Add your action code here.
        if(this.asoc != null){
            if(this.fixedToButton){
                setLocation(this.asoc.getX() + this.dx, this.asoc.getBotton() - this.imgLocal.getHeight() / 2 + this.dy);
            }else{
                setLocation(this.asoc.getX() + this.dx, this.asoc.getY() + this.dy);
            }
        }
        if(this.asocActor != null){
            setLocation(this.asocActor.getX() + this.dx, this.asocActor.getY() + this.dy);
        }
            
    }
    
}
