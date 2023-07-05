import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Unmute representa un botón para desactivar el silencio del sonido.
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se crea una instancia de Unmute, se configura su imagen para mostrar "unmute.png"
 * y se escala al nuevo tamaño.
 * 
 * Nota: Esta clase define la apariencia del botón de desactivar el silencio en la interfaz.
 * 
 * @autor Noe Cisneros
 * @version 29/06/2023
 */
public class Unmute extends Button{
    /**
     * Define el comportamiento del botón de desactivar el silencio.
     * Configura la imagen del actor para mostrar "unmute.png" y la escala al nuevo tamaño.
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("unmute.png");
        int nuevoAncho = imagen.getWidth() / 5; // Doble del ancho original
        int nuevoAlto = imagen.getHeight() / 5; // Doble de la altura original
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen);   
    }
}
