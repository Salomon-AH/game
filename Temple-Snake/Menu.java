import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Menu extends Botton
{
    public GreenfootSound menuButton = new GreenfootSound("SWAV_2.wav");
    
    public void clicked(){
            Greenfoot.setWorld(new MyWorld());
            
            menuButton.setVolume(50);
            menuButton.play();
            ComoJugarWorld.howToPlayMusic.stop();
            RecordsWorld.recordsMusic.stop();
            Level3World.level3Music.stop();
    }
}
