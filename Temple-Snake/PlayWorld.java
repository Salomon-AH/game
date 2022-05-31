import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PlayWorld extends World
{
    private static final int WIDTH_WALL = 50;
    private static final int HEIGHT_WALL = 50;
    public static GreenfootSound level1Music = new GreenfootSound("402 Undersea Ruins.mp3");
    
    public PlayWorld()
    {    
        super(1044, 583, 1);  
        this.showText("Level 1", 150, 20);
        prepare();
    }
    
    private void prepare(){
        Pared pared = new Pared();
        
        for(int x = 25; x <= 1000; x+= WIDTH_WALL){
            pared = new Pared();
            addObject(pared, x, 20);
            pared = new Pared();
            addObject(pared, x, 560);
        }
        
        for(int y = 0; y <= 1000; y+= WIDTH_WALL){
            pared = new Pared();
            addObject(pared, 20, y);
            pared = new Pared();
            addObject(pared, 1022, y);
        }
        
        for(int x = 120; x <= 920; x+=100){
            addPared(x,290);
            addPared(x,450);
            addPared(x,125);
        }
        
        Raton raton = new Raton();
        addObject(raton, 200, 300);
        
        Hud hud = new Hud();
        addObject(hud, 0, 0);
        
        extraPreparations();
        
        Snake snake = new Snake(hud);
        addObject(snake, 70, 70);
        
        level1Music.setVolume(10);
        level1Music.play();
    }
    
    private Pared addPared(int x, int y){
        Pared pared = new Pared();
        
        addObject(pared,x,y);
        return pared;
    }
    
    private Raton addItems(int x, int y){
        Raton raton = new Raton();
        
        addObject(raton, x, y);
        return raton;
    }
    
    private void extraPreparations(){
        Rana rana = new Rana();
        addObject(rana, 0, 0);
        
        Oveja oveja = new Oveja();
        addObject(oveja, 0, 0);
        
        addPared(20, 0);
    }
}
