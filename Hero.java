
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    int x = 200;
    int y = 4780;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        checkpoint ();
        
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
        for (Actor enemy : getIntersectingObjects(TileLava1.class)) {
            if (enemy != null) {
                setLocation (x, y);
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(TileSpikes1.class)) {
            if (enemy != null) {
                setLocation (x, y);
                break;
            }
        }
        /*for (Actor liquidWater : getIntersectingObjects(TileExtended.class)) {
            TileExtended tile = (TileExtended) liquidWater;
            if (tile != null && tile.type == "water") {
                Greenfoot.setWorld(new Gameover(level));
                break;
            }
        }
        */
    }
     public void jumpFix() {
        {

            if (Greenfoot.isKeyDown("up") && onGround() == true || (Greenfoot.isKeyDown("up"))) {
                velocityY = -15;
            }
        }
    }
    public void checkpoint()
    {
    {
            if (isTouching(Checkpoint.class)) {
                x=getX();
                y=getY();
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
        if (Greenfoot.isKeyDown("up") && (isTouching(Tile.class) && (velocityY <= 0)))
        {
                velocityY = -14;
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
