import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Scenary representa un elemento del escenario en el juego.
 * Puede ser utilizado para crear fondos, obstáculos, decoraciones u otros elementos del escenario.
 * Extiende la clase Entity, que proporciona la funcionalidad básica de un objeto en el juego.
 * 
 * @autor Miguel Gtz
 * @version 28/06/2023
 */
public class Scenary extends Entity{
    
    /**
     * Crea un objeto Scenary con el ancho y alto especificados.
     *
     * @param width El ancho del objeto Scenary.
     * @param height La altura del objeto Scenary.
     */
    public Scenary(int width, int height) {
        super(width, height);
    }
    
    /**
     * Crea un objeto Scenary con el ancho y alto iguales.
     *
     * @param size El ancho y alto del objeto Scenary.
     */
    public Scenary(int width) {
        super(width, width);
    }
    
    public void act() {
        // Code for acting can go here
    }
}
