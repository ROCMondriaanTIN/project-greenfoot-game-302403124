import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelector extends World
{


    public LevelSelector()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        this.setBackground("LSbackGround.jpg");
        
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("1")) {
                Greenfoot.setWorld(new Lvl1()); 
        }
             if (Greenfoot.isKeyDown("2")) {
                Greenfoot.setWorld(new Lvl2()); 
        }
    }
    
    private void prepare()
    {
        Level1 level1 = new Level1();
        addObject(level1,335,464);
        Level2 level2 = new Level2();
        addObject(level2,542,464);
        level2.setLocation(685,448);
        level1.setLocation(318,448);
    }
}
