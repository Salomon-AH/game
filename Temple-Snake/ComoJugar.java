import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ComoJugar extends Botton
{
    public static GreenfootSound howToPlayButton = new GreenfootSound("SWAV_2.wav");
    
    public void clicked(){
            Greenfoot.setWorld(new ComoJugarWorld());
            
            howToPlayButton.setVolume(50);
            howToPlayButton.play();
    }
}
