import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Wall representa una pared en el escenario.
 * Extiende la clase Scenary y se utiliza para crear objetos de tipo pared.
 * Una pared puede tener una colisión a la izquierda o no, dependiendo de su orientación.
 * 
 * @autor Miguel Gtz
 * @version 02/07/2023
 */
public class Wall extends Scenary
{
    private boolean leftColition;
    
    /**
     * Crea una pared con un ancho y alto especificados, y una indicación de colisión a la izquierda.
     * 
     * @param width el ancho de la pared.
     * @param height el alto de la pared.
     * @param leftCollision indica si la pared tiene colisión a la izquierda.
     */
    Wall(int width, int height, boolean leftColition) {
        super(width, height);
        this.leftColition = leftColition;
    }
    
    /**
     * Crea una pared con un ancho predeterminado de 15 y un alto de 200.
     * No tiene colisión a la izquierda por defecto.
     */
    Wall() {
        super(15, 200);
    }
    
    /**
     * Verifica si la pared tiene colisión a la izquierda.
     * 
     * @return true si la pared tiene colisión a la izquierda, false de lo contrario.
     */
    public boolean isLeftColition(){
        return this.leftColition;
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
}
