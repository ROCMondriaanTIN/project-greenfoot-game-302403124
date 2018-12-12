
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private double jumpHeight;
    private double playerOneJumpHeight = -14.5;   
    private double right;
    private double playerTreeAcc = 4;
    private double playerOneAcc = 5;
    private double left;
    private double playerOneDrag = -5;
    private double playerTreeDrag = -4;
    private GreenfootImage player1 = new GreenfootImage("p1.png");
    boolean inAir=true;
    int x = 200;
    int y = 4780;
    public Hero() {
        super();
        gravity = 11.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        jumpHeight = playerOneJumpHeight;
        right = playerOneAcc;
        left = playerOneDrag;
    }
    @Override
    public void act() {
        handleInput();
        
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        for (Actor weight : getIntersectingObjects(TileSpikes1.class)) {
            if (weight != null) {



                Greenfoot.setWorld(new GameOver());
                setImage(player1);
                jumpHeight = playerOneJumpHeight;
                right = playerOneAcc;
                left = playerOneDrag;

                return;



            }
        }
        for (Actor enemy : getIntersectingObjects(TileLava1.class)) {
            if (enemy != null) {

                Greenfoot.setWorld(new GameOver());
                setImage(player1);
                jumpHeight = playerOneJumpHeight;
                right = playerOneAcc;
                left = playerOneDrag;
                return;

            }
        }
        for (Actor enemy : getIntersectingObjects(NextDoors.class)) {
            if (enemy != null) {
                Greenfoot.setWorld(new Lvl2());
                break;
            }
        }
    }
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getHeight()/2,Tile.class);
        Tile tile = (Tile) under;
        return tile != null && tile.isSolid == true;
    }
    public void handleInput() {
        {
        if (Greenfoot.isKeyDown("up")&& velocityY == 0 || (Greenfoot.isKeyDown("w") && isTouching(Rope.class))) {
            velocityY = jumpHeight;
        }
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -9;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 9;
        }
    }
    }    
    public void Checkpoint ()
        {
            setLocation (200, 4780);
        }
    public int getWidth() {
        return getImage().getWidth();
    }
    public int getHeight() {
        return getImage().getHeight();
    }
}