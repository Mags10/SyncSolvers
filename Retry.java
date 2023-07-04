import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry extends Button
{
    public Retry(){
    GreenfootImage imagen = new GreenfootImage("Retry.png");
    int nuevoAncho = imagen.getWidth() / 2; // Doble del ancho original
    int nuevoAlto = imagen.getHeight() / 2; // Doble de la altura original
    imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
    setImage(imagen);  
    }
    public void act()
    {
    }
}
