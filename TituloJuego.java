import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase TituloJuego representa un actor que muestra el título del juego.
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se crea una instancia de TituloJuego, se configura su imagen para mostrar "titulojuego.png".
 * 
 * Nota: Esta clase define la apariencia del título del juego en la interfaz.
 * 
 * @autor Noe Cisneros
 * @version 29/06/2023
 */
public class TituloJuego extends Button{
    /**
     * Define el comportamiento del título del juego.
     * Configura la imagen del actor para mostrar "titulojuego.png".
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("titulojuego.png");
        setImage(imagen);
    }
}
