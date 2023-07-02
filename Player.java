import greenfoot.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;

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
    
    
    Player(){
        super(new GreenfootImage("Capa 4.png"), 20, 1, false);
        this.camCtrl = new FollowerCam(this, 80, -80);
        this.indicator = new Sprite(new GreenfootImage("indicatorPlayer.png"), this, 0.7);
        
        
    }

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
        contChangeCamera++;
    }
    
    private int countAnim2 = 12;
    private int stepAnim2 = 20;
    private int currentStepAnim2 = 0;
    private boolean frameset = false;
    private int val;
    
    private int countAnim3 = 12;
    private int stepAnim3 = 20;
    private int currentStepAnim3 = 0;
    
    private void applyGravity() {
        if (!inGround) {
            verticalSpeed += gravity;
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
    
    private void checkJump() {
        if (Greenfoot.isKeyDown("up") && inGround) {
            jumpCont = maxJumpHeight;
            jump = true;
            inGround = false;
            verticalSpeed = -maxJumpHeight;
        }
    }
    
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
        if (Greenfoot.isKeyDown("q") && canChangeCamera < contChangeCamera) {
            ((Level)getWorld()).changePlayer(false);
        }
        if (Greenfoot.isKeyDown("e") && canChangeCamera < contChangeCamera) {
            ((Level)getWorld()).changePlayer(true);
        }
        setLocation(getX() + dx, getY());
    }
    
    private void handleCollision() {
        if (jump && jumpCont > 0) {
            jumpCont--;
        }
    
        if (jumpCont == 0) {
            jump = false;
        }
        
        Entity wlBlock = (Entity) getOneIntersectingObject(Wall.class);
    
        if (wlBlock != null) {
            // Colisión con paredes (horizontal)
                if(this.getX() <= wlBlock.getX()){
                    toLeft = false;
                }else{
                    toLeft = true;
                }
                if(this.getRight() > wlBlock.getLeft() && !toLeft){
                    this.setRight(wlBlock.getLeft());
                }
                if(this.getLeft() < wlBlock.getRight() && toLeft){
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

    private int countAnim = 16;
    private int stepAnim = 6;
    private int currentStepAnim = 0;
    
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
    
    private int countAnim4 = 0;
    private int stepAnim4 = 2;
    private int currentStepAnim4 = 11;
    private boolean framekey = false;
    private boolean band = false;
    
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
    
    private void drawFollower(){
        this.getWorld().addObject(this.camCtrl, 0, 0);
    }
    
    private int maxOffset = 25;
    private int StepOfset = 2;
    
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

    private void initializeCamera(){
        this.contChangeCamera = 0;
        ((Level)getWorld()).setCamera(this.camCtrl);
    }
    
    public void changeToPlayer(Player p){
        Timer timer = new Timer();
        this.isSelected = false;
        this.getWorld().removeObject(this.indicator);
        p.setSelected(true);
        p.initializeCamera();
        ((Level)this.getWorld()).drawLife(((Level)this.getWorld()).getCamera().getCameraActor());
        this.camCtrl.goToOriginalOfset();
    }
    
    public void setSelected(boolean selected){
        this.isSelected = selected;
        this.getWorld().addObject(this.indicator, 0, 0);
        
        this.indicator.setOffset(0, -30);
    }
    
    public FollowerCam getCameraObjective(){
        return this.camCtrl;
    }
    
    public boolean cameraInitialized(){
        return this.isDrawed;
    }
    
    private boolean keyFrameIndicator = false;
    private int contFrameIndicator = 0;
    
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
