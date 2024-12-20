import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Lvl4: representa el primer nivel del juego.
 * Extiende la clase Level.
 * 
 * @author Noe & Miguel
 * @version 04/07/2023
 */
public class Lvl4 extends Level{
    
    private GreenfootSound music;
    /**
     * Constructor de la clase Lvl4.
     * Crea un nuevo nivel con el ancho y alto especificados, el fondo dado y la dificultad dada.
     * 
     * @param d La dificultad del nivel.
     */
    public Lvl4(int d){
        super(2000, 1200, 2, new GreenfootImage("Map005.png"), d);
        prepare();
        music = new GreenfootSound("Asgore.mp3");
        music.setVolume(18);
        music.playLoop();
    }
    /**
     * Constructor de la clase Lvl4.
     * Crea un nuevo nivel con el ancho y alto especificados, el fondo dado y la dificultad predeterminada.
     */
    public Lvl4(){
        super(2000, 1200, 2, new GreenfootImage("Map005.png"), 1);
        prepare();
        music = new GreenfootSound("Asgore.mp3");
        music.setVolume(18);
        music.playLoop();
    }
    /**
     * Obtiene la música del nivel.
     * 
     * @return El objeto GreenfootSound que representa la música del nivel.
     */
    public GreenfootSound getMusic(){
        return music;
    }
    /**
     * Prepara el nivel colocando los objetos y jugadores en posiciones iniciales.
     */
    private void prepare(){
        Player player = new Player();
        addObject(player,62,25);
        Player player2 = new Player();
        addObject(player2,147,1055);
        Player player3 = new Player();
        addObject(player3,1063,157);

        Block block = new Block(24, 24);
        addObject(block, 204, 12);
        block = new Block(24, 24);
        addObject(block, 204, 36);
        block = new Block(144, 24);
        addObject(block, 72, 60);
        block = new Block(24, 24);
        addObject(block, 204, 60);
        block = new Block(24, 24);
        addObject(block, 204, 84);
        block = new Block(72, 24);
        addObject(block, 708, 84);
        block = new Block(24, 24);
        addObject(block, 204, 108);
        block = new Block(24, 24);
        addObject(block, 204, 132);
        block = new Block(72, 24);
        addObject(block, 540, 132);
        block = new Block(48, 24);
        addObject(block, 48, 156);
        block = new Block(96, 24);
        addObject(block, 168, 156);
        block = new Block(216, 24);
        addObject(block, 1356, 156);
        block = new Block(24, 24);
        addObject(block, 60, 180);
        block = new Block(24, 24);
        addObject(block, 132, 180);
        block = new Block(24, 24);
        addObject(block, 204, 180);
        block = new Block(48, 24);
        addObject(block, 432, 180);
        block = new Block(24, 24);
        addObject(block, 60, 204);
        block = new Block(24, 24);
        addObject(block, 132, 204);
        block = new Block(24, 24);
        addObject(block, 204, 204);
        block = new Block(72, 24);
        addObject(block, 852, 204);
        block = new Block(144, 24);
        addObject(block, 1080, 204);
        block = new Block(24, 24);
        addObject(block, 60, 228);
        block = new Block(24, 24);
        addObject(block, 132, 228);
        block = new Block(24, 24);
        addObject(block, 204, 228);
        block = new Block(48, 24);
        addObject(block, 96, 252);
        block = new Block(24, 24);
        addObject(block, 204, 252);
        block = new Block(48, 24);
        addObject(block, 336, 252);
        block = new Block(24, 24);
        addObject(block, 204, 276);
        block = new Block(24, 24);
        addObject(block, 204, 300);
        block = new Block(48, 24);
        addObject(block, 48, 324);
        block = new Block(24, 24);
        addObject(block, 204, 324);
        block = new Block(336, 24);
        addObject(block, 1824, 324);
        block = new Block(24, 24);
        addObject(block, 204, 348);
        block = new Block(48, 24);
        addObject(block, 288, 348);
        block = new Block(144, 24);
        addObject(block, 72, 372);
        block = new Block(24, 24);
        addObject(block, 204, 372);
        block = new Block(24, 24);
        addObject(block, 204, 396);
        block = new Block(24, 24);
        addObject(block, 204, 420);
        block = new Block(48, 24);
        addObject(block, 360, 420);
        block = new Block(24, 24);
        addObject(block, 204, 444);
        block = new Block(24, 24);
        addObject(block, 204, 468);
        block = new Block(48, 24);
        addObject(block, 456, 468);
        block = new Block(24, 24);
        addObject(block, 204, 492);
        block = new Block(24, 24);
        addObject(block, 204, 516);
        block = new Block(72, 24);
        addObject(block, 588, 516);
        block = new Block(192, 24);
        addObject(block, 120, 540);
        block = new Block(24, 24);
        addObject(block, 204, 564);
        block = new Block(48, 24);
        addObject(block, 696, 564);
        block = new Block(24, 24);
        addObject(block, 204, 588);
        block = new Block(24, 24);
        addObject(block, 204, 612);
        block = new Block(72, 24);
        addObject(block, 804, 612);
        block = new Block(24, 24);
        addObject(block, 204, 636);
        block = new Block(24, 24);
        addObject(block, 204, 660);
        block = new Block(144, 24);
        addObject(block, 960, 660);
        block = new Block(24, 24);
        addObject(block, 204, 684);
        block = new Block(48, 24);
        addObject(block, 24, 708);
        block = new Block(24, 24);
        addObject(block, 204, 708);
        block = new Block(288, 24);
        addObject(block, 1248, 708);
        block = new Block(24, 24);
        addObject(block, 204, 732);
        block = new Block(24, 24);
        addObject(block, 204, 756);
        block = new Block(432, 24);
        addObject(block, 1632, 756);
        block = new Block(48, 24);
        addObject(block, 96, 780);
        block = new Block(24, 24);
        addObject(block, 204, 780);
        block = new Block(24, 24);
        addObject(block, 204, 804);
        block = new Block(24, 24);
        addObject(block, 204, 828);
        block = new Block(24, 24);
        addObject(block, 204, 852);
        block = new Block(96, 24);
        addObject(block, 1944, 852);
        block = new Block(48, 24);
        addObject(block, 144, 876);
        block = new Block(24, 24);
        addObject(block, 204, 876);
        block = new Block(24, 24);
        addObject(block, 204, 900);
        block = new Block(24, 24);
        addObject(block, 204, 924);
        block = new Block(288, 24);
        addObject(block, 1728, 924);
        block = new Block(24, 24);
        addObject(block, 204, 948);
        block = new Block(48, 24);
        addObject(block, 96, 972);
        block = new Block(24, 24);
        addObject(block, 204, 972);
        block = new Block(192, 24);
        addObject(block, 1440, 972);
        block = new Block(24, 24);
        addObject(block, 204, 996);
        block = new Block(24, 24);
        addObject(block, 204, 1020);
        block = new Block(288, 24);
        addObject(block, 792, 1020);
        block = new Block(192, 24);
        addObject(block, 1176, 1020);
        block = new Block(24, 24);
        addObject(block, 204, 1044);
        block = new Block(24, 24);
        addObject(block, 204, 1068);
        block = new Block(72, 24);
        addObject(block, 588, 1068);
        block = new Block(48, 24);
        addObject(block, 144, 1092);
        block = new Block(72, 24);
        addObject(block, 516, 1092);
        block = new Block(72, 24);
        addObject(block, 444, 1116);
        block = new Block(72, 24);
        addObject(block, 372, 1140);
        block = new Block(1992, 24);
        addObject(block, 996, 1164);
        Obstacle peak = new Obstacle();
        addObject(peak, 84, 228);
        peak = new Obstacle();
        addObject(peak, 108, 228);
        peak = new Obstacle();
        addObject(peak, 60, 348);
        peak = new Obstacle();
        addObject(peak, 84, 348);
        peak = new Obstacle();
        addObject(peak, 84, 516);
        peak = new Obstacle();
        addObject(peak, 108, 516);
        peak = new Obstacle();
        addObject(peak, 132, 516);
        peak = new Obstacle();
        addObject(peak, 804, 588);
        peak = new Obstacle();
        addObject(peak, 948, 636);
        peak = new Obstacle();
        addObject(peak, 972, 636);
        peak = new Obstacle();
        addObject(peak, 1212, 684);
        peak = new Obstacle();
        addObject(peak, 1236, 684);
        peak = new Obstacle();
        addObject(peak, 1260, 684);
        peak = new Obstacle();
        addObject(peak, 1284, 684);
        peak = new Obstacle();
        addObject(peak, 1500, 732);
        peak = new Obstacle();
        addObject(peak, 1524, 732);
        peak = new Obstacle();
        addObject(peak, 1596, 732);
        peak = new Obstacle();
        addObject(peak, 1620, 732);
        peak = new Obstacle();
        addObject(peak, 1692, 732);
        peak = new Obstacle();
        addObject(peak, 1716, 732);
        peak = new Obstacle();
        addObject(peak, 1740, 732);
        peak = new Obstacle();
        addObject(peak, 1692, 900);
        peak = new Obstacle();
        addObject(peak, 1716, 900);
        peak = new Obstacle();
        addObject(peak, 1740, 900);
        peak = new Obstacle();
        addObject(peak, 1764, 900);
        peak = new Obstacle();
        addObject(peak, 1428, 948);
        peak = new Obstacle();
        addObject(peak, 1452, 948);
        peak = new Obstacle();
        addObject(peak, 756, 996);
        peak = new Obstacle();
        addObject(peak, 780, 996);
        peak = new Obstacle();
        addObject(peak, 804, 996);
        peak = new Obstacle();
        addObject(peak, 828, 996);
        peak = new Obstacle();
        addObject(peak, 1164, 996);
        peak = new Obstacle();
        addObject(peak, 1188, 996);
        peak = new Obstacle();
        addObject(peak, 588, 1044);
        peak = new Obstacle();
        addObject(peak, 516, 1068);
        peak = new Obstacle();
        addObject(peak, 444, 1092);
        peak = new Obstacle();
        addObject(peak, 372, 1116);
        peak = new Obstacle();
        addObject(peak, 12, 1140);
        peak = new Obstacle();
        addObject(peak, 36, 1140);
        peak = new Obstacle();
        addObject(peak, 60, 1140);
        peak = new Obstacle();
        addObject(peak, 84, 1140);
        peak = new Obstacle();
        addObject(peak, 108, 1140);
        peak = new Obstacle();
        addObject(peak, 132, 1140);
        peak = new Obstacle();
        addObject(peak, 156, 1140);
        peak = new Obstacle();
        addObject(peak, 252, 1140);
        peak = new Obstacle();
        addObject(peak, 276, 1140);
        peak = new Obstacle();
        addObject(peak, 588, 1140);
        peak = new Obstacle();
        addObject(peak, 612, 1140);
        peak = new Obstacle();
        addObject(peak, 636, 1140);
        peak = new Obstacle();
        addObject(peak, 660, 1140);
        peak = new Obstacle();
        addObject(peak, 684, 1140);
        peak = new Obstacle();
        addObject(peak, 708, 1140);
        peak = new Obstacle();
        addObject(peak, 732, 1140);
        peak = new Obstacle();
        addObject(peak, 756, 1140);
        peak = new Obstacle();
        addObject(peak, 780, 1140);
        peak = new Obstacle();
        addObject(peak, 804, 1140);
        peak = new Obstacle();
        addObject(peak, 828, 1140);
        peak = new Obstacle();
        addObject(peak, 852, 1140);
        peak = new Obstacle();
        addObject(peak, 876, 1140);
        peak = new Obstacle();
        addObject(peak, 900, 1140);
        peak = new Obstacle();
        addObject(peak, 924, 1140);
        peak = new Obstacle();
        addObject(peak, 948, 1140);
        peak = new Obstacle();
        addObject(peak, 972, 1140);
        peak = new Obstacle();
        addObject(peak, 996, 1140);
        peak = new Obstacle();
        addObject(peak, 1020, 1140);
        peak = new Obstacle();
        addObject(peak, 1044, 1140);
        peak = new Obstacle();
        addObject(peak, 1068, 1140);
        peak = new Obstacle();
        addObject(peak, 1092, 1140);
        peak = new Obstacle();
        addObject(peak, 1116, 1140);
        peak = new Obstacle();
        addObject(peak, 1140, 1140);
        peak = new Obstacle();
        addObject(peak, 1164, 1140);
        peak = new Obstacle();
        addObject(peak, 1188, 1140);
        peak = new Obstacle();
        addObject(peak, 1212, 1140);
        peak = new Obstacle();
        addObject(peak, 1236, 1140);
        peak = new Obstacle();
        addObject(peak, 1260, 1140);
        peak = new Obstacle();
        addObject(peak, 1284, 1140);
        peak = new Obstacle();
        addObject(peak, 1308, 1140);
        peak = new Obstacle();
        addObject(peak, 1332, 1140);
        peak = new Obstacle();
        addObject(peak, 1356, 1140);
        peak = new Obstacle();
        addObject(peak, 1380, 1140);
        peak = new Obstacle();
        addObject(peak, 1404, 1140);
        peak = new Obstacle();
        addObject(peak, 1428, 1140);
        peak = new Obstacle();
        addObject(peak, 1452, 1140);
        peak = new Obstacle();
        addObject(peak, 1476, 1140);
        peak = new Obstacle();
        addObject(peak, 1500, 1140);
        peak = new Obstacle();
        addObject(peak, 1524, 1140);
        peak = new Obstacle();
        addObject(peak, 1548, 1140);
        peak = new Obstacle();
        addObject(peak, 1572, 1140);
        peak = new Obstacle();
        addObject(peak, 1596, 1140);
        peak = new Obstacle();
        addObject(peak, 1620, 1140);
        peak = new Obstacle();
        addObject(peak, 1644, 1140);
        peak = new Obstacle();
        addObject(peak, 1668, 1140);
        peak = new Obstacle();
        addObject(peak, 1692, 1140);
        peak = new Obstacle();
        addObject(peak, 1716, 1140);
        peak = new Obstacle();
        addObject(peak, 1740, 1140);
        peak = new Obstacle();
        addObject(peak, 1764, 1140);
        peak = new Obstacle();
        addObject(peak, 1788, 1140);
        peak = new Obstacle();
        addObject(peak, 1812, 1140);
        peak = new Obstacle();
        addObject(peak, 1836, 1140);
        peak = new Obstacle();
        addObject(peak, 1860, 1140);
        peak = new Obstacle();
        addObject(peak, 1884, 1140);
        peak = new Obstacle();
        addObject(peak, 1908, 1140);
        peak = new Obstacle();
        addObject(peak, 1932, 1140);
        peak = new Obstacle();
        addObject(peak, 1956, 1140);
        peak = new Obstacle();
        addObject(peak, 1980, 1140);
        Orb orb = new Orb();
        addObject(orb, 612, 36);
        orb = new Orb();
        addObject(orb, 708, 36);
        orb = new Orb();
        addObject(orb, 1548, 60);
        orb = new Orb();
        addObject(orb, 804, 84);
        orb = new Orb();
        addObject(orb, 1212, 84);
        orb = new Orb();
        addObject(orb, 1284, 84);
        orb = new Orb();
        addObject(orb, 1380, 84);
        orb = new Orb();
        addObject(orb, 1476, 84);
        orb = new Orb();
        addObject(orb, 1596, 84);
        orb = new Orb();
        addObject(orb, 156, 108);
        orb = new Orb();
        addObject(orb, 444, 108);
        orb = new Orb();
        addObject(orb, 924, 108);
        orb = new Orb();
        addObject(orb, 1140, 132);
        orb = new Orb();
        addObject(orb, 852, 156);
        orb = new Orb();
        addObject(orb, 996, 156);
        orb = new Orb();
        addObject(orb, 1620, 156);
        orb = new Orb();
        addObject(orb, 348, 180);
        orb = new Orb();
        addObject(orb, 36, 276);
        orb = new Orb();
        addObject(orb, 156, 276);
        orb = new Orb();
        addObject(orb, 252, 276);
        orb = new Orb();
        addObject(orb, 372, 348);
        orb = new Orb();
        addObject(orb, 468, 396);
        orb = new Orb();
        addObject(orb, 156, 420);
        orb = new Orb();
        addObject(orb, 588, 444);
        orb = new Orb();
        addObject(orb, 708, 492);
        orb = new Orb();
        addObject(orb, 780, 540);
        orb = new Orb();
        addObject(orb, 828, 540);
        orb = new Orb();
        addObject(orb, 948, 540);
        orb = new Orb();
        addObject(orb, 1068, 588);
        orb = new Orb();
        addObject(orb, 1236, 588);
        orb = new Orb();
        addObject(orb, 900, 612);
        orb = new Orb();
        addObject(orb, 1020, 612);
        orb = new Orb();
        addObject(orb, 1404, 612);
        orb = new Orb();
        addObject(orb, 1140, 636);
        orb = new Orb();
        addObject(orb, 36, 660);
        orb = new Orb();
        addObject(orb, 1332, 660);
        orb = new Orb();
        addObject(orb, 1476, 660);
        orb = new Orb();
        addObject(orb, 1596, 660);
        orb = new Orb();
        addObject(orb, 1716, 660);
        orb = new Orb();
        addObject(orb, 1812, 708);
        orb = new Orb();
        addObject(orb, 108, 732);
        orb = new Orb();
        addObject(orb, 1908, 780);
        orb = new Orb();
        addObject(orb, 156, 828);
        orb = new Orb();
        addObject(orb, 1740, 828);
        orb = new Orb();
        addObject(orb, 1548, 852);
        orb = new Orb();
        addObject(orb, 1452, 876);
        orb = new Orb();
        addObject(orb, 1644, 876);
        orb = new Orb();
        addObject(orb, 1812, 876);
        orb = new Orb();
        addObject(orb, 84, 900);
        orb = new Orb();
        addObject(orb, 780, 900);
        orb = new Orb();
        addObject(orb, 1332, 900);
        orb = new Orb();
        addObject(orb, 684, 924);
        orb = new Orb();
        addObject(orb, 876, 924);
        orb = new Orb();
        addObject(orb, 996, 924);
        orb = new Orb();
        addObject(orb, 1188, 924);
        orb = new Orb();
        addObject(orb, 612, 972);
        orb = new Orb();
        addObject(orb, 1092, 972);
        orb = new Orb();
        addObject(orb, 1260, 972);
        orb = new Orb();
        addObject(orb, 540, 996);
        orb = new Orb();
        addObject(orb, 468, 1020);
        orb = new Orb();
        addObject(orb, 396, 1044);
        orb = new Orb();
        addObject(orb, 324, 1068);

        Laser laser1 = new Laser(72, "Blue");
        addObject(laser1, 36, 108);
        Laser laser2 = new Laser(312, "Red");
        addObject(laser2, 1668, 156);
        Laser laser3 = new Laser(144, "Yellow");
        addObject(laser3, 36, 456);
        Laser laser4 = new Laser(72, "Purple");
        addObject(laser4, 204, 1116);

        PushButton pushButton = new PushButton(laser3, "Yellow");
        addObject(pushButton, 540, 108);
        pushButton = new PushButton(laser4, "Purple");
        addObject(pushButton, 156, 516);
        pushButton = new PushButton(laser2, "Red");
        addObject(pushButton, 1956, 828);
        pushButton = new PushButton(laser1, "Blue");
        addObject(pushButton, 108, 948);

        Finish finish = new Finish();
        addObject(finish,1890,258);
    }
}
