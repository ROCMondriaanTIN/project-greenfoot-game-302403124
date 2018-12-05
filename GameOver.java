import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{

     
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1,false); 
        this.setBackground("Gameoverscherm.png");
        //prepare();
        prepare();
    }
    int level;
    public GameOver(int lvl)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        level = lvl;
        prepare();
        return;
    }
        private void prepare()
    {
        No no = new No();
        addObject(no,691,463);
        Yes yes = new Yes(1);
        addObject(yes,322,463);
    }
}