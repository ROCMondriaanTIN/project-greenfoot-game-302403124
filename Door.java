import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Tile
{
    public Door(String image, int width, int heigth) {
        super(image,width,heigth);
    /**
     * Act - do whatever the door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */}
    public void act() 
    {
        
        if(isTouching(Hero.class))
    {
        setImage("door_openMid.png");
    }
    for(Actor hero : getIntersectingObjects(Hero.class))
    {
    if(hero != null  && getWorld()instanceof Lvl1 && (Greenfoot.isKeyDown("right")))
    {
       
        Lvl2 W2 = new Lvl2();
        Greenfoot.setWorld(W2);
        break;
    }
}
}
    
}
