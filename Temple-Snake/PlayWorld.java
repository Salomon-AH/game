import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PlayWorld extends World
{
    private static final int WIDTH_WALL = 50;
    private static final int HEIGHT_WALL = 50;
    
    public PlayWorld()
    {    
        super(1044, 583, 1);  
        this.showText("PlayWorld", 150,150);
        prepare();
    }
    
    private void prepare(){
        Pared pared = new Pared();
        
        for(int x = 25; x <= 1000; x+= WIDTH_WALL){
            pared = new Pared();
            addObject(pared, x, 20);
            pared = new Pared();
            addObject(pared, x, 550);
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
        
        Rana rana = new Rana();
        addObject(rana, 200, 300);
        
        Hud hud = new Hud();
        addObject(hud, 0, 0);
        
        Snake snake = new Snake(hud);
        addObject(snake, 70, 65);
        
        Bola bola = new Bola();
        addObject(bola,0,0);
        
        //Greenfoot.playSound("402 Undersea Ruins.mp3");
    }
    
    private Pared addPared(int x, int y){
        Pared pared = new Pared();
        
        addObject(pared,x,y);
        return pared;
    }
}
