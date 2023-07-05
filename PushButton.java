import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase PushButton representa un botón en el escenario.
 * Extiende la clase Scenary y se utiliza para crear botones que pueden ser pulsados.
 * Cuando se presiona el botón, cambia su estado y activa o desactiva un láser asociado.
 * El botón tiene una textura que cambia cuando se presiona.
 * 
 * @autor Miguel Gtz
 * @version 02/07/2023
 */
public class PushButton extends Scenary
{
    private Sprite btn;
    private boolean state = false;
    private boolean drawed = false;
    private Laser asoc;
    private String color;
    
    /**
     * Crea un botón con un láser asociado y un color especificado.
     * El botón tiene una textura que cambia cuando se presiona.
     * 
     * @param asoc el láser asociado al botón.
     * @param color el color del botón.
     */
    PushButton(Laser asoc, String color){
        super(24, 24);
        this.asoc = asoc;
        this.color = color;
        GreenfootImage ls = new GreenfootImage(this.color + "Button.png");
        this.btn = new Sprite(ls, this, 1, true);
    }
    /**
     * Realiza las acciones del botón en el escenario.
     * Este método se llama cada vez que se presiona el botón 'Act' o 'Run' en el entorno.
     */
    public void act(){
        if(!drawed){
            this.getWorld().addObject(this.btn, 0, 0);
            this.drawed = true;
        }
    }
    /**
     * Presiona el botón.
     * Cambia el estado del botón y activa o desactiva el láser asociado.
     * La textura del botón también cambia para indicar que ha sido presionado.
     */
    public void push(){
        this.state = !this.state;
        this.asoc.changeState();
        if(this.state)
            this.btn.updateSprite(new GreenfootImage(this.color + "ButtonPushed.png"));
        else
            this.btn.updateSprite(new GreenfootImage(this.color + "Button.png"));
    }
}
