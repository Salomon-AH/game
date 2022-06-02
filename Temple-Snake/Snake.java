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
    private GameRecord record = new GameRecord();
    private RecordsManager manager = new RecordsManager();
    private SimpleTimer timer = new SimpleTimer();
    
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
        Guardia guardia = (Guardia)getOneIntersectingObject(Guardia.class);
        GuardiaY guardiaY = (GuardiaY)getOneIntersectingObject(GuardiaY.class);
        String name;
        int time;
        
        if(item != null){
            getWorld().removeObject(item);
            score += item.getScore();
            hud.setScore(score);
            
            if(getWorld().getObjects(Raton.class).isEmpty()){
                offsetX = 0;
                offsetY = 0;
                getWorld().showText("NEXT LEVEL", 525, 200);
                
                Level2Button level2 = new Level2Button();
                getWorld().addObject(level2,525,375);
            }
            
            if(getWorld().getObjects(Rana.class).isEmpty()){
                offsetX = 0;
                offsetY = 0;
                getWorld().showText("NEXT LEVEL", 525, 200);
                
                Level3Button level = new Level3Button();
                getWorld().addObject(level,525,375);
            }
            
            if(getWorld().getObjects(Oveja.class).isEmpty()){
                offsetX = 0;
                offsetY = 0;
                getWorld().showText("YOU WIN", 525, 200);
                
                name = Greenfoot.ask("Dime tu Nombre: ");
                record.setPlayerName(name);
                time = timer.millisElapsed();
                record.setScore(time);
                manager.save(record);
                
                Greenfoot.setWorld(new MyWorld());
            }
        }
        
        if(guardia != null){
            getWorld().removeObject(guardia);
            offsetX = 0;
            offsetY = 0;
            getWorld().removeObject(guardia);
            getWorld().showText("YOU LOSE", 525, 200);
            Level3World.level3Music.stop();
            Level2World.level2Music.stop();
            PlayWorld.level1Music.stop();
            
            name = Greenfoot.ask("Dime tu Nombre: ");
            record.setPlayerName(name);
            time = timer.millisElapsed();
            record.setScore(time);
            manager.save(record);
            
            Greenfoot.setWorld(new MyWorld());
        }
        
        if(guardiaY != null){
            getWorld().removeObject(guardiaY);
            offsetX = 0;
            offsetY = 0;
            getWorld().showText("YOU LOSE", 525, 200);
            Level3World.level3Music.stop();
            Level2World.level2Music.stop();
            PlayWorld.level1Music.stop();
            
            name = Greenfoot.ask("Dime tu Nombre: ");
            record.setPlayerName(name);
            time = timer.millisElapsed();
            record.setScore(time);
            manager.save(record);
            Greenfoot.setWorld(new MyWorld());
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
