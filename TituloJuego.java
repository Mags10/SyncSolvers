import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TituloJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TituloJuego extends Button
{
    /**
     * Act - do whatever the TituloJuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage imagen = new GreenfootImage("titulojuego.png");
        setImage(imagen);
    }
}
