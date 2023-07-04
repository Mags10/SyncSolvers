import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class DeathScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathScreen extends Screen
{
    Salir s = new Salir();
    Retry r = new Retry();
    private GreenfootSound music;
    private Level lvl;
    private int d;
    
    public DeathScreen()
    {   
        prepare();
    }
    public DeathScreen(Level tmp, int dificulty)
    {   
        this.lvl = tmp;
        this.d = dificulty;
        prepare();
    }
    public void prepare(){
        DeathSC ds = new DeathSC();
        addObject(ds,300,200);
        addObject(s,530, 40);
        addObject(r,70, 40);
        music = new GreenfootSound("FallenDown.mp3");
        music.setVolume(30);
        music.playLoop();
    }
    public void act(){
    if(Greenfoot.mouseClicked(s)){
        music.stop();
        IntroMenu worldmenu = new IntroMenu();
        Greenfoot.setWorld(worldmenu);    
    }
    if(Greenfoot.mouseClicked(r)){
        if(this.lvl instanceof Lvl1){
            music.stop();
            Lvl1 lvl1 = new Lvl1(d);
            Camera c = new Camera(lvl1, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(this.lvl instanceof Lvl2){
            music.stop();
            Lvl2 lvl2 = new Lvl2(d);
            Camera c = new Camera(lvl2, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(this.lvl instanceof Lvl3){
            music.stop();
            Lvl3 lvl3 = new Lvl3(d);
            Camera c = new Camera(lvl3, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(this.lvl instanceof Lvl4){
            music.stop();
            Lvl4 lvl4 = new Lvl4(d);
            Camera c = new Camera(lvl4, 300, 200);
            Greenfoot.setWorld(c);
        }
    }
}
}
