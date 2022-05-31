import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PlayButton extends Botton
{
   
    public void clicked(){
        
            Greenfoot.setWorld(new PlayWorld());
            
            Greenfoot.playSound("SWAV_2.wav");
        }

}
