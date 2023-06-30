import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button
{
    public PlayButton(){
        GreenfootImage imagen = new GreenfootImage("jugar.png"); // Obtiene la imagen original
        int nuevoAncho = imagen.getWidth() ; // Doble del ancho original
        int nuevoAlto = imagen.getHeight() ; // Doble de la altura original
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen);    
    }
    public void act()
    {
       
    }
}