import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl12 extends Level
{

    /**
     * Constructor for objects of class TestLevel.
     * 
     */
    public Lvl12()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200, 1, new GreenfootImage("Map001.png"));
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * super.setCamera(player);
     */
    private void prepare()
    {

        Player player = new Player();
        addObject(player,62,25);

        Ground ground = new Ground(120);
addObject(ground, 60, 72);
ground = new Ground(240);
addObject(ground, 1488, 96);
ground = new Ground(264);
addObject(ground, 300, 120);
ground = new Ground(336);
addObject(ground, 1056, 144);
ground = new Ground(192);
addObject(ground, 1776, 168);
ground = new Ground(288);
addObject(ground, 192, 216);
ground = new Ground(312);
addObject(ground, 612, 216);
ground = new Ground(240);
addObject(ground, 1416, 240);
ground = new Ground(264);
addObject(ground, 948, 288);
ground = new Ground(312);
addObject(ground, 1308, 360);
ground = new Ground(192);
addObject(ground, 1752, 360);
ground = new Ground(336);
addObject(ground, 408, 384);
ground = new Ground(168);
addObject(ground, 732, 432);
ground = new Ground(120);
addObject(ground, 108, 456);
ground = new Ground(144);
addObject(ground, 504, 480);
ground = new Ground(336);
addObject(ground, 1512, 480);
ground = new Ground(336);
addObject(ground, 216, 552);
ground = new Ground(384);
addObject(ground, 1008, 576);
ground = new Ground(264);
addObject(ground, 1692, 600);
ground = new Ground(264);
addObject(ground, 516, 648);
ground = new Ground(288);
addObject(ground, 1344, 696);
ground = new Ground(216);
addObject(ground, 204, 744);
ground = new Ground(240);
addObject(ground, 744, 768);
ground = new Ground(144);
addObject(ground, 1176, 792);
ground = new Ground(312);
addObject(ground, 1524, 792);
ground = new Ground(264);
addObject(ground, 444, 840);
ground = new Ground(240);
addObject(ground, 960, 864);
ground = new Ground(216);
addObject(ground, 204, 936);
ground = new Ground(312);
addObject(ground, 1308, 960);
ground = new Ground(264);
addObject(ground, 1740, 960);
ground = new Ground(288);
addObject(ground, 600, 984);
ground = new Ground(240);
addObject(ground, 864, 1080);
ground = new Ground(264);
addObject(ground, 1260, 1080);
ground = new Ground(264);
addObject(ground, 1596, 1128);
ground = new Ground(120);
addObject(ground, 1884, 1128);
ground = new Ground(312);
addObject(ground, 300, 1152);
ground = new Ground(144);
addObject(ground, 624, 1152);

    }
    
}
