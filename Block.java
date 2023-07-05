import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Block representa un bloque de escenario en el juego.
 * Extiende la clase Scenary y agrega componentes adicionales, como suelo y paredes.
 * 
 * @author Miguel Gtz
 * @version 02/07/2023
 */
public class Block extends Scenary{
    
    private Ground top, button;
    private Wall left, right;
    private int Vdensity;
    private int Hdensity;
    private boolean drawed = false;
    
    /**
     * Crea un bloque de escenario con el ancho y alto especificados.
     *
     * @param width El ancho del bloque.
     * @param height La altura del bloque.
     */
    public Block(int width, int height){
        super(width, height);
        this.Vdensity = height;
        this.Hdensity = 6;
        this.top = new Ground(width, this.Vdensity);
        this.left = new Wall(this.Hdensity, height - 2, true);
        this.right = new Wall(this.Hdensity, height - 2, false);
    }
    
    /**
     * Método que se ejecuta en cada ciclo del juego.
     * Agrega los componentes del bloque (suelo y paredes) al mundo una vez.
     */
    public void act(){
        if(!this.drawed){
            this.getWorld().addObject(this.top, this.getX(), this.getTop() + this.Vdensity / 2);
            this.getWorld().addObject(this.left, this.getLeft() + this.Hdensity/2, this.getY());
            this.getWorld().addObject(this.right, this.getRight() - this.Hdensity/2, this.getY());
            this.drawed = true;
        }
    }
    
}
