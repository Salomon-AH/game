import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Menu extends Botton
{
    public void clicked(){
            Greenfoot.setWorld(new MyWorld());
            
            Greenfoot.playSound("SWAV_2.wav");
        }
}
