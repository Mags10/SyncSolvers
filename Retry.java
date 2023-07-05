import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Retry representa un botón para reiniciar un nivel o juego.
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se crea una instancia de Retry, se configura su imagen para mostrar "Retry.png".
 * 
 * Nota: Esta clase define el comportamiento del botón de reinicio en la interfaz.
 * 
 * @author Noe Cisneros
 * @version 29/06/2023
 */
public class Retry extends Button{
    /**
     * Crea una instancia de Retry.
     * Configura la imagen del botón para mostrar "Retry.png" y la escala al tamaño deseado.
     */
    public Retry(){
        GreenfootImage imagen = new GreenfootImage("Retry.png");
        int nuevoAncho = imagen.getWidth() / 2; // Doble del ancho original
        int nuevoAlto = imagen.getHeight() / 2; // Doble de la altura original
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen);  
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
}
