import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Guardia extends Actor
{   
    public void act()
    {
        move(1);
        
        if(getX() == 975 || getX() == 55){
            turn(180);
        }
    }
}
