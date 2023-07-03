import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroMenu extends World
{
    Mute m = new Mute();
    Unmute um = new Unmute();
    PlayButton pb = new PlayButton();
    ButtonPlay play = new ButtonPlay();
    private GreenfootSound music;
    public IntroMenu(){  
       super(600, 400, 1);
       GreenfootImage img = new GreenfootImage("Background-4.png");
       setBackground(img);
       prepare();
    }
    private void prepare()
    {
        Planeta p = new Planeta();
        addObject(p,210,206);  
        addObject(m,60, 380);
        addObject(um,20, 380);
        addObject(pb,477,250);
        addObject(play,477,180);
        music = new GreenfootSound("Ruins-Undertale.mp3");
        if(music.isPlaying()){
         music.stop();
        }else{
        music.setVolume(20);
        music.playLoop();
        }
    }
    public void act(){
        if(Greenfoot.mouseClicked(pb)){      
            SubWorlds worldmenu = new SubWorlds();
            Greenfoot.setWorld(worldmenu);
        }
        if(Greenfoot.mouseClicked(m)){
            music.stop();
        }
        if(Greenfoot.mouseClicked(um)){
            music.playLoop();
        }
    }
}
