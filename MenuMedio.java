import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase MenuMedio representa un botón de dificultad "Medio".
 * Extiende la clase Button, lo que significa que es un Actor interactivo que puede ser
 * colocado en el mundo y responder a eventos del mouse.
 * Cuando se presiona el botón, se actualiza su imagen para mostrar "medio.png".
 * 
 * Nota: Esta clase forma parte del menú de selección de dificultad y define el comportamiento
 * del botón de dificultad "Medio" en ese menú.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class MenuMedio extends Button{
    /**
     * Realiza las acciones correspondientes al botón de dificultad "Medio".
     * Este método es llamado automáticamente en cada ciclo del juego.
     * Actualiza la imagen del botón para mostrar la imagen "medio.png".
     */
    public void act(){
        GreenfootImage imagen = new GreenfootImage("medio.png");
        setImage(imagen);
    }
}
