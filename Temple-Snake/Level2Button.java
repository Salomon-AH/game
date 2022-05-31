import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level2Button extends Botton
{
    public GreenfootSound level2ButtonSound = new GreenfootSound("SWAV_2.wav");
    
    public void clicked(){
            Greenfoot.setWorld(new Level2World());
            
            level2ButtonSound.setVolume(50);
            level2ButtonSound.play();
            PlayWorld.level1Music.stop();
    }
}
