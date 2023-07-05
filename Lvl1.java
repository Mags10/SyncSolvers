import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends Level
{
    private GreenfootSound music;
    public Lvl1(int d)
    {
    super(2000, 1200, 1, new GreenfootImage("Map002.png"), d);
    prepare();
    music = new GreenfootSound("DeathbyGlamour.mp3");
    music.setVolume(18);
    music.playLoop();
    }
    public Lvl1()
    {
    super(2000, 1200, 1, new GreenfootImage("Map002.png"), 1);
    prepare();
    music = new GreenfootSound("DeathbyGlamour.mp3");
    music.setVolume(18);
    music.playLoop();
    }
    public GreenfootSound getMusic(){
        return music;
    }
    
    private void prepare()
    {
        Player player = new Player();
        addObject(player,62,25);
        Player player2 = new Player();
        addObject(player2,1055,476);
        Player player3 = new Player();
        addObject(player3,44,94);

        Block block = new Block(168, 24);
        addObject(block, 84, 60);
        block = new Block(168, 24);
        addObject(block, 1428, 108);
        block = new Block(72, 24);
        addObject(block, 36, 132);
        block = new Block(216, 24);
        addObject(block, 276, 132);
        block = new Block(96, 24);
        addObject(block, 528, 132);
        block = new Block(576, 24);
        addObject(block, 984, 132);
        block = new Block(120, 24);
        addObject(block, 108, 180);
        block = new Block(192, 24);
        addObject(block, 1728, 180);
        block = new Block(1848, 24);
        addObject(block, 924, 252);
        block = new Block(216, 24);
        addObject(block, 1308, 348);
        block = new Block(144, 24);
        addObject(block, 1920, 348);
        block = new Block(192, 24);
        addObject(block, 1536, 396);
        block = new Block(528, 24);
        addObject(block, 912, 420);
        block = new Block(168, 24);
        addObject(block, 1764, 420);
        block = new Block(48, 24);
        addObject(block, 1152, 444);
        block = new Block(48, 24);
        addObject(block, 1152, 468);
        block = new Block(48, 24);
        addObject(block, 1152, 492);
        block = new Block(432, 24);
        addObject(block, 360, 516);
        block = new Block(552, 24);
        addObject(block, 900, 516);
        block = new Block(1896, 24);
        addObject(block, 1044, 612);
        block = new Block(192, 24);
        addObject(block, 840, 780);
        block = new Block(264, 24);
        addObject(block, 348, 852);
        block = new Block(96, 24);
        addObject(block, 672, 852);
        block = new Block(192, 24);
        addObject(block, 1416, 876);
        block = new Block(168, 24);
        addObject(block, 84, 900);
        block = new Block(144, 24);
        addObject(block, 1176, 924);
        block = new Block(72, 24);
        addObject(block, 1644, 924);
        block = new Block(1992, 24);
        addObject(block, 996, 996);
        Obstacle peak = new Obstacle();
        addObject(peak, 276, 108);
        peak = new Obstacle();
        addObject(peak, 804, 108);
        peak = new Obstacle();
        addObject(peak, 900, 108);
        peak = new Obstacle();
        addObject(peak, 924, 108);
        peak = new Obstacle();
        addObject(peak, 1020, 108);
        peak = new Obstacle();
        addObject(peak, 1044, 108);
        peak = new Obstacle();
        addObject(peak, 1068, 108);
        peak = new Obstacle();
        addObject(peak, 1164, 108);
        peak = new Obstacle();
        addObject(peak, 12, 228);
        peak = new Obstacle();
        addObject(peak, 36, 228);
        peak = new Obstacle();
        addObject(peak, 60, 228);
        peak = new Obstacle();
        addObject(peak, 84, 228);
        peak = new Obstacle();
        addObject(peak, 108, 228);
        peak = new Obstacle();
        addObject(peak, 132, 228);
        peak = new Obstacle();
        addObject(peak, 156, 228);
        peak = new Obstacle();
        addObject(peak, 180, 228);
        peak = new Obstacle();
        addObject(peak, 204, 228);
        peak = new Obstacle();
        addObject(peak, 228, 228);
        peak = new Obstacle();
        addObject(peak, 252, 228);
        peak = new Obstacle();
        addObject(peak, 276, 228);
        peak = new Obstacle();
        addObject(peak, 300, 228);
        peak = new Obstacle();
        addObject(peak, 324, 228);
        peak = new Obstacle();
        addObject(peak, 348, 228);
        peak = new Obstacle();
        addObject(peak, 372, 228);
        peak = new Obstacle();
        addObject(peak, 396, 228);
        peak = new Obstacle();
        addObject(peak, 420, 228);
        peak = new Obstacle();
        addObject(peak, 444, 228);
        peak = new Obstacle();
        addObject(peak, 468, 228);
        peak = new Obstacle();
        addObject(peak, 492, 228);
        peak = new Obstacle();
        addObject(peak, 516, 228);
        peak = new Obstacle();
        addObject(peak, 540, 228);
        peak = new Obstacle();
        addObject(peak, 564, 228);
        peak = new Obstacle();
        addObject(peak, 588, 228);
        peak = new Obstacle();
        addObject(peak, 612, 228);
        peak = new Obstacle();
        addObject(peak, 636, 228);
        peak = new Obstacle();
        addObject(peak, 660, 228);
        peak = new Obstacle();
        addObject(peak, 684, 228);
        peak = new Obstacle();
        addObject(peak, 708, 228);
        peak = new Obstacle();
        addObject(peak, 732, 228);
        peak = new Obstacle();
        addObject(peak, 756, 228);
        peak = new Obstacle();
        addObject(peak, 780, 228);
        peak = new Obstacle();
        addObject(peak, 804, 228);
        peak = new Obstacle();
        addObject(peak, 828, 228);
        peak = new Obstacle();
        addObject(peak, 852, 228);
        peak = new Obstacle();
        addObject(peak, 876, 228);
        peak = new Obstacle();
        addObject(peak, 900, 228);
        peak = new Obstacle();
        addObject(peak, 924, 228);
        peak = new Obstacle();
        addObject(peak, 948, 228);
        peak = new Obstacle();
        addObject(peak, 972, 228);
        peak = new Obstacle();
        addObject(peak, 996, 228);
        peak = new Obstacle();
        addObject(peak, 1020, 228);
        peak = new Obstacle();
        addObject(peak, 1044, 228);
        peak = new Obstacle();
        addObject(peak, 1068, 228);
        peak = new Obstacle();
        addObject(peak, 1092, 228);
        peak = new Obstacle();
        addObject(peak, 1116, 228);
        peak = new Obstacle();
        addObject(peak, 1140, 228);
        peak = new Obstacle();
        addObject(peak, 1164, 228);
        peak = new Obstacle();
        addObject(peak, 1188, 228);
        peak = new Obstacle();
        addObject(peak, 1212, 228);
        peak = new Obstacle();
        addObject(peak, 1236, 228);
        peak = new Obstacle();
        addObject(peak, 1260, 228);
        peak = new Obstacle();
        addObject(peak, 1284, 228);
        peak = new Obstacle();
        addObject(peak, 1308, 228);
        peak = new Obstacle();
        addObject(peak, 1332, 228);
        peak = new Obstacle();
        addObject(peak, 1356, 228);
        peak = new Obstacle();
        addObject(peak, 1380, 228);
        peak = new Obstacle();
        addObject(peak, 1404, 228);
        peak = new Obstacle();
        addObject(peak, 1428, 228);
        peak = new Obstacle();
        addObject(peak, 1452, 228);
        peak = new Obstacle();
        addObject(peak, 1476, 228);
        peak = new Obstacle();
        addObject(peak, 1500, 228);
        peak = new Obstacle();
        addObject(peak, 1524, 228);
        peak = new Obstacle();
        addObject(peak, 1548, 228);
        peak = new Obstacle();
        addObject(peak, 1572, 228);
        peak = new Obstacle();
        addObject(peak, 1596, 228);
        peak = new Obstacle();
        addObject(peak, 1620, 228);
        peak = new Obstacle();
        addObject(peak, 1644, 228);
        peak = new Obstacle();
        addObject(peak, 1668, 228);
        peak = new Obstacle();
        addObject(peak, 1692, 228);
        peak = new Obstacle();
        addObject(peak, 1716, 228);
        peak = new Obstacle();
        addObject(peak, 1740, 228);
        peak = new Obstacle();
        addObject(peak, 1764, 228);
        peak = new Obstacle();
        addObject(peak, 1788, 228);
        peak = new Obstacle();
        addObject(peak, 1812, 228);
        peak = new Obstacle();
        addObject(peak, 1836, 228);
        peak = new Obstacle();
        addObject(peak, 1932, 324);
        peak = new Obstacle();
        addObject(peak, 1524, 372);
        peak = new Obstacle();
        addObject(peak, 1548, 372);
        peak = new Obstacle();
        addObject(peak, 828, 396);
        peak = new Obstacle();
        addObject(peak, 852, 396);
        peak = new Obstacle();
        addObject(peak, 876, 396);
        peak = new Obstacle();
        addObject(peak, 900, 396);
        peak = new Obstacle();
        addObject(peak, 1788, 396);
        peak = new Obstacle();
        addObject(peak, 588, 540);
        peak = new Obstacle();
        addObject(peak, 612, 540);
        peak = new Obstacle();
        addObject(peak, 108, 588);
        peak = new Obstacle();
        addObject(peak, 132, 588);
        peak = new Obstacle();
        addObject(peak, 156, 588);
        peak = new Obstacle();
        addObject(peak, 180, 588);
        peak = new Obstacle();
        addObject(peak, 204, 588);
        peak = new Obstacle();
        addObject(peak, 228, 588);
        peak = new Obstacle();
        addObject(peak, 252, 588);
        peak = new Obstacle();
        addObject(peak, 276, 588);
        peak = new Obstacle();
        addObject(peak, 300, 588);
        peak = new Obstacle();
        addObject(peak, 324, 588);
        peak = new Obstacle();
        addObject(peak, 348, 588);
        peak = new Obstacle();
        addObject(peak, 372, 588);
        peak = new Obstacle();
        addObject(peak, 396, 588);
        peak = new Obstacle();
        addObject(peak, 420, 588);
        peak = new Obstacle();
        addObject(peak, 444, 588);
        peak = new Obstacle();
        addObject(peak, 468, 588);
        peak = new Obstacle();
        addObject(peak, 492, 588);
        peak = new Obstacle();
        addObject(peak, 516, 588);
        peak = new Obstacle();
        addObject(peak, 540, 588);
        peak = new Obstacle();
        addObject(peak, 564, 588);
        peak = new Obstacle();
        addObject(peak, 588, 588);
        peak = new Obstacle();
        addObject(peak, 612, 588);
        peak = new Obstacle();
        addObject(peak, 636, 588);
        peak = new Obstacle();
        addObject(peak, 660, 588);
        peak = new Obstacle();
        addObject(peak, 684, 588);
        peak = new Obstacle();
        addObject(peak, 708, 588);
        peak = new Obstacle();
        addObject(peak, 732, 588);
        peak = new Obstacle();
        addObject(peak, 756, 588);
        peak = new Obstacle();
        addObject(peak, 780, 588);
        peak = new Obstacle();
        addObject(peak, 804, 588);
        peak = new Obstacle();
        addObject(peak, 828, 588);
        peak = new Obstacle();
        addObject(peak, 852, 588);
        peak = new Obstacle();
        addObject(peak, 876, 588);
        peak = new Obstacle();
        addObject(peak, 900, 588);
        peak = new Obstacle();
        addObject(peak, 924, 588);
        peak = new Obstacle();
        addObject(peak, 948, 588);
        peak = new Obstacle();
        addObject(peak, 972, 588);
        peak = new Obstacle();
        addObject(peak, 996, 588);
        peak = new Obstacle();
        addObject(peak, 1020, 588);
        peak = new Obstacle();
        addObject(peak, 1044, 588);
        peak = new Obstacle();
        addObject(peak, 1068, 588);
        peak = new Obstacle();
        addObject(peak, 1092, 588);
        peak = new Obstacle();
        addObject(peak, 1116, 588);
        peak = new Obstacle();
        addObject(peak, 1140, 588);
        peak = new Obstacle();
        addObject(peak, 1164, 588);
        peak = new Obstacle();
        addObject(peak, 1188, 588);
        peak = new Obstacle();
        addObject(peak, 1212, 588);
        peak = new Obstacle();
        addObject(peak, 1236, 588);
        peak = new Obstacle();
        addObject(peak, 1260, 588);
        peak = new Obstacle();
        addObject(peak, 1284, 588);
        peak = new Obstacle();
        addObject(peak, 1308, 588);
        peak = new Obstacle();
        addObject(peak, 1332, 588);
        peak = new Obstacle();
        addObject(peak, 1356, 588);
        peak = new Obstacle();
        addObject(peak, 1380, 588);
        peak = new Obstacle();
        addObject(peak, 1404, 588);
        peak = new Obstacle();
        addObject(peak, 1428, 588);
        peak = new Obstacle();
        addObject(peak, 1452, 588);
        peak = new Obstacle();
        addObject(peak, 1476, 588);
        peak = new Obstacle();
        addObject(peak, 1500, 588);
        peak = new Obstacle();
        addObject(peak, 1524, 588);
        peak = new Obstacle();
        addObject(peak, 1548, 588);
        peak = new Obstacle();
        addObject(peak, 1572, 588);
        peak = new Obstacle();
        addObject(peak, 1596, 588);
        peak = new Obstacle();
        addObject(peak, 1620, 588);
        peak = new Obstacle();
        addObject(peak, 1644, 588);
        peak = new Obstacle();
        addObject(peak, 1668, 588);
        peak = new Obstacle();
        addObject(peak, 1692, 588);
        peak = new Obstacle();
        addObject(peak, 1716, 588);
        peak = new Obstacle();
        addObject(peak, 1740, 588);
        peak = new Obstacle();
        addObject(peak, 1764, 588);
        peak = new Obstacle();
        addObject(peak, 1788, 588);
        peak = new Obstacle();
        addObject(peak, 1812, 588);
        peak = new Obstacle();
        addObject(peak, 1836, 588);
        peak = new Obstacle();
        addObject(peak, 1860, 588);
        peak = new Obstacle();
        addObject(peak, 1884, 588);
        peak = new Obstacle();
        addObject(peak, 1908, 588);
        peak = new Obstacle();
        addObject(peak, 1932, 588);
        peak = new Obstacle();
        addObject(peak, 1956, 588);
        peak = new Obstacle();
        addObject(peak, 1980, 588);
        peak = new Obstacle();
        addObject(peak, 12, 972);
        peak = new Obstacle();
        addObject(peak, 36, 972);
        peak = new Obstacle();
        addObject(peak, 60, 972);
        peak = new Obstacle();
        addObject(peak, 84, 972);
        peak = new Obstacle();
        addObject(peak, 108, 972);
        peak = new Obstacle();
        addObject(peak, 132, 972);
        peak = new Obstacle();
        addObject(peak, 156, 972);
        peak = new Obstacle();
        addObject(peak, 180, 972);
        peak = new Obstacle();
        addObject(peak, 204, 972);
        peak = new Obstacle();
        addObject(peak, 228, 972);
        peak = new Obstacle();
        addObject(peak, 252, 972);
        peak = new Obstacle();
        addObject(peak, 276, 972);
        peak = new Obstacle();
        addObject(peak, 300, 972);
        peak = new Obstacle();
        addObject(peak, 324, 972);
        peak = new Obstacle();
        addObject(peak, 348, 972);
        peak = new Obstacle();
        addObject(peak, 372, 972);
        peak = new Obstacle();
        addObject(peak, 396, 972);
        peak = new Obstacle();
        addObject(peak, 420, 972);
        peak = new Obstacle();
        addObject(peak, 444, 972);
        peak = new Obstacle();
        addObject(peak, 468, 972);
        peak = new Obstacle();
        addObject(peak, 492, 972);
        peak = new Obstacle();
        addObject(peak, 516, 972);
        peak = new Obstacle();
        addObject(peak, 540, 972);
        peak = new Obstacle();
        addObject(peak, 564, 972);
        peak = new Obstacle();
        addObject(peak, 588, 972);
        peak = new Obstacle();
        addObject(peak, 612, 972);
        peak = new Obstacle();
        addObject(peak, 636, 972);
        peak = new Obstacle();
        addObject(peak, 660, 972);
        peak = new Obstacle();
        addObject(peak, 684, 972);
        peak = new Obstacle();
        addObject(peak, 708, 972);
        peak = new Obstacle();
        addObject(peak, 732, 972);
        peak = new Obstacle();
        addObject(peak, 756, 972);
        peak = new Obstacle();
        addObject(peak, 780, 972);
        peak = new Obstacle();
        addObject(peak, 804, 972);
        peak = new Obstacle();
        addObject(peak, 828, 972);
        peak = new Obstacle();
        addObject(peak, 852, 972);
        peak = new Obstacle();
        addObject(peak, 876, 972);
        peak = new Obstacle();
        addObject(peak, 900, 972);
        peak = new Obstacle();
        addObject(peak, 924, 972);
        peak = new Obstacle();
        addObject(peak, 948, 972);
        peak = new Obstacle();
        addObject(peak, 972, 972);
        peak = new Obstacle();
        addObject(peak, 996, 972);
        peak = new Obstacle();
        addObject(peak, 1020, 972);
        peak = new Obstacle();
        addObject(peak, 1044, 972);
        peak = new Obstacle();
        addObject(peak, 1068, 972);
        peak = new Obstacle();
        addObject(peak, 1092, 972);
        peak = new Obstacle();
        addObject(peak, 1116, 972);
        peak = new Obstacle();
        addObject(peak, 1140, 972);
        peak = new Obstacle();
        addObject(peak, 1164, 972);
        peak = new Obstacle();
        addObject(peak, 1188, 972);
        peak = new Obstacle();
        addObject(peak, 1212, 972);
        peak = new Obstacle();
        addObject(peak, 1236, 972);
        peak = new Obstacle();
        addObject(peak, 1260, 972);
        peak = new Obstacle();
        addObject(peak, 1284, 972);
        peak = new Obstacle();
        addObject(peak, 1308, 972);
        peak = new Obstacle();
        addObject(peak, 1332, 972);
        peak = new Obstacle();
        addObject(peak, 1356, 972);
        peak = new Obstacle();
        addObject(peak, 1380, 972);
        peak = new Obstacle();
        addObject(peak, 1404, 972);
        peak = new Obstacle();
        addObject(peak, 1428, 972);
        peak = new Obstacle();
        addObject(peak, 1452, 972);
        peak = new Obstacle();
        addObject(peak, 1476, 972);
        peak = new Obstacle();
        addObject(peak, 1500, 972);
        peak = new Obstacle();
        addObject(peak, 1524, 972);
        peak = new Obstacle();
        addObject(peak, 1548, 972);
        peak = new Obstacle();
        addObject(peak, 1572, 972);
        peak = new Obstacle();
        addObject(peak, 1596, 972);
        peak = new Obstacle();
        addObject(peak, 1620, 972);
        peak = new Obstacle();
        addObject(peak, 1644, 972);
        peak = new Obstacle();
        addObject(peak, 1668, 972);
        peak = new Obstacle();
        addObject(peak, 1692, 972);
        peak = new Obstacle();
        addObject(peak, 1716, 972);

        Orb orb = new Orb();
        addObject(orb,420,36);
        orb = new Orb();
        addObject(orb,636,36);
        orb = new Orb();
        addObject(orb,924,36);
        orb = new Orb();
        addObject(orb,1308,36);
        orb = new Orb();
        addObject(orb,1620,36);
        orb = new Orb();
        addObject(orb,1476,60);
        orb = new Orb();
        addObject(orb,1860,60);
        orb = new Orb();
        addObject(orb,252,84);
        orb = new Orb();
        addObject(orb,348,84);
        orb = new Orb();
        addObject(orb,516,84);
        orb = new Orb();
        addObject(orb,1116,84);
        orb = new Orb();
        addObject(orb,1716,132);
        orb = new Orb();
        addObject(orb,1932,156);
        orb = new Orb();
        addObject(orb,1932,252);
        orb = new Orb();
        addObject(orb,876,300);
        orb = new Orb();
        addObject(orb,564,324);
        orb = new Orb();
        addObject(orb,1116,324);
        orb = new Orb();
        addObject(orb,1476,324);
        orb = new Orb();
        addObject(orb,1692,324);
        orb = new Orb();
        addObject(orb,708,372);
        orb = new Orb();
        addObject(orb,60,396);
        orb = new Orb();
        addObject(orb,276,396);
        orb = new Orb();
        addObject(orb,516,396);
        orb = new Orb();
        addObject(orb,132,444);
        orb = new Orb();
        addObject(orb,420,444);
        orb = new Orb();
        addObject(orb,36,492);
        orb = new Orb();
        addObject(orb,36,588);
        orb = new Orb();
        addObject(orb,36,684);
        orb = new Orb();
        addObject(orb,828,684);
        orb = new Orb();
        addObject(orb,996,708);
        orb = new Orb();
        addObject(orb,1092,732);
        orb = new Orb();
        addObject(orb,588,756);
        orb = new Orb();
        addObject(orb,36,780);
        orb = new Orb();
        addObject(orb,180,780);
        orb = new Orb();
        addObject(orb,516,780);
        orb = new Orb();
        addObject(orb,1260,780);
        orb = new Orb();
        addObject(orb,1524,780);
        orb = new Orb();
        addObject(orb,1140,828);
        orb = new Orb();
        addObject(orb,1620,828);

        Laser laser = new Laser(72, "Blue");
        addObject(laser,750,468);

        PushButton pushButton = new PushButton(laser, "Blue");
        addObject(pushButton,691,492);
        Finish finish = new Finish();
        addObject(finish,1872,934);
        
        
    }
}

