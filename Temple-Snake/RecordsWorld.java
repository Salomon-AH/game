import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;

public class RecordsWorld extends World
{
    public static GreenfootSound recordsMusic = new GreenfootSound("02 - Courtroom Lobby _New Prelude.mp3");
    public static int finalScore;
    public static int finalScore2;
    public static int finalScore3;
    
    public RecordsWorld()
    {    
        super(1044, 583, 1);
        this.showText("RECORDS", 522,50);
        
        Menu menu = new Menu();
        addObject(menu,522,525);
        
        this.showText("1. " + finalScore, 522, 150);
        this.showText("2. " + finalScore2, 522, 250);
        this.showText("3. " + finalScore3, 522, 350);
        
        recordsMusic.setVolume(12);
        recordsMusic.playLoop();
    }
}

