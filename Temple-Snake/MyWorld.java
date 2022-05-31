import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(1044, 583, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,542,237);
        ComoJugar comoJugar = new ComoJugar();
        addObject(comoJugar,543,306);
        RecordsButton recordsButton = new RecordsButton();
        addObject(recordsButton,544,375);
        
        //Greenfoot.playSound("L03 Environmental Noises.mp3");
    }
}
