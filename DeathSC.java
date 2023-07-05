import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;

/**
 * La clase DeathSC representa un Actor que muestra una secuencia de imágenes en un bucle,
 * creando una animación de muerte. Cada cierto tiempo, cambia la imagen mostrada para
 * mostrar la siguiente imagen en la secuencia.
 * 
 * Nota: Esta clase define la animación de muerte para un personaje en el juego.
 * 
 * @autor Noe Cisneros
 * @version 03/07/2023
 */
public class DeathSC extends Actor{
    
    private GreenfootImage[] imagenes;  // Variable para almacenar las imágenes
    private int indiceImagen;  // Variable para controlar el índice de la imagen actual
    private Timer timer;
    
    /**
     * Crea una instancia de DeathSC.
     * Configura la lista de imágenes con las diferentes imágenes de la secuencia de muerte
     * y establece la primera imagen como la imagen inicial del actor.
     */
    public DeathSC(){
        timer = new Timer();
        // Inicializa la lista de imágenes y el índice
        imagenes = new GreenfootImage[7];  // Cambia el tamaño según la cantidad de imágenes que desees intercalar
        imagenes[0] = new GreenfootImage("ds1.png");
        imagenes[0].scale(600,400);
        imagenes[1] = new GreenfootImage("ds2.png");
        imagenes[1].scale(600,400);
        imagenes[2] = new GreenfootImage("ds3.png");
        imagenes[2].scale(600,400);
        imagenes[3] = new GreenfootImage("ds4.png");
        imagenes[3].scale(600,400);
        imagenes[4] = new GreenfootImage("ds5.png");
        imagenes[4].scale(600,400);
        imagenes[5] = new GreenfootImage("ds6.png");
        imagenes[5].scale(600,400);
        imagenes[6] = new GreenfootImage("ds7.png");
        imagenes[6].scale(600,400);
        indiceImagen = 0;  // Índice inicial
        setImage(imagenes[indiceImagen]);
    }
    /**
     * Define el comportamiento de la animación de muerte.
     * En cada iteración, cambia la imagen mostrada para mostrar la siguiente imagen en la secuencia.
     * El cambio de imagen ocurre cada 0.5 segundos (500 milisegundos).
     */
    public void act(){
        try {
            Thread.sleep(500); // Espera .9 segundos (900 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Cambia la imagen en cada iteración
        indiceImagen = (indiceImagen + 1) % imagenes.length;
        setImage(imagenes[indiceImagen]);
         
    }
}
