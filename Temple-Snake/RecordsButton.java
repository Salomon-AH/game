import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class RecordsButton extends Botton
{
    public GreenfootSound recordsButtonSound = new GreenfootSound("SWAV_2.wav");
    
    public void clicked(){
            Greenfoot.setWorld(new RecordsWorld());
            
            recordsButtonSound.setVolume(50);
            recordsButtonSound.play();
            MyWorld.menuMusic.stop();
    }
}
