import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Win: representa la pantalla de victoria del juego.
 * Extiende la clase Screen.
 * 
 * @author Noe Cisneros
 * @version 04/07/2023
 */
public class Win extends Screen{
    Salir s = new Salir();
    private GreenfootSound music;
    
    /**
     * Constructor de la clase Win.
     * Prepara la pantalla de victoria y muestra el puntaje obtenido.
     * 
     * @param puntaje Puntaje obtenido
     * @param max Puntaje máximo posible
     */
    public Win(int puntaje, int max){
        prepare();
        Sprite orbText = new Sprite(new GreenfootImage(puntaje + "/" + max, 32, Color.WHITE, null), 1);
        addObject(orbText, 300, 350);
        orbText.setOffset(-12, 0);
        Sprite orbIndicator = new Sprite(new GreenfootImage("orb1.png"), 1);
        addObject(orbIndicator, 300, 350);
        orbIndicator.setOffset(38, 0);
    }
    
    /**
     * Método que prepara la pantalla de victoria.
     * Crea y añade los elementos necesarios a la pantalla.
     */
    public void prepare(){
        WinS w = new WinS();
        addObject(w,300,200);
        addObject(s,530, 40);
        music = new GreenfootSound("Dating Start.mp3");
        music.setVolume(30);
        music.playLoop();
    }
    
    /**
     * Método act que se ejecuta en cada ciclo del juego.
     * Verifica si se ha hecho clic en el botón de salir.
     * Si se ha hecho clic, detiene la música y regresa al menú principal.
     */
    public void act(){
    if(Greenfoot.mouseClicked(s)){
        music.stop();
        IntroMenu worldmenu = new IntroMenu();
        Greenfoot.setWorld(worldmenu);    
    }

}
}
