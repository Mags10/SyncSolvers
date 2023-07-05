import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * La clase Level representa un nivel en el juego.
 * Extiende la clase World de Greenfoot y proporciona funcionalidad para el nivel del juego.
 * 
 * @author Miguel Gtz
 * @version 04/07/2023
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
    private Sprite orbIndicator;
    private Sprite orbText;
    private Sprite scenary;
    private int score = 0;
    private int dificulty;
    Sprite[] backgrounds = new Sprite[6];
    //int[] movementFactorsX = {500, 700, 900, 1100, 1300, 1500};
    int[] movementFactorsX = {1500, 1300, 1100, 900, 700, 500};
    int[] movementFactorsY = {100, 200, 300, 400, 500, 600};
    private boolean isCameraSeted = false;
    private int numOrbs;
    private int life = 5;
    private int maxLife = 5;
    private boolean isWin = false;
    
    /**
     * Constructor de la clase Level.
     * Crea un nuevo mundo con 600x400 celdas y tamaño de celda de 1x1 píxeles.
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    }
    /**
     * Constructor de la clase Level.
     * Crea un nuevo mundo con el ancho y alto especificados y tamaño de celda de 1x1 píxeles.
     * 
     * @param width El ancho del mundo.
     * @param height La altura del mundo.
     */
    public Level(int width, int height)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, 1);
        this.addBackground(1);
        
    }
    /**
     * Constructor de la clase Level.
     * Crea un nuevo mundo con el ancho y alto especificados, fondo y dificultad especificados.
     * 
     * @param width El ancho del mundo.
     * @param height La altura del mundo.
     * @param bg El número de fondo.
     * @param img La imagen de fondo.
     * @param d La dificultad del nivel.
     */
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
    
    /**
     * Método para dibujar un fondo en particular con efecto parallax.
     */
    private void addBackground(int bg){
        for(int i = -6; i < 0; i++){
            backgrounds[i + 6] = new Sprite(new GreenfootImage(bg + "" + i + ".png"), this.getWidth(), this.getHeight());
            addObject(backgrounds[i + 6], this.getWidth()/2, this.getHeight()/2);            
        }
        if(this.scenary != null){
            addObject(this.scenary, 996, 600);  
        }
    }
    
    /**
     * Método actuar que se llama cuando se actualiza el mundo.
     */
    public void act(){
        int movx = 0;
        int movy = 0;
        if(seted){
            players = this.getObjects(Player.class);
            if(players.size() >= 1){
                indexCurrentPlayer = 0;
                currentPlayer = players.get(indexCurrentPlayer);
            }
            List<Orb> lst = getObjects(Orb.class);
            this.numOrbs = lst.size();
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
        if(Greenfoot.isKeyDown("b") ){
            if(this instanceof Lvl1){
                ((Lvl1)this).getMusic().stop();
            }
            if(this instanceof Lvl2){
                ((Lvl2)this).getMusic().stop();
            }
            if(this instanceof Lvl3){
                ((Lvl3)this).getMusic().stop();
            }
            if(this instanceof Lvl4){
                ((Lvl4)this).getMusic().stop();
            }
            Greenfoot.setWorld(new IntroMenu());
        }
    }
    
    /**
     * Dibuja el indicador de vida y los indicadores de orbes en la pantalla.
     * 
     * @param a El actor al que se vinculan los indicadores.
     */
    public void drawLife(Actor a){
        if(this.lifeIndicator != null){
            this.lifeIndicator.changeActorObjetive(a);
        }else{
            this.lifeIndicator = new Sprite(new GreenfootImage(this.dificulty + "-0" + this.life + ".png"), a, 3);
            addObject(this.lifeIndicator, 0, 0);
            this.lifeIndicator.setOffset(-230, 185);
        }   
        if(this.orbIndicator != null){
            this.orbIndicator.changeActorObjetive(a);
            this.orbText.changeActorObjetive(a);
        }else{
            this.orbIndicator = new Sprite(new GreenfootImage("orb1.png"), a, 1);
            addObject(this.orbIndicator, -500, -500);
            this.orbIndicator.setOffset(230, 185);
            this.orbText = new Sprite(new GreenfootImage("x" + this.score, 32, Color.WHITE, null), a, 1);
            addObject(this.orbText, 0, 0);
            this.orbText.setOffset(270, 185);
        }
    }
    
    /**
     * Actualiza la vida del jugador sumando o restando el valor dado.
     * 
     * @param val El valor a sumar o restar a la vida.
     */
    public void updateLife(int val){
        life += val;
        if(life >= maxLife) life = maxLife;
        if(life <= 0){
            if(this instanceof Lvl1){
                ((Lvl1)this).getMusic().stop();
            }
            if(this instanceof Lvl2){
                ((Lvl2)this).getMusic().stop();
            }
            if(this instanceof Lvl3){
                ((Lvl3)this).getMusic().stop();
            }
            if(this instanceof Lvl4){
                ((Lvl4)this).getMusic().stop();
            }
            DeathScreen ds = new DeathScreen(this, this.dificulty);
            Greenfoot.setWorld(ds);
        }else{
            this.lifeIndicator.updateSprite(new GreenfootImage(this.dificulty + "-0" + this.life + ".png"));
            try{
                this.lifeIndicator.updateSprite(new GreenfootImage(this.dificulty + "-0" + this.life + ".png"));
                GreenfootSound sonidoDamage = new GreenfootSound("damagesound.mp3");
                sonidoDamage.setVolume(100);
                sonidoDamage.play();
            }catch(ArrayIndexOutOfBoundsException e){}
        }
    }
    
    /**
     * Establece la cámara en el actor dado.
     * 
     * @param a El actor al que se establecerá la cámara.
     */
    public void setCamera(Actor a){
        this.camera = new Camera(this, a);
        Greenfoot.setWorld(this.camera);
    }
    
    /**
     * Obtiene la cámara del nivel.
     * 
     * @return La cámara del nivel.
     */
    public Camera getCamera(){
        return this.camera;
    }
    
    /**
     * Cambia al siguiente jugador disponible.
     * 
     * @param next True si se cambia al siguiente jugador, false si se cambia al jugador anterior.
     */
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
    
    /**
     * Añade un punto al contador de orbes.
     */
    public void addScore(){
        this.score++;
        this.orbText.updateSprite(new GreenfootImage("x" + this.score, 32, Color.WHITE, null));
    }
    
    /**
     * Verifica si se ha completado el nivel.
     */
    public void checkWin(){
        boolean res = true;
        List<Player> lst = getObjects(Player.class);
        for(Player p : lst){
            res = res && p.checkFinishTouch();
        }
        if(res && !isWin){
            isWin = true;
            if(this instanceof Lvl1){
                ((Lvl1)this).getMusic().stop();
            }
            if(this instanceof Lvl2){
                ((Lvl2)this).getMusic().stop();
            }
            if(this instanceof Lvl3){
                ((Lvl3)this).getMusic().stop();
            }
            if(this instanceof Lvl4){
                ((Lvl4)this).getMusic().stop();
            }
            
            Win ds = new Win(this.score, this.numOrbs);
            Greenfoot.setWorld(ds);
        }
    }

}
