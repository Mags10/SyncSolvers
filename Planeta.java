import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;


/**
 * La clase Planeta representa un planeta en el escenario.
 * Extiende la clase Actor y se utiliza para crear objetos de tipo planeta que cambian de imagen.
 * 
 * @author Noe Cisneros
 * @version 28/06/2023
 */
public class Planeta extends Actor{
    private GreenfootImage[] imagenes;  // Variable para almacenar las imágenes
    private int indiceImagen;  // Variable para controlar el índice de la imagen actual
    private Timer timer;
    /**
     * Constructor de la clase Planeta.
     * Inicializa la lista de imágenes y establece la primera imagen como la imagen actual.
     */
    public Planeta() {
        timer = new Timer();
        // Inicializa la lista de imágenes y el índice
        imagenes = new GreenfootImage[6];  // Cambia el tamaño según la cantidad de imágenes que desees intercalar
        imagenes[0] = new GreenfootImage("Pixel Earth1.png");
        imagenes[1] = new GreenfootImage("Pixel Earth2.png");
        imagenes[2] = new GreenfootImage("Pixel Earth3.png");
        imagenes[3] = new GreenfootImage("Pixel Earth4.png");
        imagenes[4] = new GreenfootImage("Pixel Earth5.png");
        imagenes[5] = new GreenfootImage("Pixel Earth6.png");
        indiceImagen = 0;  // Índice inicial
        setImage(imagenes[indiceImagen]);  // Establece la primera imagen como la imagen actual
    }

    /**
     * Realiza una acción en cada iteración del ciclo de juego.
     * Cambia la imagen en cada iteración para crear la animación del planeta.
     */
    public void act() {
        try {
            Thread.sleep(200); // Espera .9 segundos (900 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Cambia la imagen en cada iteración
        indiceImagen = (indiceImagen + 1) % imagenes.length;
        setImage(imagenes[indiceImagen]);
                  
    }
}
