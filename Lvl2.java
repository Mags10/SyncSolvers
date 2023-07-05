import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends Level
{
    private GreenfootSound music;
    public Lvl2(int d)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200, 1, new GreenfootImage("Map003.png"), d);
        prepare();
        music = new GreenfootSound("GhostFight.mp3");
        music.setVolume(18);
        music.playLoop();
    }
    public Lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200, 1, new GreenfootImage("Map003.png"),1);
        prepare();
        music = new GreenfootSound("GhostFight.mp3");
        music.setVolume(18);
        music.playLoop();
    }
    public GreenfootSound getMusic(){
        return music;
    }
    
    private void prepare(){
        Player player = new Player();
        addObject(player,62,25);
        Player player2 = new Player();
        addObject(player2,366,336);
        Player player3 = new Player();
        addObject(player3,1806,976);
        
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
        block = new Block(1128, 24);
        addObject(block, 1428, 1020);
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
        peak = new Obstacle();
        addObject(peak, 12, 1188);
        peak = new Obstacle();
        addObject(peak, 36, 1188);
        peak = new Obstacle();
        addObject(peak, 60, 1188);
        peak = new Obstacle();
        addObject(peak, 84, 1188);
        peak = new Obstacle();
        addObject(peak, 108, 1188);
        peak = new Obstacle();
        addObject(peak, 132, 1188);
        peak = new Obstacle();
        addObject(peak, 156, 1188);
        peak = new Obstacle();
        addObject(peak, 180, 1188);
        peak = new Obstacle();
        addObject(peak, 204, 1188);
        peak = new Obstacle();
        addObject(peak, 228, 1188);
        peak = new Obstacle();
        addObject(peak, 252, 1188);
        peak = new Obstacle();
        addObject(peak, 276, 1188);
        peak = new Obstacle();
        addObject(peak, 300, 1188);
        peak = new Obstacle();
        addObject(peak, 324, 1188);
        peak = new Obstacle();
        addObject(peak, 348, 1188);
        peak = new Obstacle();
        addObject(peak, 372, 1188);
        peak = new Obstacle();
        addObject(peak, 396, 1188);
        peak = new Obstacle();
        addObject(peak, 420, 1188);
        peak = new Obstacle();
        addObject(peak, 444, 1188);
        peak = new Obstacle();
        addObject(peak, 468, 1188);
        peak = new Obstacle();
        addObject(peak, 492, 1188);
        peak = new Obstacle();
        addObject(peak, 516, 1188);
        peak = new Obstacle();
        addObject(peak, 540, 1188);
        peak = new Obstacle();
        addObject(peak, 564, 1188);
        peak = new Obstacle();
        addObject(peak, 588, 1188);
        peak = new Obstacle();
        addObject(peak, 612, 1188);
        peak = new Obstacle();
        addObject(peak, 636, 1188);
        peak = new Obstacle();
        addObject(peak, 660, 1188);
        peak = new Obstacle();
        addObject(peak, 684, 1188);
        peak = new Obstacle();
        addObject(peak, 708, 1188);
        peak = new Obstacle();
        addObject(peak, 732, 1188);
        peak = new Obstacle();
        addObject(peak, 756, 1188);
        peak = new Obstacle();
        addObject(peak, 780, 1188);
        peak = new Obstacle();
        addObject(peak, 804, 1188);
        peak = new Obstacle();
        addObject(peak, 828, 1188);
        peak = new Obstacle();
        addObject(peak, 852, 1188);
        peak = new Obstacle();
        addObject(peak, 876, 1188);
        peak = new Obstacle();
        addObject(peak, 900, 1188);
        peak = new Obstacle();
        addObject(peak, 924, 1188);
        peak = new Obstacle();
        addObject(peak, 948, 1188);
        peak = new Obstacle();
        addObject(peak, 972, 1188);
        peak = new Obstacle();
        addObject(peak, 996, 1188);
        peak = new Obstacle();
        addObject(peak, 1020, 1188);
        peak = new Obstacle();
        addObject(peak, 1044, 1188);
        peak = new Obstacle();
        addObject(peak, 1068, 1188);
        peak = new Obstacle();
        addObject(peak, 1092, 1188);
        peak = new Obstacle();
        addObject(peak, 1116, 1188);
        peak = new Obstacle();
        addObject(peak, 1140, 1188);
        peak = new Obstacle();
        addObject(peak, 1164, 1188);
        peak = new Obstacle();
        addObject(peak, 1188, 1188);
        peak = new Obstacle();
        addObject(peak, 1212, 1188);
        peak = new Obstacle();
        addObject(peak, 1236, 1188);
        peak = new Obstacle();
        addObject(peak, 1260, 1188);
        peak = new Obstacle();
        addObject(peak, 1284, 1188);
        peak = new Obstacle();
        addObject(peak, 1308, 1188);
        peak = new Obstacle();
        addObject(peak, 1332, 1188);
        peak = new Obstacle();
        addObject(peak, 1356, 1188);
        peak = new Obstacle();
        addObject(peak, 1380, 1188);
        peak = new Obstacle();
        addObject(peak, 1404, 1188);
        peak = new Obstacle();
        addObject(peak, 1428, 1188);
        peak = new Obstacle();
        addObject(peak, 1452, 1188);
        peak = new Obstacle();
        addObject(peak, 1476, 1188);
        peak = new Obstacle();
        addObject(peak, 1500, 1188);
        peak = new Obstacle();
        addObject(peak, 1524, 1188);
        peak = new Obstacle();
        addObject(peak, 1548, 1188);
        peak = new Obstacle();
        addObject(peak, 1572, 1188);
        peak = new Obstacle();
        addObject(peak, 1596, 1188);
        peak = new Obstacle();
        addObject(peak, 1620, 1188);
        peak = new Obstacle();
        addObject(peak, 1644, 1188);
        peak = new Obstacle();
        addObject(peak, 1668, 1188);
        peak = new Obstacle();
        addObject(peak, 1692, 1188);
        peak = new Obstacle();
        addObject(peak, 1716, 1188);
        peak = new Obstacle();
        addObject(peak, 1740, 1188);
        peak = new Obstacle();
        addObject(peak, 1764, 1188);
        peak = new Obstacle();
        addObject(peak, 1788, 1188);
        peak = new Obstacle();
        addObject(peak, 1812, 1188);
        peak = new Obstacle();
        addObject(peak, 1836, 1188);
        peak = new Obstacle();
        addObject(peak, 1860, 1188);
        peak = new Obstacle();
        addObject(peak, 1884, 1188);
        peak = new Obstacle();
        addObject(peak, 1908, 1188);
        peak = new Obstacle();
        addObject(peak, 1932, 1188);
        peak = new Obstacle();
        addObject(peak, 1956, 1188);
        peak = new Obstacle();
        addObject(peak, 1980, 1188);
        Orb orb = new Orb();
        addObject(orb, 444, 36);
        orb = new Orb();
        addObject(orb, 564, 36);
        orb = new Orb();
        addObject(orb, 756, 36);
        orb = new Orb();
        addObject(orb, 252, 60);
        orb = new Orb();
        addObject(orb, 876, 60);
        orb = new Orb();
        addObject(orb, 204, 84);
        orb = new Orb();
        addObject(orb, 300, 108);
        orb = new Orb();
        addObject(orb, 1044, 132);
        orb = new Orb();
        addObject(orb, 900, 156);
        orb = new Orb();
        addObject(orb, 972, 156);
        orb = new Orb();
        addObject(orb, 1068, 204);
        orb = new Orb();
        addObject(orb, 1164, 252);
        orb = new Orb();
        addObject(orb, 1068, 276);
        orb = new Orb();
        addObject(orb, 1284, 324);
        orb = new Orb();
        addObject(orb, 1356, 324);
        orb = new Orb();
        addObject(orb, 1164, 348);
        orb = new Orb();
        addObject(orb, 1404, 396);
        orb = new Orb();
        addObject(orb, 1404, 468);
        orb = new Orb();
        addObject(orb, 1500, 516);
        orb = new Orb();
        addObject(orb, 1764, 516);
        orb = new Orb();
        addObject(orb, 1404, 540);
        orb = new Orb();
        addObject(orb, 1620, 564);
        orb = new Orb();
        addObject(orb, 1884, 564);
        orb = new Orb();
        addObject(orb, 1956, 612);
        orb = new Orb();
        addObject(orb, 1404, 660);
        orb = new Orb();
        addObject(orb, 1836, 660);
        orb = new Orb();
        addObject(orb, 1956, 684);
        orb = new Orb();
        addObject(orb, 1956, 756);
        orb = new Orb();
        addObject(orb, 684, 780);
        orb = new Orb();
        addObject(orb, 540, 804);
        orb = new Orb();
        addObject(orb, 756, 828);
        orb = new Orb();
        addObject(orb, 1956, 828);
        orb = new Orb();
        addObject(orb, 396, 900);
        orb = new Orb();
        addObject(orb, 828, 900);
        orb = new Orb();
        addObject(orb, 1116, 900);
        orb = new Orb();
        addObject(orb, 1380, 900);
        orb = new Orb();
        addObject(orb, 1716, 900);
        orb = new Orb();
        addObject(orb, 1956, 900);
        orb = new Orb();
        addObject(orb, 180, 924);
        orb = new Orb();
        addObject(orb, 1284, 924);
        orb = new Orb();
        addObject(orb, 1476, 924);
        orb = new Orb();
        addObject(orb, 1644, 924);
        orb = new Orb();
        addObject(orb, 1788, 924);
        orb = new Orb();
        addObject(orb, 300, 948);
        orb = new Orb();
        addObject(orb, 132, 972);
        orb = new Orb();
        addObject(orb, 1956, 972);

        Laser laser1 = new Laser(48 , "Blue");
        addObject(laser1, 492, 336);
        Laser laser2 = new Laser(168, "Red");
        addObject(laser2, 1332, 924);
        Laser laser3 = new Laser(168, "Yellow");
        addObject(laser3, 1860, 924);
        Laser laser4 = new Laser(600, "Purple");
        addObject(laser4,1908,300);

        PushButton pushButton = new PushButton(laser1, "Blue");
        addObject(pushButton, 540, 348);
        pushButton = new PushButton(laser2, "Red");
        addObject(pushButton, 1356, 732);
        pushButton = new PushButton(laser3, "Yellow");
        addObject(pushButton, 1884, 732);
        pushButton = new PushButton(laser4, "Purple");
        addObject(pushButton, 1572, 996);
        
    }
}
