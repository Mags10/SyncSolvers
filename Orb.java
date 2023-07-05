import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * La clase Orb representa un orbe en el escenario.
 * Extiende la clase Scenary y se utiliza para crear orbes con una textura giratoria.
 * Los orbes pueden tener diferentes tamaños según el constructor utilizado.
 * 
 * @autor Miguel Gtz
 * @version 02/07/2023
 */
public class Orb extends Scenary{
    
    private Sprite texture;
    private GreenfootImage image;
    private int numFrame = 0;
    private int textureIndex = 0;
    private boolean isDrawed = false;
    private boolean act = true;
    
    /**
     * Crea un orbe con un tamaño predeterminado de 24x24 píxeles.
     * El orbe tiene una textura giratoria.
     */
    Orb(){
        super(24, 24);
        this.image = new GreenfootImage("orb1.png");
        this.texture = new Sprite(this.image, this, 1);
    }
    /**
     * Realiza las acciones del orbe en el escenario.
     * Este método se llama cada vez que se presiona el botón 'Act' o 'Run' en el entorno.
     */
    public void act()
    {
        // Add your action code here.
        if(this.act){
            if(!isDrawed && this != null){
                this.getWorld().addObject(this.texture, 0, 0);
            }
            this.texture.setRotation(this.texture.getRotation()+1);
        }
    }
    /**
     * Elimina el orbe del escenario.
     * El orbe se vuelve invisible y deja de actuar.
     */
    public void delete(){
        this.act = false;
        this.texture.setTransparency(0);
    }
    /**
     * Verifica si el orbe es válido.
     * Un orbe es válido si sigue activo y visible en el escenario.
     * 
     * @return true si el orbe es válido, false de lo contrario.
     */
    public boolean validPoint(){
        return this.act;
    }
    
}
