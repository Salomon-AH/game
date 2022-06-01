import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Guardia extends Actor
{
    private int offsetX = 0;
    private int offsetY = 0;
    
    public void act()
    {
        Snake snake = (Snake)getOneIntersectingObject(Snake.class);
        getWorld().removeObject(snake);
        move(1);
        
        if(getX() == 975 || getX() == 55){
            turn(180);
        }
        
        if(getWorld().getObjects(Snake.class).isEmpty()){
            offsetX = 0;
            offsetY = 0;
            getWorld().showText("YOU LOSE", 525, 200);
            Menu menu = new Menu();
            getWorld().addObject(menu,525,375);
        }
    }
}
