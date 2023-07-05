import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase PlayButton representa un botón para comenzar el juego.
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se crea una instancia de PlayButton, se configura su imagen para mostrar "jugar.png".
 * 
 * Nota: Esta clase define el comportamiento del botón de inicio del juego en la interfaz.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class PlayButton extends Button{
    /**
     * Crea una instancia de PlayButton.
     * Configura la imagen del botón para mostrar "jugar.png" y escala la imagen al tamaño original.
     */
    public PlayButton(){
        GreenfootImage imagen = new GreenfootImage("jugar.png"); // Obtiene la imagen original
        int nuevoAncho = imagen.getWidth() ; // Doble del ancho original
        int nuevoAlto = imagen.getHeight() ; // Doble de la altura original
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen);    
    }
    
    public void act()
    {
        // Add your action code here.
    }
}