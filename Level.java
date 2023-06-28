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
    private int indexCurrentPlayer = 0;
    private Player currentPlayer;
    private boolean seted = true;
    
    /**
     * Constructor for objects of class Level.
     * 
     */
    
    public Level(int width, int height)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, 1);
    }
    
    public void act(){
        if(seted){
            players = this.getObjects(Player.class);
            if(players.size() >= 1){
                indexCurrentPlayer = 0;
                currentPlayer = players.get(indexCurrentPlayer);
            }
            seted = false;
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
