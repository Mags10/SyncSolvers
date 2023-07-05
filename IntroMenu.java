import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase IntroMenu representa el menú de introducción del juego.
 * Extiende la clase World de Greenfoot y proporciona funcionalidad para el menú de inicio.
 * 
 * @author Noe Cisneros
 * @version 03/07/2023
 */
public class IntroMenu extends World
{
    Mute m = new Mute();
    Unmute um = new Unmute();
    PlayButton pb = new PlayButton();
    ButtonPlay play = new ButtonPlay();
    private GreenfootSound music;
    private boolean musicB = true;
    
    /**
     * Constructor de objetos de la clase IntroMenu.
     * Crea un nuevo mundo de tamaño 600x400 con un fondo y prepara los elementos del menú.
     */
    public IntroMenu(){  
       super(600, 400, 1);
       GreenfootImage img = new GreenfootImage("Background-4.png");
       setBackground(img);
       prepare();
    }
    /**
     * Constructor de objetos de la clase IntroMenu.
     * Crea un nuevo mundo de tamaño 600x400 con un fondo y prepara los elementos del menú.
     * 
     * @param music La música de fondo para reproducir en el menú de introducción.
     */
    public IntroMenu(GreenfootSound music){  
       super(600, 400, 1);
       GreenfootImage img = new GreenfootImage("Background-4.png");
       setBackground(img);
       this.music = music;
       this.musicB = true;
       prepare();

    }
    /**
     * Prepara los elementos del menú y los agrega al mundo.
     */
    private void prepare()
    {
        Planeta p = new Planeta();
        addObject(p,210,206);  
        addObject(m,60, 380);
        addObject(um,20, 380);
        addObject(pb,477,250);
        addObject(play,477,180);
        if(musicB)
        music = new GreenfootSound("Ruins-Undertale.mp3");
        if(!music.isPlaying()){
        music.setVolume(30);
        music.playLoop();
        }
    }
    /**
     * Método que se llama repetidamente para realizar acciones en el mundo.
     * Verifica si se ha hecho clic en el botón de reproducción para cambiar al mundo del juego.
     * Verifica si se ha hecho clic en el botón de silencio para detener la reproducción de música.
     * Verifica si se ha hecho clic en el botón de activar sonido para reanudar la reproducción de música.
     */
    public void act(){
        if(Greenfoot.mouseClicked(pb)){      
            SubWorlds worldmenu = new SubWorlds(this.music);
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
