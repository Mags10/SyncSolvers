import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Clase SubWorlds: representa la pantalla de selección de niveles del juego.
 * Extiende la clase Screen.
 * 
 * @author Noe Cisneros
 * @version 01/07/2023
 */
public class SubWorlds extends Screen{   
    
    MenuDificil b1 = new MenuDificil();
    MenuMedio b2 = new MenuMedio();
    MenuFacil b3 = new MenuFacil();
    Regresar r = new Regresar();
    private GreenfootSound music;
    
    /**
     * Constructor de la clase SubWorlds sin parámetros.
     * Prepara la pantalla de selección de niveles.
     */
    public SubWorlds(){
        GreenfootImage img = new GreenfootImage("Background-4.png");
        setBackground(img);
        addObject(b1,150,300);
        addObject(b2,150,200);
        addObject(b3,150,100);
        Button t = new TituloJuego();
        addObject(t,439,200);
        addObject(r, 550, 50);
    }
    
    /**
     * Constructor de la clase SubWorlds con parámetros.
     * Prepara la pantalla de selección de niveles con la música de fondo especificada.
     * 
     * @param music Música de fondo
     */
    public SubWorlds(GreenfootSound music){
        GreenfootImage img = new GreenfootImage("Background-4.png");
        setBackground(img);
        addObject(b1,150,300);
        addObject(b2,150,200);
        addObject(b3,150,100);
        Button t = new TituloJuego();
        addObject(t,439,200);
        addObject(r, 550, 50);
        this.music = music;
    }
    
    /**
     * Método act que se ejecuta en cada ciclo del juego.
     * Verifica si se ha hecho clic en los botones de los niveles o el botón de regresar.
     * Realiza las acciones correspondientes según la opción seleccionada.
     */
    public void act(){
        if(Greenfoot.mouseClicked(b3)){
            World1 world1 = new World1(this.music);
            Greenfoot.setWorld(world1);
        }
        if(Greenfoot.mouseClicked(b2)){
            World2 world2 = new World2(this.music);
            Greenfoot.setWorld(world2);
        }
        if(Greenfoot.mouseClicked(b1)){
            World3 world3 = new World3(this.music);
            Greenfoot.setWorld(world3);
        }
        if(Greenfoot.mouseClicked(r)){
            IntroMenu worldmenu = new IntroMenu(this.music);
            music.stop();
            Greenfoot.setWorld(worldmenu);
        }
    }
}
