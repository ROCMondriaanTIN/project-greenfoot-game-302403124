
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class Lvl1 extends World{

    private CollisionEngine ce;

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public Lvl1() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("bg.png");

        int[][] map = {
                {19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,19,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,-1,19,19,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,19,-1,-1,-1,-1,-1,-1,19,19,19,19,19,-1,-1,-1,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,-1,19,19,19,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,126,-1,128,-1,60,-1,127,-1,126,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,19,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,25,25,25,25,25,35,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,25,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,19},
                {19,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,35,35,35,35,35,35,35,35,35,35,35,35,19},
                {19,-1,25,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,19},
                {19,169,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,19},
                {19,36,36,36,36,36,36,-1,-1,-1,-1,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,-1,-1,-1,-1,36,36,-1,-1,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,92,92,92,92,19,19,19,92,92,92,92,92,19,19,92,19,19,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,90,90,19,90,90,19,90,90,19,19,19,19,90,90,90,19,-1,-1,-1,19},
                {19,169,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,90,19,90,90,90,90,19,19,-1,-1,19,90,90,19,19,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,90,90,19,19,19,19,-1,19,19,19,19,19,-1,-1,-1,19},
                {19,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,19,19,19,19,19,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,19},
                {19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,19},
                {19,19,92,92,92,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,19,90,90,90,19,19,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,19,19,90,19,19,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,169,19,19,19,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,19,35,35,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,19,19,19,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,189,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,20,19,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,20,20,19,19,20,20,20,19,19,19,19,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,19},
                {19,127,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,20,19,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,169,19,19,19,-1,-1,-1,26,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,188,-1,127,19},
                {19,223,-1,-1,-1,-1,-1,-1,-1,19,20,20,-1,-1,-1,-1,-1,-1,-1,-1,206,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,20,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36,36,36,92,92,92,36,36,36,36,36,19},
                {19,19,207,-1,-1,-1,-1,-1,19,19,20,-1,-1,-1,-1,-1,36,-1,-1,-1,25,-1,-1,-1,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,19,20,20,-1,-1,-1,-1,-1,-1,26,26,-1,-1,-1,-1,36,19,19,19,19,19,19,19,19,19,19,19,19},
                {19,-1,19,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,19,92,92,92,92,92,92,92,19,-1,-1,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,-1,-1,-1,-1,19},
                {19,-1,-1,19,223,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,19,90,90,90,90,90,90,90,19,-1,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36,19,19,19,19,19,19,19,92,92,92,92,92,19},
                {19,-1,-1,-1,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,20,20,20,-1,-1,205,-1,-1,-1,20,19,20,-1,26,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,90,90,90,90,90,19},
                {19,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19,19,19,19,19,19,20,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,26,-1,-1,-1,-1,19,19,19,19,19,19,19,90,90,90,90,19},
                {19,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,26,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,19,19,19,90,90,90,19},
                {19,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,35,35,35,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,19,19,19,90,90,19},
                {19,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,19,19,19,90,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,35,35,20,20,20,35,35,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,32,-1,-1,-1,226,-1,-1,-1,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,19,19,19,19,19,19,19,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,32,19,-1,-1,-1,27,-1,-1,-1,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,36,36,36,36,36,-1,-1,-1,36,36,36,36,36,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,32,19,19,-1,-1,-1,-1,-1,-1,-1,19,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,36,36,36,19,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,32,19,19,19,92,92,92,92,92,92,92,19,19,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19,36,36,36,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,19},
                {19,-1,-1,-1,-1,-1,-1,-1,-1,29,32,19,19,19,19,90,90,90,90,90,90,90,19,19,19,19,30,31,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,-1,29,32,19,19,19,19,19,90,90,90,90,90,90,90,19,19,19,19,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,-1,-1,-1,-1,-1,-1,29,32,19,19,19,19,19,19,90,90,90,90,90,90,90,19,19,19,19,19,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,128,-1,-1,-1,-1,29,32,19,19,19,19,19,19,19,90,90,90,90,90,90,90,19,19,19,19,19,19,19,30,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,19},
                {19,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,19},
            };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 70, 70, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 235,4780);
        //addObject(new Enemy(), 1170, 410);
        // spawnpoint (235, 4780);
        // spawnpoint 1 (3381,3803);
        //addObject();

        // Force act zodat de camera op de juist plek staat.
        camera.act();
        hero.act();

        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
        prepare();
    }

    @Override
    public void act() {
        ce.update();
    }
    
    private void prepare()
    {
        Checkpoint checkpoint = new Checkpoint();
        addObject(checkpoint,3381,3803);

        Checkpoint checkpoint2 = new Checkpoint();
        addObject(checkpoint2, 3331,3803);

        checkpoint.setLocation(3381,3803);
        Checkpoint checkpoint3 = new Checkpoint();
        addObject(checkpoint3,310,693);
        Door1 door1 = new Door1();
        addObject(door1,311,527);
        removeObject(door1);
        removeObject(checkpoint3);
        removeObject(checkpoint);
        NextDoors nextDoors = new NextDoors();
        addObject(nextDoors,365,692);
        removeObject(nextDoors);
    }
}
