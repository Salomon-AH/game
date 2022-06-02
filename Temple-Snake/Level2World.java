import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2World extends Level
{
    public static GreenfootSound level2Music = new GreenfootSound("28 Sacred Somnom Woods.mp3");
        
    public Level2World()
    {     
        this.showText("Level 2", 150, 20);
        generateLevel();
        prepare();
    }
    
    private void prepare(){
        addPared(470,125);
        
        addPared(120,73);
        addPared(220,73);
        addPared(320,73);
        addPared(520,73);
        addPared(620,73);
        addPared(720,73);
        addPared(820,73);
        addPared(920,73);
        
        addPared(70,290);
        addPared(270,290);
        addPared(470,290);
        addPared(570,290);
        addPared(670,290);
        addPared(870,290);
        
        addPared(420, 179);
        addPared(420, 236);
        addPared(520, 179);
        addPared(520, 236);
        
        for(int x = 120; x <= 320; x+=100){
            addPared(x,396);
            addPared(x,344);
        }
        
        for(int x = 520; x <= 920; x+=100){
            addPared(x,396);
            addPared(x,344);
        }
        
        addPared(120,505);
        addPared(220,505);
        addPared(320,505);
        addPared(420,505);
        addPared(820,505);
        addPared(920,505);
        
        addItems(170, 505);
        addItems(470, 73);
        addItems(570, 207);
        addItems(970, 396);
        
        
        Hud hud = new Hud();
        addObject(hud, 0, 0);
        
        extraPreparations();
        
        Snake snake = new Snake(hud);
        addObject(snake, 70, 70);
        
        Guardia guardia = new Guardia();
        addObject(guardia, 80, 370);
        
        Guardia guardia2 = new Guardia();
        addObject(guardia2, 80, 207);
        
        level2Music.setVolume(10);
        level2Music.play();
    }
    
    private Rana addItems(int x, int y){
        Rana rana = new Rana();
        
        addObject(rana, x, y);
        return rana;
    }
    
    private void extraPreparations(){
        addEnemy(170,95);
        addEnemy(270,95);
        addEnemy(570,95);
        addEnemy(670,95);
        addEnemy(770,95);
        addEnemy(870,95);
        addEnemy(970,95);
        
        addEnemy(70, 480);
        addEnemy(270, 480);
        addEnemy(370, 480);
        addEnemy(870, 480);
        addEnemy(970, 480);
        
        addEnemy(470, 207);
        addEnemy(670, 370);
        addEnemy(870, 370);
        addEnemy(570, 370);
        addEnemy(270, 370);
        addEnemy(70, 370);
        
        Raton raton = new Raton();
        addObject(raton, 0, 0);
        
        Oveja oveja = new Oveja();
        addObject(oveja, 0, 0);
        
        addPared(20, 0);
    }
}

