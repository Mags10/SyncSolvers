import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Ground representa un elemento de escenario que sirve como suelo.
 * Extiende la clase Scenary y define diferentes constructores para establecer su tamaño.
 * 
 * @author Miguel Gtz
 * @version 02/07/2023
 */
public class Ground extends Scenary
{
    /**
     * Crea un suelo con una longitud predeterminada de 200 y una altura de 15 píxeles.
     */
    Ground(int longitude) {
        super(longitude, 15);
    }
    /**
     * Crea un suelo con una longitud especificada y una altura predeterminada de 15 píxeles.
     * 
     * @param longitude La longitud del suelo.
     */
    Ground(int width, int height) {
        super(width, height);
    }
    /**
     * Crea un suelo con un ancho y altura especificados.
     * 
     * @param width El ancho del suelo.
     * @param height La altura del suelo.
     */    
    Ground() {
        super(200, 15);
    }
    public void act()
    {
        // Add your action code here.
    }
}
