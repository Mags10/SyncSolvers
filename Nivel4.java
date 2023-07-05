import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Nivel1 representa un botón para seleccionar el nivel 4.
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se presiona el botón, se actualiza su imagen para mostrar "nivel 4.png".
 * 
 * Nota: Esta clase define el comportamiento del botón de selección del nivel 4 en la interfaz del juego.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class Nivel4 extends Button
{
    /**
     * Realiza las acciones correspondientes al botón de selección del nivel 4.
     * Este método es llamado automáticamente en cada ciclo del juego.
     * Actualiza la imagen del botón para mostrar la imagen "nivel 4.png".
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("nivel 4.png");
        setImage(imagen);
    }
}
