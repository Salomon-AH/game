import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GuardiaY extends Actor
{
    public void act()
    {
        Snake snake = (Snake)getOneIntersectingObject(Snake.class);
        getWorld().removeObject(snake);
        
        if(getWorld().getObjects(Snake.class).isEmpty()){
            getWorld().showText("YOU LOSE", 525, 200);
            Menu menu = new Menu();
            getWorld().addObject(menu,525,375);
        }
    }
}
