import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PlayWorld extends Level
{
    public static GreenfootSound level1Music = new GreenfootSound("402 Undersea Ruins.mp3");
    
    public PlayWorld()
    {    
        this.showText("Level 1", 150, 20);
        generateLevel();
        prepare();
    }
    
    private void prepare(){
        for(int x = 120; x <= 920; x+=100){
            addPared(x, 505);
            addPared(x, 179);
            addPared(x, 236);
        }
        
        for(int x = 170; x <= 870; x+=100){
            addPared(x,125);
        }
        
        addPared(120,73);
        
        addItems(230, 70);
        addItems(870, 290);
        
        Hud hud = new Hud();
        addObject(hud, 0, 0);
        
        extraPreparations();
        
        Snake snake = new Snake(hud);
        addObject(snake, 70, 70);
        
        Guardia guardia = new Guardia();
        addObject(guardia, 80, 370);
        
        level1Music.setVolume(10);
        level1Music.play();
    }
    
    private Raton addItems(int x, int y){
        Raton raton = new Raton();
        
        addObject(raton, x, y);
        return raton;
    }
    
    private void extraPreparations(){
        addEnemy(170,95);
        
        for(int x = 170; x <= 870; x+=100){
            addEnemy(x,187);
        }
        
        for(int x = 170; x <= 770; x+=100){
            addEnemy(x,270);
        }
        
        addEnemy(70, 480);
        for(int x = 270; x <= 970; x+=100){
            addEnemy(x,480);
        }
        
        Rana rana = new Rana();
        addObject(rana, 0, 0);
        
        Oveja oveja = new Oveja();
        addObject(oveja, 0, 0);
        
        addPared(20, 0);
    }
}
