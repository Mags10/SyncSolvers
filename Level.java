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
        this.addBackground();
    }
    
    Sprite[] backgrounds = new Sprite[6];
    int[] movementFactorsX = {500, 700, 900, 1100, 1300, 1500};
    int[] movementFactorsY = {100, 200, 300, 400, 500, 600};
    
    private void addBackground(){
        for(int i = -6; i < 0; i++){
            backgrounds[i + 6] = new Sprite(new GreenfootImage(i + ".png"), this.getWidth(), this.getHeight());
            addObject(backgrounds[i + 6], this.getWidth()/2, this.getHeight()/2);            
        }
    }
    
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
            double relx = ((double)currentPlayer.getCameraObjective().getX() / (double)this.getWidth());
            double rely = ((double)currentPlayer.getCameraObjective().getY() / (double)this.getHeight());
            for(int i = 0; i < backgrounds.length; i++){
                movx = (this.getWidth()/2 - movementFactorsX[i]/2) + (int)(movementFactorsX[i] * relx);
                movy = (this.getHeight()/2 - movementFactorsY[i]/2) + (int)(movementFactorsY[i] * rely);
                backgrounds[i].setLocation(movx, movy);
            }
        }
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
