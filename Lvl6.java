import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl6 extends Level
{

    public Lvl6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200, 1, new GreenfootImage("Map003.png"));
        prepare();
    }
    
    private void prepare(){
        Player player = new Player();
        addObject(player,62,25);
        Block block = new Block(72, 24);
addObject(block, 36, 84);
block = new Block(48, 24);
addObject(block, 624, 84);
block = new Block(120, 24);
addObject(block, 468, 132);
block = new Block(120, 24);
addObject(block, 780, 132);
block = new Block(120, 24);
addObject(block, 108, 156);
block = new Block(72, 24);
addObject(block, 348, 180);
block = new Block(72, 24);
addObject(block, 252, 228);
block = new Block(72, 24);
addObject(block, 612, 228);
block = new Block(48, 24);
addObject(block, 912, 228);
block = new Block(1008, 24);
addObject(block, 504, 300);
block = new Block(24, 24);
addObject(block, 252, 324);
block = new Block(24, 24);
addObject(block, 252, 348);
block = new Block(408, 24);
addObject(block, 444, 372);
block = new Block(120, 24);
addObject(block, 1044, 372);
block = new Block(72, 24);
addObject(block, 708, 420);
block = new Block(48, 24);
addObject(block, 816, 420);
block = new Block(120, 24);
addObject(block, 972, 420);
block = new Block(144, 24);
addObject(block, 1224, 444);
block = new Block(1320, 24);
addObject(block, 660, 516);
block = new Block(24, 24);
addObject(block, 1308, 540);
block = new Block(24, 24);
addObject(block, 1308, 564);
block = new Block(24, 24);
addObject(block, 1308, 588);
block = new Block(144, 24);
addObject(block, 1368, 612);
block = new Block(144, 24);
addObject(block, 1632, 612);
block = new Block(96, 24);
addObject(block, 1872, 612);
block = new Block(24, 24);
addObject(block, 1308, 636);
block = new Block(24, 24);
addObject(block, 1908, 636);
block = new Block(24, 24);
addObject(block, 1308, 660);
block = new Block(24, 24);
addObject(block, 1908, 660);
block = new Block(24, 24);
addObject(block, 1308, 684);
block = new Block(72, 24);
addObject(block, 1428, 684);
block = new Block(48, 24);
addObject(block, 1824, 684);
block = new Block(24, 24);
addObject(block, 1908, 684);
block = new Block(24, 24);
addObject(block, 1308, 708);
block = new Block(24, 24);
addObject(block, 1908, 708);
block = new Block(24, 24);
addObject(block, 1308, 732);
block = new Block(24, 24);
addObject(block, 1908, 732);
block = new Block(24, 24);
addObject(block, 1308, 756);
block = new Block(48, 24);
addObject(block, 1368, 756);
block = new Block(72, 24);
addObject(block, 1884, 756);
block = new Block(24, 24);
addObject(block, 1308, 780);
block = new Block(24, 24);
addObject(block, 1908, 780);
block = new Block(24, 24);
addObject(block, 1308, 804);
block = new Block(24, 24);
addObject(block, 1908, 804);
block = new Block(48, 24);
addObject(block, 672, 828);
block = new Block(624, 24);
addObject(block, 1608, 828);
block = new Block(72, 24);
addObject(block, 540, 876);
block = new Block(48, 24);
addObject(block, 744, 876);
block = new Block(48, 24);
addObject(block, 408, 948);
block = new Block(48, 24);
addObject(block, 816, 948);
block = new Block(336, 24);
addObject(block, 168, 1020);
block = new Block(1104, 24);
addObject(block, 1416, 1020);
Obstacle peak = new Obstacle();
addObject(peak, 468, 108);
peak = new Obstacle();
addObject(peak, 12, 276);
peak = new Obstacle();
addObject(peak, 36, 276);
peak = new Obstacle();
addObject(peak, 60, 276);
peak = new Obstacle();
addObject(peak, 84, 276);
peak = new Obstacle();
addObject(peak, 108, 276);
peak = new Obstacle();
addObject(peak, 132, 276);
peak = new Obstacle();
addObject(peak, 156, 276);
peak = new Obstacle();
addObject(peak, 180, 276);
peak = new Obstacle();
addObject(peak, 204, 276);
peak = new Obstacle();
addObject(peak, 228, 276);
peak = new Obstacle();
addObject(peak, 252, 276);
peak = new Obstacle();
addObject(peak, 276, 276);
peak = new Obstacle();
addObject(peak, 300, 276);
peak = new Obstacle();
addObject(peak, 324, 276);
peak = new Obstacle();
addObject(peak, 348, 276);
peak = new Obstacle();
addObject(peak, 372, 276);
peak = new Obstacle();
addObject(peak, 396, 276);
peak = new Obstacle();
addObject(peak, 420, 276);
peak = new Obstacle();
addObject(peak, 444, 276);
peak = new Obstacle();
addObject(peak, 468, 276);
peak = new Obstacle();
addObject(peak, 492, 276);
peak = new Obstacle();
addObject(peak, 516, 276);
peak = new Obstacle();
addObject(peak, 540, 276);
peak = new Obstacle();
addObject(peak, 564, 276);
peak = new Obstacle();
addObject(peak, 588, 276);
peak = new Obstacle();
addObject(peak, 612, 276);
peak = new Obstacle();
addObject(peak, 636, 276);
peak = new Obstacle();
addObject(peak, 660, 276);
peak = new Obstacle();
addObject(peak, 684, 276);
peak = new Obstacle();
addObject(peak, 708, 276);
peak = new Obstacle();
addObject(peak, 732, 276);
peak = new Obstacle();
addObject(peak, 756, 276);
peak = new Obstacle();
addObject(peak, 780, 276);
peak = new Obstacle();
addObject(peak, 804, 276);
peak = new Obstacle();
addObject(peak, 828, 276);
peak = new Obstacle();
addObject(peak, 852, 276);
peak = new Obstacle();
addObject(peak, 876, 276);
peak = new Obstacle();
addObject(peak, 900, 276);
peak = new Obstacle();
addObject(peak, 924, 276);
peak = new Obstacle();
addObject(peak, 948, 276);
peak = new Obstacle();
addObject(peak, 972, 276);
peak = new Obstacle();
addObject(peak, 996, 276);
peak = new Obstacle();
addObject(peak, 1236, 420);
peak = new Obstacle();
addObject(peak, 1260, 420);
peak = new Obstacle();
addObject(peak, 12, 492);
peak = new Obstacle();
addObject(peak, 36, 492);
peak = new Obstacle();
addObject(peak, 60, 492);
peak = new Obstacle();
addObject(peak, 84, 492);
peak = new Obstacle();
addObject(peak, 108, 492);
peak = new Obstacle();
addObject(peak, 132, 492);
peak = new Obstacle();
addObject(peak, 156, 492);
peak = new Obstacle();
addObject(peak, 180, 492);
peak = new Obstacle();
addObject(peak, 204, 492);
peak = new Obstacle();
addObject(peak, 228, 492);
peak = new Obstacle();
addObject(peak, 252, 492);
peak = new Obstacle();
addObject(peak, 276, 492);
peak = new Obstacle();
addObject(peak, 300, 492);
peak = new Obstacle();
addObject(peak, 324, 492);
peak = new Obstacle();
addObject(peak, 348, 492);
peak = new Obstacle();
addObject(peak, 372, 492);
peak = new Obstacle();
addObject(peak, 396, 492);
peak = new Obstacle();
addObject(peak, 420, 492);
peak = new Obstacle();
addObject(peak, 444, 492);
peak = new Obstacle();
addObject(peak, 468, 492);
peak = new Obstacle();
addObject(peak, 492, 492);
peak = new Obstacle();
addObject(peak, 516, 492);
peak = new Obstacle();
addObject(peak, 540, 492);
peak = new Obstacle();
addObject(peak, 564, 492);
peak = new Obstacle();
addObject(peak, 588, 492);
peak = new Obstacle();
addObject(peak, 612, 492);
peak = new Obstacle();
addObject(peak, 636, 492);
peak = new Obstacle();
addObject(peak, 660, 492);
peak = new Obstacle();
addObject(peak, 684, 492);
peak = new Obstacle();
addObject(peak, 708, 492);
peak = new Obstacle();
addObject(peak, 732, 492);
peak = new Obstacle();
addObject(peak, 756, 492);
peak = new Obstacle();
addObject(peak, 780, 492);
peak = new Obstacle();
addObject(peak, 804, 492);
peak = new Obstacle();
addObject(peak, 828, 492);
peak = new Obstacle();
addObject(peak, 852, 492);
peak = new Obstacle();
addObject(peak, 876, 492);
peak = new Obstacle();
addObject(peak, 900, 492);
peak = new Obstacle();
addObject(peak, 924, 492);
peak = new Obstacle();
addObject(peak, 948, 492);
peak = new Obstacle();
addObject(peak, 972, 492);
peak = new Obstacle();
addObject(peak, 996, 492);
peak = new Obstacle();
addObject(peak, 1020, 492);
peak = new Obstacle();
addObject(peak, 1044, 492);
peak = new Obstacle();
addObject(peak, 1068, 492);
peak = new Obstacle();
addObject(peak, 1092, 492);
peak = new Obstacle();
addObject(peak, 1116, 492);
peak = new Obstacle();
addObject(peak, 1140, 492);
peak = new Obstacle();
addObject(peak, 1164, 492);
peak = new Obstacle();
addObject(peak, 1188, 492);
peak = new Obstacle();
addObject(peak, 1212, 492);
peak = new Obstacle();
addObject(peak, 1236, 492);
peak = new Obstacle();
addObject(peak, 1260, 492);
peak = new Obstacle();
addObject(peak, 1284, 492);
peak = new Obstacle();
addObject(peak, 1308, 492);
peak = new Obstacle();
addObject(peak, 1356, 588);
peak = new Obstacle();
addObject(peak, 1356, 804);
peak = new Obstacle();
addObject(peak, 1380, 804);
peak = new Obstacle();
addObject(peak, 1404, 804);
peak = new Obstacle();
addObject(peak, 1428, 804);
peak = new Obstacle();
addObject(peak, 1452, 804);
peak = new Obstacle();
addObject(peak, 1476, 804);
peak = new Obstacle();
addObject(peak, 1500, 804);
peak = new Obstacle();
addObject(peak, 1524, 804);
peak = new Obstacle();
addObject(peak, 1548, 804);
peak = new Obstacle();
addObject(peak, 1572, 804);
peak = new Obstacle();
addObject(peak, 1596, 804);
peak = new Obstacle();
addObject(peak, 1620, 804);
peak = new Obstacle();
addObject(peak, 1644, 804);
peak = new Obstacle();
addObject(peak, 1668, 804);
peak = new Obstacle();
addObject(peak, 1692, 804);
peak = new Obstacle();
addObject(peak, 1716, 804);
peak = new Obstacle();
addObject(peak, 1740, 804);
peak = new Obstacle();
addObject(peak, 1764, 804);
peak = new Obstacle();
addObject(peak, 1788, 804);
peak = new Obstacle();
addObject(peak, 1812, 804);
peak = new Obstacle();
addObject(peak, 1836, 804);
peak = new Obstacle();
addObject(peak, 1860, 804);
peak = new Obstacle();
addObject(peak, 1884, 804);
peak = new Obstacle();
addObject(peak, 180, 996);
peak = new Obstacle();
addObject(peak, 204, 996);
peak = new Obstacle();
addObject(peak, 1116, 996);
peak = new Obstacle();
addObject(peak, 1140, 996);
peak = new Obstacle();
addObject(peak, 1356, 996);
peak = new Obstacle();
addObject(peak, 1380, 996);
peak = new Obstacle();
addObject(peak, 1404, 996);
peak = new Obstacle();
addObject(peak, 1692, 996);
peak = new Obstacle();
addObject(peak, 1716, 996);
peak = new Obstacle();
addObject(peak, 1740, 996);
peak = new Obstacle();
addObject(peak, 1764, 996);
}
}
