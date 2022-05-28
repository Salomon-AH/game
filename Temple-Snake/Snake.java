import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Snake extends Actor
{
    private static final int OFFSET = 10;
    private static final int MAX_COUNTER_MOVEMENT = 4;
    
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;
    
    private int counterMovement;
    private int offsetX = 0;
    private int offsetY = 0;
    private int direction;
    private int score;
    private Hud hud;
    
    public Snake(Hud hud){
        this.hud = hud;
    }
    
    public void act()
    {
        moveSnake();
        checkColissions();
    }
    
    private void checkColissions(){
        Item item = (Item)getOneIntersectingObject(Item.class);
        if(item != null){
            getWorld().removeObject(item);
            score += item.getScore();
            hud.setScore(score);
            if(getWorld().getObjects(Rana.class).isEmpty()){
                offsetX = 0;
                offsetY = 0;
                getWorld().showText("You Win", 300, 200);
                
                Level2Button level2 = new Level2Button();
                getWorld().addObject(level2,544,375);
            }
            
            if(getWorld().getObjects(Bola.class).isEmpty()){
                offsetX = 0;
                offsetY = 0;
                getWorld().showText("You Win", 300, 200);
                
                Level3Button level = new Level3Button();
                getWorld().addObject(level,544,375);
            }
        }
    }
    
    private void moveSnake(){
        counterMovement++;
        if(counterMovement < MAX_COUNTER_MOVEMENT){
            return;
        }
        
        int currentX = getX();
        int currentY = getY();
        counterMovement = 0;
        handleDirection();
        
        Actor pared = getWallOnTheWay();
        if(pared == null){
            setLocation(currentX + offsetX, currentY + offsetY);
        }
    }
    
    private Pared getWallOnTheWay(){
        switch(direction){
            case UP:
                return (Pared)getOneObjectAtOffset(0, -30, Pared.class);
            case DOWN:
                return (Pared)getOneObjectAtOffset(0, 30, Pared.class);
            case RIGHT:
                return (Pared)getOneObjectAtOffset(30, 0, Pared.class);
            case LEFT:
                return (Pared)getOneObjectAtOffset(-30, 0, Pared.class);
        }
        return null;
    }
    
    private void handleDirection(){
        if(Greenfoot.isKeyDown("UP")){
            offsetX = 0;
            offsetY = -OFFSET;
            direction = UP;
        }else if(Greenfoot.isKeyDown("DOWN")){
            offsetX = 0;
            offsetY = OFFSET;
            direction = DOWN;
        }else if(Greenfoot.isKeyDown("RIGHT")){
            offsetY = 0;
            offsetX = OFFSET;
            direction = RIGHT;
        }else if(Greenfoot.isKeyDown("LEFT")){
            offsetY = 0;
            offsetX = -OFFSET;
            direction = LEFT;
        }
    }
}
