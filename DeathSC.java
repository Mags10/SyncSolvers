import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;

/**
 * Write a description of class deathsc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathSC extends Actor
{
    private GreenfootImage[] imagenes;  // Variable para almacenar las imágenes
    private int indiceImagen;  // Variable para controlar el índice de la imagen actual
    private Timer timer;
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
    public void act()
    {
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
