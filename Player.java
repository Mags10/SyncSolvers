import greenfoot.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;

/**
 * La clase Player representa al jugador del juego.
 * Extiende la clase Entity, ya que es un objeto que se mueve en el mundo del juego.
 * Contiene métodos para controlar el movimiento, salto, colisiones, indicadores y efectos del jugador.
 * 
 * @autor Miguel Gtz
 * @version 03/07/2023
 */

public class Player extends Entity {
    private static final int horizontalSpeed = 5;
    private static final int gravity = 1;
    private static final int maxJumpHeight = 15;
    private int verticalSpeed = 0;
    private int jumpCont = 0;
    private boolean jump = false;
    private boolean toLeft = false;
    private boolean inGround = false;
    private FollowerCam camCtrl;
    private boolean isDrawed = false;
    private boolean isSelected = false;
    private int canChangeCamera = 10;
    private int contChangeCamera = 0;
    private Sprite indicator;
    private Sprite[] itemIndicators;
    private int countAnim2 = 12;
    private int stepAnim2 = 20;
    private int currentStepAnim2 = 0;
    private boolean frameset = false;
    private int val;
    private int countAnim3 = 12;
    private int stepAnim3 = 20;
    private int currentStepAnim3 = 0;
    private boolean isDamaged = false;
    private int activeButton = 0;
    private boolean canPress = true;
    private boolean checkFinish = true;
    private int countAnim = 16;
    private int stepAnim = 6;
    private int currentStepAnim = 0;
    private int countDamage = 100;
    private int stepDamage = 0;
    private int numFlashes = 5;
    private double currentTransparency = 1;
    private boolean countUp = false;
    private int countAnim4 = 0;
    private int stepAnim4 = 2;
    private int currentStepAnim4 = 11;
    private boolean framekey = false;
    private boolean band = false;
    private int maxOffset = 25;
    private int StepOfset = 2;
    private boolean keyFrameIndicator = false;
    private int contFrameIndicator = 0;
    
    /**
     * Constructor de la clase Player.
     * Crea un nuevo jugador con una imagen predeterminada y asigna el controlador de cámara seguidora.
     */
    Player(){
        super(new GreenfootImage("Capa 4.png"), 20, 1, false);
        this.camCtrl = new FollowerCam(this, 80, -80);
        this.indicator = new Sprite(new GreenfootImage("indicatorPlayer.png"), this, 0.7);
    }

    /**
     * El método act se llama automáticamente en cada acto del escenario.
     * Controla el movimiento, salto, colisiones, indicadores y efectos del jugador.
     */
    public void act() {
        if (!isDrawed) {
            this.drawFollower();
            if(((Level)this.getWorld()).getCamera() == null){
                this.isSelected = true;
                this.getWorld().addObject(this.indicator, 0, 0);
                this.indicator.setOffset(0, -30);
                initializeCamera();
            }
            isDrawed = true;
        }
        super.act();
        applyGravity();
        if(this.isSelected) checkJump();
        if(this.isSelected) handleMovement();
        if(this.isSelected) handleIndicator();
        handleCollision();
        handleFollower();
        handleDamage();
        contChangeCamera++;
    }
    
    /**
     * Aplica la gravedad al jugador.
     * Si el jugador no está en el suelo, la velocidad vertical se incrementa debido a la gravedad.
     * También controla el salto del jugador y su animación.
     */
    private void applyGravity() {
        if (!inGround) {
            verticalSpeed += gravity;
            if(verticalSpeed >= 15) verticalSpeed = 15;
            fallingSprite();
        }
        
        if (jump && verticalSpeed >= 0) {
            jump = false; // Stop the jump if it reaches the maximum height
        }
        
        if(currentStepAnim2 > stepAnim2 && inGround && !Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("left") && !framekey){
            currentStepAnim2 = 0;
            if(frameset) val = 5;
            else val = 6;
            frameset = !frameset;
            GreenfootImage img = new GreenfootImage("Capa " + val + ".png");
            if(toLeft) img.mirrorHorizontally();
            super.getTexture().updateSprite(img);
        }
        currentStepAnim2++;

        fallingSprite();
    }
    
