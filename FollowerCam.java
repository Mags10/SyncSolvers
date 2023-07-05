import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase `FollowerCam` representa una cámara que sigue a una entidad en el juego.
 * Puede ajustar el desplazamiento horizontal y vertical de la cámara en relación con la entidad asociada.
 * También tiene la capacidad de agitar la cámara y restablecerla a su posición original.
 * 
 * @autor Miguel Gtz
 * @version 03/07/2023
 */
public class FollowerCam extends Entity{
    
    private Entity asoc;
    private boolean isDrawed = false;
    private boolean fixedToButton = true;
    private GreenfootImage imgLocal;
    private int dx = 0;
    private int orgdx = 0;
    private int dy = 0;
    private int orgdy = 0;
    private boolean shakeEnabled = false;
    private int cont = 0;
    
    /**
     * Crea una nueva instancia de la clase `FollowerCam` con la entidad asociada y los desplazamientos iniciales.
     * 
     * @param e La entidad a la que seguirá la cámara
     * @param dx El desplazamiento horizontal inicial de la cámara
     * @param dy El desplazamiento vertical inicial de la cámara
     */
    FollowerCam(Entity e, int dx, int dy){
        this.orgdx = this.dx = dx;
        this.orgdy = this.dy = dy;
        this.asoc = e;
        GreenfootImage image = new GreenfootImage(1, 1);
        setImage(image);
    }

    /**
     * Modifica el desplazamiento horizontal de la cámara en incrementos y un límite máximo.
     * 
     * @param stepSize El tamaño del paso del incremento
     * @param max El límite máximo para el desplazamiento horizontal
     */
    public void modifyCameraXOfset(int stepSize, int max){
        if(this.dx < this.orgdx+max && this.dx > this.orgdx-max)
        this.dx += stepSize;
    }
    
    /**
     * Modifica el desplazamiento vertical de la cámara en incrementos y un límite máximo.
     * 
     * @param stepSize El tamaño del paso del incremento
     * @param max El límite máximo para el desplazamiento vertical
     */
    public void modifyCameraYOfset(int stepSize, int max){
        if(this.dy < this.orgdy+max && this.dy > this.orgdy-max)
        this.dy += stepSize;
    }
    
    /**
     * Restablece gradualmente el desplazamiento de la cámara a su valor original mediante incrementos.
     *
     * @param XstepSize el tamaño del incremento para el desplazamiento horizontal
     * @param YstepSize el tamaño del incremento para el desplazamiento vertical
     */
    public void goToOriginalOfsetByStep(int XstepSize, int YstepSize){
        if(this.dx < this.orgdx){
            this.dx += XstepSize;
            if(this.dx > this.orgdx)
                this.dx = this.orgdx;
        }
        if(this.dx > this.orgdx){
            this.dx -= XstepSize;
            if(this.dx < this.orgdx)
                this.dx = this.orgdx;
        }
        if(this.dy < this.orgdy){
            this.dy += YstepSize;
            if(this.dy > this.orgdy)
                this.dy = this.orgdy;
        }
        if(this.dy > this.orgdy){
            this.dy -= YstepSize;
            if(this.dy < this.orgdy)
                this.dy = this.orgdy;
        }
    }
    
    /**
     * Restablece el desplazamiento de la cámara a su valor original.
     */
    public void goToOriginalOfset(){
        this.dx = this.orgdx;
        this.dy = this.orgdy;
    }
    
    /**
     * Activa el efecto de sacudida de la cámara.
     */
    public void enableShake(){
        shakeEnabled = true;
    }

    /**
     * El método act se llama automáticamente en cada acto del escenario.
     * Ajusta la posición de la cámara siguiendo al objeto asociado y aplicando desplazamientos.
     * También puede aplicar el efecto de sacudida a la cámara.
     */
    public void act()
    {
        int x, y;
        if (shakeEnabled) {
            cont++;
            int shakeOffsetX = Greenfoot.getRandomNumber(11) - 5;
            int shakeOffsetY = Greenfoot.getRandomNumber(11) - 5;
            dx += shakeOffsetX;
            dy += shakeOffsetY;
            if(cont >= 50) {
                shakeEnabled = false;
                cont = 0;
            }
        }
        x = this.asoc.getX() + this.dx;
        y = this.asoc.getY() + this.dy;
        if(this.asoc.getX() + this.dx - 300 <= 0){
            x = 300;
        }
        if(this.asoc.getY() + this.dy - 200 <= 0){
            y = 200;
        }
        if(this.asoc.getX() + this.dx + 300 >= this.getWorld().getWidth()){
            x = this.getWorld().getWidth() - 300;
        }
        if(this.asoc.getY() + this.dy + 200 >= this.getWorld().getHeight()){
            y = this.getWorld().getHeight() - 200;
        }
        setLocation(x, y);
        //setLocation(this.asoc.getX() + this.dx, this.asoc.getY() + this.dy);
    }
    
}

