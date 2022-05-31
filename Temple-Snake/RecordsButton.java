import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class RecordsButton extends Botton
{
     public void clicked(){
            Greenfoot.setWorld(new RecordsWorld());
            
            Greenfoot.playSound("SWAV_2.wav");
        }
}
