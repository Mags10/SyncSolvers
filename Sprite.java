import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Sprite es una extensión de Actor que representa un elemento gráfico en el mundo de Greenfoot.
 * Se utiliza para mostrar imágenes y controlar su posición y comportamiento.
 * 
 * @autor Miguel Gtz
 * @version 02/07/2023
 */
public class Sprite extends Actor{
    private Entity asoc = null;
    private Actor asocActor = null;
    private double scale = 1;
    private boolean fixedToButton = true;
    private GreenfootImage imgLocal;
    private int dx = 0;
    private int dy = 0;
    private boolean onClick = false;
    private IntroMenu toWorld;
    
    /**
     * Constructor de la clase Sprite.
     * Crea un sprite con una imagen, una entidad asociada y una escala.
     * La imagen se escala según la escala especificada y se establece como la imagen del sprite.
     * 
     * @param img     La imagen del sprite
     * @param e       La entidad asociada
     * @param scale   La escala del sprite
     */
    Sprite(GreenfootImage img, Entity e, double scale){
        this.asoc = e;
        this.imgLocal = img;
        this.scale = e.getHeight() / img.getHeight() + scale;
        img.scale(((int)((double)e.getWidth() * scale)), ((int)((double)e.getHeight() * scale)));
        setImage(img);
    }
    
    /**
     * Constructor de la clase Sprite.
     * Crea un sprite con una imagen, una entidad asociada y una escala, con la opción de no escalar según la entidad.
     * La imagen se escala según la escala especificada y se establece como la imagen del sprite.
     * 
     * @param img                La imagen del sprite
     * @param e                  La entidad asociada
     * @param scale              La escala del sprite
     * @param notScaleToEntity   Indica si la imagen no se escala según la entidad
     */
    Sprite(GreenfootImage img, Entity e, double scale, boolean notScaleToEntity){
        this.asoc = e;
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    /**
     * Constructor de la clase Sprite.
     * Crea un sprite con una imagen, un actor asociado y una escala.
     * La imagen se escala según la escala especificada y se establece como la imagen del sprite.
     * 
     * @param img     La imagen del sprite
     * @param e       El actor asociado
     * @param scale   La escala del sprite
     */
    Sprite(GreenfootImage img, Actor e, double scale){
        this.asocActor = e;
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    /**
     * Constructor de la clase Sprite.
     * Crea un sprite con una imagen, un actor asociado y una escala, con la opción de no escalar según el actor.
     * La imagen se escala según la escala especificada y se establece como la imagen del sprite.
     * 
     * @param img                La imagen del sprite
     * @param e                  El actor asociado
     * @param scale              La escala del sprite
     * @param notScaleToEntity   Indica si la imagen no se escala según el actor
     */
    Sprite(GreenfootImage img, Actor e, double scale, boolean notScaleToEntity){
        this.asocActor = e;
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    /**
     * Constructor de la clase Sprite.
     * Crea un sprite con una imagen y una escala.
     * La imagen se escala según la escala especificada y se establece como la imagen del sprite.
     * 
     * @param img     La imagen del sprite
     * @param scale   La escala del sprite
     */
    Sprite(GreenfootImage img, double scale){
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    /**
     * Constructor de la clase Sprite.
     * Crea un sprite con una imagen y un tamaño específico.
     * La imagen se escala según el ancho y alto especificados y se establece como la imagen del sprite.
     * 
     * @param img      La imagen del sprite
     * @param width    El ancho del sprite
     * @param height   El alto del sprite
     */
    Sprite(GreenfootImage img, int width, int height){
        this.imgLocal = img;
        img.scale(width, height);
        setImage(img);
    }
    
    /**
     * Actualiza la imagen del sprite con una nueva imagen.
     * La imagen se escala según la escala actual del sprite y se establece como la nueva imagen del sprite.
     * 
     * @param img   La nueva imagen del sprite
     */
    public void updateSprite(GreenfootImage img){
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * this.scale)), ((int)((double)img.getHeight() * this.scale)));
        setImage(img);
    }
    
    /**
     * Actualiza la imagen del sprite con una nueva imagen y una nueva escala.
     * La imagen se escala según la nueva escala especificada y se establece como la nueva imagen del sprite.
     * 
     * @param img     La nueva imagen del sprite
     * @param scale   La nueva escala del sprite
     */
    public void updateSprite(GreenfootImage img, double scale){
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    /**
     * Establece un desplazamiento en el sprite.
     * El desplazamiento se aplica al sprite al establecer su ubicación.
     * 
     * @param dx   El desplazamiento en el eje x
     * @param dy   El desplazamiento en el eje y
     */
    public void setOffset(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
        setLocation(this.getX() + this.dx, this.getY() + this.dy);
    }
    
    /**
     * Cambia la entidad asociada por una nueva entidad.
     * 
     * @param e   La nueva entidad asociada
     */
    public void changeEntityObjetive(Entity e){
        this.asoc = e;
    }
    
    /**
     * Cambia el actor asociado por un nuevo actor.
     * 
     * @param e   El nuevo actor asociado
     */
    public void changeActorObjetive(Actor e){
        this.asocActor = e;
    }
    
    /**
     * Establece si el sprite se mantiene fijo en la parte baja o no.
     * 
     * @param val   Valor booleano para fijar o no el sprite a un botón
     */
    public void setToButton(boolean val){
        this.fixedToButton = val;
    }
    
    /**
     * Establece la transparencia del sprite.
     * 
     * @param value   El valor de transparencia (0-255)
     */
    public void setTransparency(int value){
        this.imgLocal.setTransparency(value);
        this.setImage(this.imgLocal);
    }
    
    /**
     * Establece el indicador de clic para redirigir al menú de introducción.
     * Al llamar a este método, se establece el indicador de clic en verdadero,
     * lo que indica que el sprite ha sido clicado y debe redirigirse al menú de introducción.
     */
    public void onClickToIntroMenu(){
        this.onClick = true;
    }
    
    /**
     * Actúa el sprite.
     * Controla la ubicación del sprite en función de la entidad o actor asociado.
     * Si el sprite está fijo a un botón, se mantiene en la posición especificada en relación al botón.
     * Si el sprite no está fijo a un botón, sigue la ubicación de la entidad o actor asociado.
     */
    public void act(){
        if(this.asoc != null){
            if(this.fixedToButton){
                setLocation(this.asoc.getX() + this.dx, this.asoc.getBotton() - this.imgLocal.getHeight() / 2 + this.dy);
            }else{
                setLocation(this.asoc.getX() + this.dx, this.asoc.getY() + this.dy);
            }
        }
        if(this.asocActor != null){
            setLocation(this.asocActor.getX() + this.dx, this.asocActor.getY() + this.dy);
        }
    }
    
}