    /**
     * Verifica si el jugador puede realizar un salto y lo ejecuta cuando se pulsa la tecla "up".
     */
    private void checkJump() {
        if (Greenfoot.isKeyDown("up") && inGround) {
            jumpCont = maxJumpHeight;
            jump = true;
            inGround = false;
            verticalSpeed = -maxJumpHeight;
        }
    }
    
    /**
     * Maneja el movimiento del jugador en función de las teclas presionadas.
     * Además, permite cambiar entre jugadores mediante las teclas "z" y "x".
     */
    private void handleMovement() {
        int dx = 0;
        if (Greenfoot.isKeyDown("left")) {
            this.toLeft = true;
            dx -= horizontalSpeed;
            changeSprite();
            
        }
        if (Greenfoot.isKeyDown("right")) {
            this.toLeft = false;
            dx += horizontalSpeed;
            changeSprite();
        }
        if (Greenfoot.isKeyDown("z") && canChangeCamera < contChangeCamera) {
            ((Level)getWorld()).changePlayer(false);
        }
        if (Greenfoot.isKeyDown("x") && canChangeCamera < contChangeCamera) {
            ((Level)getWorld()).changePlayer(true);
        }
        setLocation(getX() + dx, getY());
    }
        
    /**
     * Maneja las colisiones del jugador con diferentes tipos de objetos en el mundo del juego.
     */
    private void handleCollision() {
        if(!canPress){
            activeButton += 1;
            if(activeButton > 50){
                activeButton = 0;
                canPress = true;
            }
        }        
        
        if (jump && jumpCont > 0) {
            jumpCont--;
        }
    
        if (jumpCont == 0) {
            jump = false;
        }
        
        Entity obBlock = (Entity) getOneIntersectingObject(Obstacle.class);
    
        if (obBlock != null && !isDamaged) {
            // Colisión con paredes (horizontal)
            jumpCont = maxJumpHeight;
            jump = true;
            inGround = false;
            verticalSpeed = -maxJumpHeight;
            this.camCtrl.enableShake();
            this.isDamaged = true;
            this.indicator.updateSprite(new GreenfootImage("indicatorPlayerDamage.png"), 1);
            ((Level)this.getWorld()).updateLife(-1);
        }
        
        Entity psBlock = (Entity) getOneIntersectingObject(PushButton.class);
    
        if (psBlock != null && Greenfoot.isKeyDown("space") && canPress && this.isSelected){
            ((PushButton)psBlock).push();
            canPress = false;
        }

        Entity scBlock = (Entity) getOneIntersectingObject(Orb.class);
    
        if (scBlock != null){
            if(((Orb)scBlock).validPoint()){
                ((Orb)scBlock).delete();
                ((Level)this.getWorld()).addScore();
            }
        }
        
        Entity fnBlock = (Entity) getOneIntersectingObject(Finish.class);
        if (fnBlock != null && this.checkFinish){
            ((Level)this.getWorld()).checkWin();
            this.checkFinish = false;
        }else{
            this.checkFinish = true;
        }
        
        Entity wlBlock = (Entity) getOneIntersectingObject(Wall.class);
    
        if (wlBlock != null) {
            // Colisión con paredes (horizontal)
                if(this.getX() <= wlBlock.getX()){
                    toLeft = false;
                }else{
                    toLeft = true;
                }
                if(this.getRight() > wlBlock.getLeft() && !toLeft && ((Wall)wlBlock).isLeftColition()){
                    this.setRight(wlBlock.getLeft());
                }
                if(this.getLeft() < wlBlock.getRight() && toLeft && !((Wall)wlBlock).isLeftColition()){
                    this.setLeft(wlBlock.getRight());
                }
        }
    
        Entity gdBlock = (Entity) getOneIntersectingObject(Ground.class);
    
        if (gdBlock != null) {
            if (verticalSpeed > 0 && gdBlock.getTop() > getTop()) {
                setTop(gdBlock.getTop() - getHeight() + 1);
                verticalSpeed = 0;
                jump = false;
                inGround = true;
                framekey = true;
            }
            if (verticalSpeed < 0 && gdBlock.getTop() < getTop() + getHeight() - 1) {
                setTop(gdBlock.getTop() + gdBlock.getHeight());
                verticalSpeed = 0;
                jump = false;
                inGround = false;
            }
        }else{
            inGround = false;
        }
    
        if (!inGround) {
            setLocation(getX(), getY() + verticalSpeed);
        }
    }
    
