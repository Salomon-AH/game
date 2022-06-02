import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class RecordsWorld extends World
{
    public static GreenfootSound recordsMusic = new GreenfootSound("02 - Courtroom Lobby _New Prelude.mp3");
    private RecordsManager manager = new RecordsManager();
    
    public RecordsWorld()
    {    
        super(1044, 583, 1);
        int y = 150;
        this.showText("RECORDS", 522,50);
        
        Menu menu = new Menu();
        addObject(menu,522,525);
        
        List<GameRecord> records = manager.getRecords();
        
        for(GameRecord element: records){
            this.showText(element.getPlayerName() + " - " + element.getScore() + "ms", 522, y);
            y+=75;
        }
        
        recordsMusic.setVolume(15);
        recordsMusic.playLoop();
    }
}

