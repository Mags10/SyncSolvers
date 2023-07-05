import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;

/**
 * Write a description of class WinS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinS extends Actor
{
    private GreenfootImage[] imagenes;  // Variable para almacenar las imágenes
    private int indiceImagen;  // Variable para controlar el índice de la imagen actual
    private Timer timer;
    public WinS(){
        timer = new Timer();
        // Inicializa la lista de imágenes y el índice
        imagenes = new GreenfootImage[4];  // Cambia el tamaño según la cantidad de imágenes que desees intercalar
        imagenes[0] = new GreenfootImage("win1.png");
        imagenes[0].scale(600,400);
        imagenes[1] = new GreenfootImage("win2.png");
        imagenes[1].scale(600,400);
        imagenes[2] = new GreenfootImage("win3.png");
        imagenes[2].scale(600,400);
        imagenes[3] = new GreenfootImage("win4.png");
        imagenes[3].scale(600,400);
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

