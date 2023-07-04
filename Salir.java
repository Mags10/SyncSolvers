import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Salir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salir extends Button
{
    public Salir(){
    GreenfootImage imagen = new GreenfootImage("Salir.png");
    int nuevoAncho = imagen.getWidth() / 2; // Doble del ancho original
    int nuevoAlto = imagen.getHeight() / 2; // Doble de la altura original
    imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
    setImage(imagen);  
    }
    public void act()
    {
    }
}
