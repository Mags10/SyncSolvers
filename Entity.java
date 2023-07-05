import greenfoot.*;  // Import Greenfoot classes
import greenfoot.World;

/**
 * La clase Entity es una subclase de Actor y representa una entidad genérica en el juego.
 * Proporciona métodos y funcionalidades comunes que pueden ser utilizados por otras entidades.
 * También incluye la capacidad de mostrar una caja de colisión y una textura personalizada.
 * 
 * @autor Miguel Gtz
 * @version 28/06/2023
 */
public class Entity extends Actor {
    private int width;
    private int height;
    private Color HitBoxColor = new Color(255,0,0,0);
    private boolean ShowHitBox = false;
    private Sprite texture;
    private boolean isDrawed = false;

    /**
     * Crea una instancia de Entity con ancho y alto predeterminados de 1 píxel.
     * Llama al método drawEntity() para dibujar la caja de colisión.
     */
    public Entity() {
        this.width = 1;
        this.height = 1;
        drawEntity();
    }
    
    /**
     * Crea una instancia de Entity con una imagen personalizada, ancho de caja de colisión,
     * escala y opción para mostrar la caja de colisión.
     * Calcula el alto de la caja de colisión en función de la relación de aspecto de la imagen
     * y crea una instancia de Sprite para la textura.
     * Llama al método drawEntity() para dibujar la caja de colisión.
     * 
     * @param img            La imagen personalizada para la textura
     * @param widthOfHitbox  El ancho de la caja de colisión
     * @param scale          La escala de la imagen
     * @param showHitbox     Indica si se debe mostrar la caja de colisión
     */
    public Entity(GreenfootImage img, int widthOfHitbox, double scale, boolean ShowHitbox) {
        this.ShowHitBox = ShowHitbox;
        double tmp = (double)img.getHeight() / (double)img.getWidth(); 
        this.width = widthOfHitbox;
        this.height = (int)((double)widthOfHitbox * tmp);
        //img.scale(this.width, this.height);
        this.texture = new Sprite(img, this, scale);
        drawEntity();
    }
    
    /**
     * Crea una instancia de Entity con un ancho y alto especificados.
     * Llama al método drawEntity() para dibujar la caja de colisión.
     * 
     * @param width  El ancho de la entidad
     * @param height El alto de la entidad
     */
    public Entity(int width, int height) {
        this.width = width;
        this.height = height;
        drawEntity();
    }
    
    /**
     * Dibuja la caja de colisión de la entidad.
     * Utiliza el color y las dimensiones de la caja de colisión especificadas.
     * Establece la imagen de la entidad como la caja de colisión dibujada.
     */
    public void drawEntity() {
        GreenfootImage image = new GreenfootImage(width, height);
        if (ShowHitBox) HitBoxColor = new Color(255,0,0,255);
        image.setColor(HitBoxColor);
        image.drawRect(0, 0, width - 1, height - 1);
        setImage(image);
    }
    
    /**
     * Devuelve la altura de la entidad.
     * 
     * @return La altura de la entidad
     */
    public int getHeight(){
        return this.height;
    }
    
    /**
     * Devuelve el ancho de la entidad.
     * 
     * @return El ancho de la entidad
     */
    public int getWidth(){
        return this.width;
    }
    
    /**
     * Establece la posición superior de la entidad en el eje Y.
     * 
     * @param y La coordenada Y de la posición superior
     */
    public void setTop(int y){
        setLocation(getX(), y + this.getHeight() / 2);
    }
    
    /**
     * Devuelve la posición superior de la entidad en el eje Y.
     * 
     * @return La coordenada Y de la posición superior
     */
    public int getTop(){
        return getY() - (this.getHeight() / 2);
    }
    
    /**
     * Establece la posición izquierda de la entidad en el eje X.
     * 
     * @param x La coordenada X de la posición izquierda
     */
    public void setLeft(int x){
        setLocation(x + (this.getWidth() / 2), getY());
    }
    
    /**
     * Devuelve la posición izquierda de la entidad en el eje X.
     * 
     * @return La coordenada X de la posición izquierda
     */
    public int getLeft(){
        return getX() - (this.getWidth() / 2);
    }

    /**
     * Establece la posición inferior de la entidad en el eje Y.
     * 
     * @param y La coordenada Y de la posición inferior
     */
    public void setBotton(int y){
        setLocation(getX(), y - (this.getHeight() / 2));
    }
    
    /**
     * Devuelve la posición inferior de la entidad en el eje Y.
     * 
     * @return La coordenada Y de la posición inferior
     */
    public int getBotton(){
        return getY() + (this.getHeight() / 2);
    }
    
    
    /**
     * Establece la posición derecha de la entidad en el eje X.
     * 
     * @param x La coordenada X de la posición derecha
     */
    public void setRight(int x){
        setLocation(x - (this.getWidth() / 2), getY());
    }
    
    /**
     * Devuelve la posición derecha de la entidad en el eje X.
     * 
     * @return La coordenada X de la posición derecha
     */
    public int getRight(){
        return getX() + (this.getWidth() / 2);
    }
    
    /**
     * Dibuja la textura de la entidad en el mundo.
     * Agrega la instancia de Sprite al mundo en la posición (0, 0).
     */
    public void drawTexture(){
        this.getWorld().addObject(this.texture, 0, 0);
    }
    
    /**
     * Devuelve la textura de la entidad.
     * 
     * @return La textura de la entidad
     */
    public Sprite getTexture(){
        return this.texture;
    }
    
    /**
     * Define el comportamiento de la entidad en cada iteración del ciclo de act.
     * Dibuja la textura de la entidad en el mundo si aún no se ha dibujado.
     */
    public void act() {
        if (!isDrawed) {
            this.drawTexture();
            isDrawed = true;
        }
    }
}