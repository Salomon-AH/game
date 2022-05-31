import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level3Button extends Botton
{
    public GreenfootSound level3ButtonSound = new GreenfootSound("SWAV_2.wav");
    
    public void clicked(){
            Greenfoot.setWorld(new Level3World());
            
            level3ButtonSound.setVolume(50);
            level3ButtonSound.play();
            Level2World.level2Music.stop();
    }
}