    /**
     * Verifica si el jugador ha tocado el objeto de finalización del nivel.
     * @return true si el jugador ha tocado el objeto de finalización, de lo contrario, false.
     */
    public boolean checkFinishTouch(){
        Entity bk = (Entity) getOneIntersectingObject(Finish.class);
        return bk != null;
    }

    /**
     * Cambia la imagen del jugador para mostrar el paso de la animación de movimiento.
     */
    private void changeSprite(){
        if(verticalSpeed == 0){
            currentStepAnim++;
            if(currentStepAnim >= stepAnim){
                currentStepAnim = 0;
                if (countAnim >= 19 && toLeft) countAnim = 16;
                if (countAnim <= 16 && !toLeft) countAnim = 18;
                GreenfootImage img = new GreenfootImage("Capa " + countAnim + ".png");
                if(toLeft) img.mirrorHorizontally();
                super.getTexture().updateSprite(img);
                if(toLeft) countAnim++;
                if(!toLeft) countAnim--;
            }
        }
        
    }
    
    /**
     * Maneja el daño recibido por el jugador y controla la transparencia de la textura del jugador durante el daño.
     * Si el jugador está dañado, se ajusta la transparencia de la textura y se actualiza el indicador visual.
     * Cuando se completa el proceso de daño, se restablece la transparencia y se actualiza el indicador visual.
     */
    private void handleDamage(){
        if(isDamaged){
            stepDamage++;
            if(countUp)
                currentTransparency += .1;
            else
                currentTransparency -= .1;
            if(currentTransparency < 0){
                currentTransparency = 0;
                countUp = true;
            }
            if(currentTransparency > 1){
                currentTransparency = 1;
                countUp = false;
            }
            super.getTexture().setTransparency((int)(currentTransparency * 255));
            if(stepDamage >= countDamage){
                isDamaged = false;
                stepDamage = 0;
                this.indicator.updateSprite(new GreenfootImage("indicatorPlayer.png"), 1);
            }
            if(stepDamage == countDamage/2)
                this.indicator.updateSprite(new GreenfootImage("indicatorPlayerMedium.png"), 1);
        }
    }
    
    /**
     * Cambia la imagen de la textura del jugador para mostrar la animación de caída.
     * Si la velocidad vertical del jugador no es cero, se establece la imagen correspondiente a la caída.
     * Si la animación de caída está en curso, se actualiza la imagen en función del contador de animación.
     */
    private void fallingSprite(){
        if(verticalSpeed != 0){
            GreenfootImage img = new GreenfootImage("Capa 13.png");
            if(toLeft) img.mirrorHorizontally();
            super.getTexture().updateSprite(img);
            currentStepAnim4 = 11;
            band = false;
        }else if (framekey){
            if(countAnim4 >= stepAnim4){
                GreenfootImage img = new GreenfootImage("Capa " + currentStepAnim4 + ".png");
                if(toLeft) img.mirrorHorizontally();
                super.getTexture().updateSprite(img);
                if(!band) currentStepAnim4--;
                else currentStepAnim4++;
                if(currentStepAnim4 <= 9){
                    band = true;
                }
                if(currentStepAnim4 >= 11)
                    framekey = false;
                countAnim4 = 0;
            }
            countAnim4++;   
        }
    }
    
