import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Obstacle representa un obstáculo en el escenario.
 * Extiende la clase Scenary y se utiliza para crear obstáculos con diferentes tamaños.
 * Los obstáculos pueden tener diferentes formas y dimensiones según el constructor utilizado.
 * 
 * @autor Miguel Gtz
 * @version 02/07/2023
 */
public class Obstacle extends Scenary{

    /**
     * Crea un obstáculo con un tamaño predeterminado.
     * El tamaño predeterminado es de 8 de ancho y 10 de alto.
     */
    Obstacle(){
        super(8, 10);
    }
    
    /**
     * Crea un obstáculo con un tamaño personalizado.
     * 
     * @param i Un parámetro de ejemplo utilizado para definir el tamaño del obstáculo.
     */
    Obstacle(int i){
        super(24, 24);
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
}
