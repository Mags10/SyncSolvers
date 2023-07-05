import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase World2: representa el mundo de selección de niveles.
 * Extiende la clase Screen.
 * 
 * @author Noe Cisneros
 * @version 30/06/2023
 */
public class World2 extends Screen{
    
    Nivel1 n1 = new Nivel1();
    Nivel2 n2 = new Nivel2();
    Nivel3 n3 = new Nivel3();
    Nivel4 n4 = new Nivel4();
    Regresar r = new Regresar();
    private GreenfootSound music;
    
    /**
     * Constructor de la clase World2.
     * Crea el mundo de selección de niveles y asigna la música.
     * 
     * @param s Música de fondo
     */
    public World2(GreenfootSound s){
        this.music = s;
        GreenfootImage img = new GreenfootImage("Background-4.png");
        setBackground(img);
        addObject(n1,120,50);
        addObject(n2,240,150);
        addObject(n3,360,250);
        addObject(n4,480,350);
        addObject(r, 550, 50);
    }
    
    /**
     * Método act que se ejecuta en cada ciclo del juego.
     * Verifica si se ha hecho clic en alguno de los niveles o en el botón de regresar.
     * Si se ha hecho clic en un nivel, detiene la música y comienza ese nivel.
     * Si se ha hecho clic en regresar, regresa al menú de submundos.
     */
    public void act(){
        if(Greenfoot.mouseClicked(n1)){
            music.stop();
            Lvl1 lvl1 = new Lvl1(2);
            Camera c = new Camera(lvl1, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(n2)){
            music.stop();
            Lvl2 lvl2 = new Lvl2(2);
            Camera c = new Camera(lvl2, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(n3)){
            music.stop();
            Lvl3 lvl3 = new Lvl3(2);
            Camera c = new Camera(lvl3, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(n4)){
            music.stop();
            Lvl4 lvl4 = new Lvl4(2);
            Camera c = new Camera(lvl4, 300, 200);
            Greenfoot.setWorld(c);
        }
        if(Greenfoot.mouseClicked(r)){
            SubWorlds worldmenu = new SubWorlds();
            Greenfoot.setWorld(worldmenu);
        }
    }
}
