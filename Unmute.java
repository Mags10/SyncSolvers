import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Unmute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unmute extends Button
{
    /**
     * Act - do whatever the Unmute wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage imagen = new GreenfootImage("unmute.png");
        int nuevoAncho = imagen.getWidth() / 5; // Doble del ancho original
        int nuevoAlto = imagen.getHeight() / 5; // Doble de la altura original
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen);   
    }
}
