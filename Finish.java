import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Finish representa un elemento de escenario que marca el final de un nivel o etapa del juego.
 * Extiende la clase Scenary y agrega una textura animada.
 * 
 * @author Miguel Gtz
 * @version 02/07/2023
 */
public class Finish extends Scenary
{
    /**
     * Act - do whatever the Finish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Sprite texture;
    private boolean isDrawed = false;
    private int keyFrame = 0;
    private boolean toUp = true;
    private boolean alternate = true;
    
    /**
     * Crea un elemento de finalización del nivel.
     * El tamaño predeterminado del elemento es de 48x72 píxeles.
     */
    public Finish(){
        super(48, 72);
        this.texture = new Sprite(new GreenfootImage("portal1.png"), this, 0.15, true);
    }
    
    /**
     * Método que se ejecuta en cada ciclo del juego.
     * Agrega la textura animada al mundo y realiza la animación del elemento.
     */
    public void act()
    {
        // Add your action code here.
        if(!isDrawed){
            this.getWorld().addObject(this.texture, 0, 0);
        }
        
        if(alternate){
            if(keyFrame < 3 && toUp){
                keyFrame++;
                toUp = true;
            }else{
                keyFrame--;            
                if(keyFrame < -3)
                    toUp = true;
                else
                    toUp = false;
            }
            this.texture.setOffset(0, keyFrame);
        }
        this.alternate = !this.alternate;
    }
}
