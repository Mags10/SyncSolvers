import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Mute representa un botón de silencio (mute).
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se presiona el botón, se actualiza su imagen para mostrar "mute.png" y se escala
 * la imagen al doble del tamaño original.
 * 
 * Nota: Esta clase define el comportamiento del botón de silencio en la interfaz del juego.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class Mute extends Button{
    /**
     * Realiza las acciones correspondientes al botón de silencio (mute).
     * Este método es llamado automáticamente en cada ciclo del juego.
     * Actualiza la imagen del botón para mostrar la imagen "mute.png" y la escala al
     * doble del tamaño original.
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("mute.png");
        int nuevoAncho = imagen.getWidth() / 5; // Doble del ancho original
        int nuevoAlto = imagen.getHeight() / 5; // Doble de la altura original
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen);   
    }
}
