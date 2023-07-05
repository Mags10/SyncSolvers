import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Laser representa un láser en el escenario.
 * Extiende la clase Scenary y se utiliza para crear láseres con diferentes alturas y colores.
 * Los láseres pueden cambiar su estado de abierto a cerrado y viceversa.
 * 
 * @autor Miguel Gtz
 * @version 02/07/2023
 */
public class Laser extends Scenary{
    
    private Sprite laser, top, button;
    private Wall left, right;
    private boolean drawed = false;
    private boolean isOpened = false;
    private boolean drawOpened = false;
    
    /**
     * Crea un láser con una altura y color especificados.
     * 
     * @param height La altura del láser.
     * @param color El color del láser.
     */
    Laser(int height, String color){
        super(24, height);
        GreenfootImage ls = new GreenfootImage(color + "laser.png");
        ls.scale(12, height-6);
        this.laser = new Sprite(ls, this, 1, true);
        this.laser.setToButton(false);
        ls = new GreenfootImage("FromLaser.png");
        ls.scale(24, 6);
        this.button = new Sprite(ls, this, 1, true);
        ls = new GreenfootImage("FromLaser.png");
        ls.scale(24, 6);
        this.top = new Sprite(ls, this, 1, true);
        this.top.setToButton(false);
        this.left = new Wall(1, height, true);
        this.right = new Wall(1, height, false);
    }
    
    /**
     * Realiza las acciones del láser en el escenario.
     * Este método se llama cada vez que se presiona el botón "Act" o "Run" en el entorno.
     */
    public void act()
    {
        // Add your action code here.
        if(!drawed){
            this.getWorld().addObject(this.laser, 0, 0);
            this.getWorld().addObject(this.button, 0, 0);
            this.getWorld().addObject(this.top, 0, 0);
            this.top.setOffset(0, -this.getHeight()/2 + 3);
            this.getWorld().addObject(this.left, this.getLeft(), this.getY());
            this.getWorld().addObject(this.right, this.getRight() - 1, this.getY());
            this.drawed = true;
        }
        if(isOpened && !drawOpened){
            this.getWorld().removeObject(this.left);
            this.getWorld().removeObject(this.right);
            this.getWorld().removeObject(this.laser);
            drawOpened = true;
        }
        if(!isOpened && !drawOpened){
            this.getWorld().addObject(this.laser, 0, 0);
            this.getWorld().addObject(this.left, this.getLeft(), this.getY());
            this.getWorld().addObject(this.right, this.getRight() - 1, this.getY());
            drawOpened = true;
        }
    }
    
    /**
     * Cambia el estado del láser de abierto a cerrado y viceversa.
     */
    public void changeState(){
        this.isOpened = !this.isOpened;
        this.drawOpened = false;
    }
}
