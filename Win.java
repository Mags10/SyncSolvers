import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends Screen
{
    Salir s = new Salir();
    private GreenfootSound music;
    public Win()
    {
        prepare();
    }
    public void prepare(){
        WinS w = new WinS();
        addObject(w,300,200);
        addObject(s,530, 40);
        music = new GreenfootSound("Dating Start.mp3");
        music.setVolume(30);
        music.playLoop();
    }
    public void act(){
    if(Greenfoot.mouseClicked(s)){
        music.stop();
        IntroMenu worldmenu = new IntroMenu();
        Greenfoot.setWorld(worldmenu);    
    }

}
}
