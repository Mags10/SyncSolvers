import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Regresar representa un botón para volver atrás en la interfaz del juego.
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se crea una instancia de Regresar, se configura su imagen para mostrar "return.png".
 * 
 * Nota: Esta clase define el comportamiento del botón de regreso en la interfaz.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class Regresar extends Button{
    /**
     * Realiza las acciones correspondientes al botón de regreso.
     * Este método se llama automáticamente en cada ciclo del juego.
     * En esta implementación, el método establece la imagen del botón para mostrar "return.png".
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("return.png");
        setImage(imagen);
    }
}
