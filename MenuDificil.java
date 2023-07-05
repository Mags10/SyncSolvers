import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase MenuDificil: representa un botón para seleccionar la dificultad "Difícil" en un menú.
 * Extiende la clase Button.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class MenuDificil extends Button{
    /**
     * Realiza las acciones correspondientes al botón de dificultad "Difícil".
     * Este método es llamado automáticamente en cada ciclo del juego.
     * Actualiza la imagen del botón para mostrar la imagen "dificil.png".
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("dificil.png");
        setImage(imagen);
    }
}
