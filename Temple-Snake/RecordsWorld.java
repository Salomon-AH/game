import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class RecordsWorld extends World
{

    
    public RecordsWorld()
    {    
        super(1044, 583, 1); 
        this.showText("RecordsWorld", 150,150);
        
        Menu menu = new Menu();
        addObject(menu,522,525);
        
        Greenfoot.playSound("02 - Courtroom Lobby _New Prelude.mp3");
    }
}
