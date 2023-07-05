import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Clase ButtonPlay: representa un botón de reproducción en el escenario.
 * Extiende la clase Button.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class ButtonPlay extends Button{
    /**
     * Act - realiza las acciones que el botón de reproducción desea hacer. Este método se llama siempre que
     * se presiona el botón "Act" o "Run" en el entorno.
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("play.png");
        setImage(imagen);
    }

}
