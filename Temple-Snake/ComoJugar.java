import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ComoJugar extends Botton
{
     public void clicked(){
            Greenfoot.setWorld(new ComoJugarWorld());
            
            Greenfoot.playSound("SWAV_2.wav");
        }
}
