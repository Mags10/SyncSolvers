import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Clase DeathScreen: representa la pantalla de muerte en el juego.
 * Extiende la clase Screen.
 * 
 * @author Noe Cisneros
 * @version 02/07/2023
 */
public class DeathScreen extends Screen {
    
    Salir s = new Salir();
    Retry r = new Retry();
    private GreenfootSound music;
    private Level lvl;
    private int d;
    
    /**
     * Constructor de la clase DeathScreen sin parámetros.
     * Prepara la pantalla de muerte.
     */
    public DeathScreen(){   
        prepare();
    }
    
    /**
     * Constructor de la clase DeathScreen con parámetros.
     * Prepara la pantalla de muerte con el nivel y dificultad especificados.
     * 
     * @param tmp       Nivel
     * @param dificulty Dificultad
     */
    public DeathScreen(Level tmp, int dificulty){   
        this.lvl = tmp;
        this.d = dificulty;
        prepare();
    }
    
    /**
     * Método para preparar la pantalla de muerte.
     * Crea y agrega los actores necesarios a la pantalla.
     * Inicia la reproducción de la música de fondo.
     */
    public void prepare(){
        DeathSC ds = new DeathSC();
        addObject(ds,300,200);
        addObject(s,530, 40);
        addObject(r,70, 40);
        music = new GreenfootSound("FallenDown.mp3");
        music.setVolume(30);
        music.playLoop();
    }
    
    /**
     * Método act que se ejecuta en cada ciclo del juego.
     * Verifica si se ha hecho clic en los actores de salir o volver a intentar.
     * Realiza las acciones correspondientes según la opción seleccionada.
     */
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
