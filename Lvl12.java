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
        super(2000, 1200, 1, new GreenfootImage("Map002.png"));
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

        Block block = new Block(24, 24);
addObject(block, 468, 36);
block = new Block(120, 24);
addObject(block, 60, 60);
block = new Block(24, 24);
addObject(block, 468, 60);
block = new Block(24, 24);
addObject(block, 1260, 60);
block = new Block(24, 24);
addObject(block, 468, 84);
block = new Block(24, 24);
addObject(block, 1260, 84);
block = new Block(240, 24);
addObject(block, 1488, 84);
block = new Block(264, 24);
addObject(block, 300, 108);
block = new Block(24, 24);
addObject(block, 468, 108);
block = new Block(24, 24);
addObject(block, 1260, 108);
block = new Block(24, 24);
addObject(block, 468, 132);
block = new Block(336, 24);
addObject(block, 1056, 132);
block = new Block(24, 24);
addObject(block, 1260, 132);
block = new Block(24, 24);
addObject(block, 468, 156);
block = new Block(24, 24);
addObject(block, 1260, 156);
block = new Block(192, 24);
addObject(block, 1776, 156);
block = new Block(24, 24);
addObject(block, 468, 180);
block = new Block(24, 24);
addObject(block, 852, 180);
block = new Block(24, 24);
addObject(block, 1260, 180);
block = new Block(288, 24);
addObject(block, 192, 204);
block = new Block(312, 24);
addObject(block, 612, 204);
block = new Block(24, 24);
addObject(block, 852, 204);
block = new Block(24, 24);
addObject(block, 1260, 204);
block = new Block(24, 24);
addObject(block, 444, 228);
block = new Block(24, 24);
addObject(block, 852, 228);
block = new Block(24, 24);
addObject(block, 1260, 228);
block = new Block(240, 24);
addObject(block, 1416, 228);
block = new Block(24, 24);
addObject(block, 444, 252);
block = new Block(24, 24);
addObject(block, 852, 252);
block = new Block(24, 24);
addObject(block, 1284, 252);
block = new Block(24, 24);
addObject(block, 444, 276);
block = new Block(264, 24);
addObject(block, 948, 276);
block = new Block(24, 24);
addObject(block, 1284, 276);
block = new Block(24, 24);
addObject(block, 444, 300);
block = new Block(24, 24);
addObject(block, 852, 300);
block = new Block(24, 24);
addObject(block, 1284, 300);
block = new Block(24, 24);
addObject(block, 444, 324);
block = new Block(24, 24);
addObject(block, 852, 324);
block = new Block(24, 24);
addObject(block, 1284, 324);
block = new Block(24, 24);
addObject(block, 444, 348);
block = new Block(24, 24);
addObject(block, 852, 348);
block = new Block(312, 24);
addObject(block, 1308, 348);
block = new Block(192, 24);
addObject(block, 1752, 348);
block = new Block(336, 24);
addObject(block, 408, 372);
block = new Block(24, 24);
addObject(block, 852, 372);
block = new Block(24, 24);
addObject(block, 1284, 372);
block = new Block(24, 24);
addObject(block, 444, 396);
block = new Block(24, 24);
addObject(block, 852, 396);
block = new Block(24, 24);
addObject(block, 1284, 396);
block = new Block(168, 24);
addObject(block, 732, 420);
block = new Block(24, 24);
addObject(block, 852, 420);
block = new Block(24, 24);
addObject(block, 1284, 420);
block = new Block(120, 24);
addObject(block, 108, 444);
block = new Block(24, 24);
addObject(block, 852, 444);
block = new Block(24, 24);
addObject(block, 1284, 444);
block = new Block(144, 24);
addObject(block, 504, 468);
block = new Block(24, 24);
addObject(block, 828, 468);
block = new Block(24, 24);
addObject(block, 1284, 468);
block = new Block(336, 24);
addObject(block, 1512, 468);
block = new Block(24, 24);
addObject(block, 828, 492);
block = new Block(24, 24);
addObject(block, 1284, 492);
block = new Block(24, 24);
addObject(block, 828, 516);
block = new Block(24, 24);
addObject(block, 1284, 516);
block = new Block(336, 24);
addObject(block, 216, 540);
block = new Block(24, 24);
addObject(block, 828, 540);
block = new Block(24, 24);
addObject(block, 1284, 540);
block = new Block(24, 24);
addObject(block, 1644, 540);
block = new Block(384, 24);
addObject(block, 1008, 564);
block = new Block(24, 24);
addObject(block, 1284, 564);
block = new Block(24, 24);
addObject(block, 1644, 564);
block = new Block(24, 24);
addObject(block, 828, 588);
block = new Block(24, 24);
addObject(block, 1308, 588);
block = new Block(264, 24);
addObject(block, 1692, 588);
block = new Block(24, 24);
addObject(block, 828, 612);
block = new Block(24, 24);
addObject(block, 1308, 612);
block = new Block(24, 24);
addObject(block, 1644, 612);
block = new Block(264, 24);
addObject(block, 516, 636);
block = new Block(24, 24);
addObject(block, 828, 636);
block = new Block(24, 24);
addObject(block, 1308, 636);
block = new Block(24, 24);
addObject(block, 1644, 636);
block = new Block(24, 24);
addObject(block, 828, 660);
block = new Block(24, 24);
addObject(block, 1308, 660);
block = new Block(24, 24);
addObject(block, 1668, 660);
block = new Block(24, 24);
addObject(block, 828, 684);
block = new Block(288, 24);
addObject(block, 1344, 684);
block = new Block(24, 24);
addObject(block, 1668, 684);
block = new Block(24, 24);
addObject(block, 300, 708);
block = new Block(24, 24);
addObject(block, 828, 708);
block = new Block(24, 24);
addObject(block, 1308, 708);
block = new Block(24, 24);
addObject(block, 1668, 708);
block = new Block(216, 24);
addObject(block, 204, 732);
block = new Block(24, 24);
addObject(block, 828, 732);
block = new Block(24, 24);
addObject(block, 1308, 732);
block = new Block(24, 24);
addObject(block, 1668, 732);
block = new Block(24, 24);
addObject(block, 300, 756);
block = new Block(240, 24);
addObject(block, 744, 756);
block = new Block(24, 24);
addObject(block, 1668, 756);
block = new Block(24, 24);
addObject(block, 300, 780);
block = new Block(24, 24);
addObject(block, 828, 780);
block = new Block(144, 24);
addObject(block, 1176, 780);
block = new Block(312, 24);
addObject(block, 1524, 780);
block = new Block(24, 24);
addObject(block, 300, 804);
block = new Block(24, 24);
addObject(block, 828, 804);
block = new Block(24, 24);
addObject(block, 1668, 804);
block = new Block(288, 24);
addObject(block, 432, 828);
block = new Block(24, 24);
addObject(block, 828, 828);
block = new Block(24, 24);
addObject(block, 1668, 828);
block = new Block(24, 24);
addObject(block, 300, 852);
block = new Block(264, 24);
addObject(block, 948, 852);
block = new Block(24, 24);
addObject(block, 1692, 852);
block = new Block(24, 24);
addObject(block, 300, 876);
block = new Block(24, 24);
addObject(block, 828, 876);
block = new Block(24, 24);
addObject(block, 1692, 876);
block = new Block(24, 24);
addObject(block, 300, 900);
block = new Block(24, 24);
addObject(block, 828, 900);
block = new Block(24, 24);
addObject(block, 1692, 900);
block = new Block(240, 24);
addObject(block, 216, 924);
block = new Block(24, 24);
addObject(block, 828, 924);
block = new Block(24, 24);
addObject(block, 1692, 924);
block = new Block(24, 24);
addObject(block, 324, 948);
block = new Block(24, 24);
addObject(block, 828, 948);
block = new Block(312, 24);
addObject(block, 1308, 948);
block = new Block(264, 24);
addObject(block, 1740, 948);
block = new Block(24, 24);
addObject(block, 324, 972);
block = new Block(288, 24);
addObject(block, 600, 972);
block = new Block(24, 24);
addObject(block, 828, 972);
block = new Block(24, 24);
addObject(block, 1692, 972);
block = new Block(24, 24);
addObject(block, 324, 996);
block = new Block(24, 24);
addObject(block, 828, 996);
block = new Block(24, 24);
addObject(block, 1692, 996);
block = new Block(24, 24);
addObject(block, 324, 1020);
block = new Block(24, 24);
addObject(block, 828, 1020);
block = new Block(24, 24);
addObject(block, 1692, 1020);
block = new Block(24, 24);
addObject(block, 324, 1044);
block = new Block(24, 24);
addObject(block, 804, 1044);
block = new Block(24, 24);
addObject(block, 1716, 1044);
block = new Block(24, 24);
addObject(block, 324, 1068);
block = new Block(240, 24);
addObject(block, 864, 1068);
block = new Block(264, 24);
addObject(block, 1260, 1068);
block = new Block(24, 24);
addObject(block, 1716, 1068);
block = new Block(24, 24);
addObject(block, 324, 1092);
block = new Block(24, 24);
addObject(block, 804, 1092);
block = new Block(24, 24);
addObject(block, 1716, 1092);
block = new Block(24, 24);
addObject(block, 804, 1116);
block = new Block(264, 24);
addObject(block, 1596, 1116);
block = new Block(120, 24);
addObject(block, 1884, 1116);
block = new Block(312, 24);
addObject(block, 300, 1140);
block = new Block(144, 24);
addObject(block, 624, 1140);
block = new Block(24, 24);
addObject(block, 804, 1140);
block = new Block(24, 24);
addObject(block, 804, 1164);
block = new Block(24, 24);
addObject(block, 804, 1188);



    }
    
}
