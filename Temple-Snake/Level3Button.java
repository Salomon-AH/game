import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level3Button extends Botton
{
    
    public void clicked(){
            Greenfoot.setWorld(new Level3World());
            
            Greenfoot.playSound("SWAV_2.wav");
        }
}
