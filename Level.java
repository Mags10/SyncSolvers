import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    private double scaleFactor = 1.0;  // Factor de escala inicial
    private int originalWidth;  // Ancho original del escenario
    private int originalHeight;  // Altura original del escenario
    private Camera camera;
    private List<Player> players;
    private int indexCurrentPlayer = -1;
    private Player currentPlayer;
    private boolean seted = true;
    private Sprite lifeIndicator;
    private Sprite scenary;
    
    /**
     * Constructor for objects of class Level.
     * 
     */
    
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    }
    
    public Level(int width, int height)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, 1);
        this.addBackground(1);
        
    }
    
    private int dificulty;
    
    public Level(int width, int height, int bg, GreenfootImage img, int d)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, 1);
        this.scenary = new Sprite(img, 1);
        this.addBackground(bg);
        this.dificulty = d;
        switch(d){
            case 1:
                this.maxLife = 5;
            break;
            case 2:
                this.maxLife = 3;
            break;
            case 3:
                this.maxLife = 1;
            break;
        }
        this.life = this.maxLife;
    }
    
    Sprite[] backgrounds = new Sprite[6];
    //int[] movementFactorsX = {500, 700, 900, 1100, 1300, 1500};
    int[] movementFactorsX = {1500, 1300, 1100, 900, 700, 500};
    int[] movementFactorsY = {100, 200, 300, 400, 500, 600};
    
    private void addBackground(int bg){
        for(int i = -6; i < 0; i++){
            backgrounds[i + 6] = new Sprite(new GreenfootImage(bg + "" + i + ".png"), this.getWidth(), this.getHeight());
            addObject(backgrounds[i + 6], this.getWidth()/2, this.getHeight()/2);            
        }
        if(this.scenary != null){
            addObject(this.scenary, 996, 600);  
        }
    }
    
    private boolean isCameraSeted = false;
    
    public void act(){
        int movx = 0;
        int movy = 0;
        if(seted){
            players = this.getObjects(Player.class);
            if(players.size() >= 1){
                indexCurrentPlayer = 0;
                currentPlayer = players.get(indexCurrentPlayer);
            }
            seted = false;
        }
        if(currentPlayer.cameraInitialized()){
            if(!isCameraSeted){
                this.drawLife(this.camera.getCameraActor());
                setCamera(currentPlayer.getCameraObjective());
                isCameraSeted = true;
            }
            double relx = ((double)currentPlayer.getCameraObjective().getX() / (double)this.getWidth());
            double rely = ((double)currentPlayer.getCameraObjective().getY() / (double)this.getHeight());
            for(int i = 0; i < backgrounds.length; i++){
                movx = (this.getWidth()/2 - movementFactorsX[i]/2) + (int)(movementFactorsX[i] * relx);
                movy = (this.getHeight()/2 - movementFactorsY[i]/2) + (int)(movementFactorsY[i] * rely);
                backgrounds[i].setLocation(movx, movy);
            }
        }
        
        if(Greenfoot.isKeyDown("g")){
            updateLife(-1);
        }
        if(Greenfoot.isKeyDown("h")){
            updateLife(1);
        }
        
    }
    
    public void drawLife(Actor a){
        if(this.lifeIndicator != null){
            this.lifeIndicator.changeActorObjetive(a);
        }else{
            this.lifeIndicator = new Sprite(new GreenfootImage(this.dificulty + "-0" + this.life + ".png"), a, 3);
            addObject(this.lifeIndicator, 0, 0);
            this.lifeIndicator.setOffset(-230, 185);
        }   
    }
    
    private int life = 5;
    private int maxLife = 5;
    
    public void updateLife(int val){
        life += val;
        if(life >= maxLife) life = maxLife;
        if(life <= 0){
            DeathScreen ds = new DeathScreen();
        }else
        this.lifeIndicator.updateSprite(new GreenfootImage(this.dificulty + "-0" + this.life + ".png"));
    }
    
    public void setCamera(Actor a){
        this.camera = new Camera(this, a);
        Greenfoot.setWorld(this.camera);
    }
    
    public Camera getCamera(){
        return this.camera;
    }
    
    public void changePlayer(boolean next){
        if(next) indexCurrentPlayer++;
        else indexCurrentPlayer--;
        if(players.size() == indexCurrentPlayer){
            indexCurrentPlayer = 0;
        }
        if(indexCurrentPlayer == -1){
            indexCurrentPlayer = players.size() - 1;
        }
        Player nextPlayer = players.get(indexCurrentPlayer);
        currentPlayer.changeToPlayer(nextPlayer);
        currentPlayer = nextPlayer;
    }

}
