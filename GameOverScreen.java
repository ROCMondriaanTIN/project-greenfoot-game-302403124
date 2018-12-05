import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOvers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends Mover
{
public void act(){
   if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")) {
       Greenfoot.setWorld(new Lvl1());
    }
}
    
}