    /**
     * Dibuja el controlador de cámara seguidora en el mundo del juego.
     * Agrega el controlador de cámara seguidora al mundo del juego para que siga al jugador.
     */
    private void drawFollower(){
        this.getWorld().addObject(this.camCtrl, 0, 0);
    }
    
    /**
     * Controla el movimiento del controlador de cámara seguidora en función de las teclas presionadas.
     * Si se presiona la tecla "left", se modifica el desplazamiento horizontal del controlador de cámara seguidora.
     * Si se presiona la tecla "right", se modifica el desplazamiento horizontal del controlador de cámara seguidora.
     * Si la velocidad vertical del jugador no es cero, se modifica el desplazamiento vertical del controlador de cámara seguidora.
     * Si no se presiona ninguna tecla y la velocidad vertical del jugador es cero, el controlador de cámara seguidora se mueve hacia la posición original.
     */
    private void handleFollower(){
        if (Greenfoot.isKeyDown("left")) {
            this.camCtrl.modifyCameraXOfset(StepOfset, maxOffset);
        }else if (Greenfoot.isKeyDown("right")) {
            this.camCtrl.modifyCameraXOfset(-1 * StepOfset, maxOffset);   
        }else if(verticalSpeed != 0){
            this.camCtrl.modifyCameraYOfset(StepOfset, maxOffset);
        }else{
            this.camCtrl.goToOriginalOfsetByStep(2, 2);
        }
    }

    /**
     * Inicializa la cámara del juego.
     * Establece el controlador de cámara seguidora como la cámara del mundo del juego.
     */
    private void initializeCamera(){
        this.contChangeCamera = 0;
        ((Level)getWorld()).setCamera(this.camCtrl);
    }
    
    /**
     * Cambia el jugador actual por otro jugador.
     * Muestra una transición de cambio al nuevo jugador, actualiza el indicador visual y restablece la cámara.
     *
     * @param p El nuevo jugador que se seleccionará.
     */
    public void changeToPlayer(Player p){
        Timer timer = new Timer();
        this.isSelected = false;
        this.getWorld().removeObject(this.indicator);
        p.setSelected(true);
        p.initializeCamera();
        ((Level)this.getWorld()).drawLife(((Level)this.getWorld()).getCamera().getCameraActor());
        this.camCtrl.goToOriginalOfset();
    }
    
    /**
     * Establece si el jugador está seleccionado o no.
     * Si el jugador está seleccionado, se muestra el indicador visual en el mundo del juego.
     *
     * @param selected Valor booleano que indica si el jugador está seleccionado.
     */
    public void setSelected(boolean selected){
        this.isSelected = selected;
        this.getWorld().addObject(this.indicator, 0, 0);
        
        this.indicator.setOffset(0, -30);
    }
    
    /**
     * Obtiene el controlador de cámara seguidora asociado al jugador.
     *
     * @return El controlador de cámara seguidora asociado al jugador.
     */
    public FollowerCam getCameraObjective(){
        return this.camCtrl;
    }
    
    /**
     * Verifica si la cámara del juego ha sido inicializada.
     *
     * @return true si la cámara del juego ha sido inicializada, false en caso contrario.
     */
    public boolean cameraInitialized(){
        return this.isDrawed;
    }
    
    /**
     * Controla el cambio de imagen del indicador visual del jugador.
     * Se alterna entre dos imágenes de indicador cada 10 fotogramas.
     */
    private void handleIndicator(){
        if(contFrameIndicator >= 10){
            if(this.keyFrameIndicator)
                this.indicator.setOffset(0, -32);
            else
                this.indicator.setOffset(0, -30);
            this.keyFrameIndicator = !this.keyFrameIndicator;
            contFrameIndicator = 0;
        }
        contFrameIndicator++;
    }
    
}
