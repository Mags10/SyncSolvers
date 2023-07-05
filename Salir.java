import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Salir representa un botón para salir del juego.
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se crea una instancia de Salir, se configura su imagen para mostrar "Salir.png".
 * 
 * Nota: Esta clase define el comportamiento del botón de salida en la interfaz.
 * 
 * @autor Noe Cisneros
 * @version 29/06/2023
 */
public class Salir extends Button{
    /**
     * Crea una instancia de Salir.
     * Configura la imagen del botón para mostrar "Salir.png" y la escala al tamaño deseado.
     */
    public Salir(){
        GreenfootImage imagen = new GreenfootImage("Salir.png");
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
