import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase MenuFacil representa un botón de dificultad "Fácil".
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se presiona el botón, se actualiza su imagen para mostrar "facil.png".
 * 
 * Nota: Esta clase forma parte del menú de selección de dificultad y define el comportamiento
 * del botón de dificultad "Fácil" en ese menú.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class MenuFacil extends Button{
    /**
     * Realiza las acciones correspondientes al botón de dificultad "Fácil".
     * Este método es llamado automáticamente en cada ciclo del juego.
     * Actualiza la imagen del botón para mostrar la imagen "facil.png".
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("facil.png");
        setImage(imagen);
    }
}
