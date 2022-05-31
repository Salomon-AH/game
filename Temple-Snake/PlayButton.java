import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PlayButton extends Botton
{
    public GreenfootSound playButtonSound = new GreenfootSound("SWAV_2.wav");
    
    public void clicked(){
            Greenfoot.setWorld(new PlayWorld());
            
            playButtonSound.setVolume(50);
            playButtonSound.play();
            MyWorld.menuMusic.stop();
    }
}
