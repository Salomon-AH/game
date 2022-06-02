import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level3World extends Level
{
    public static GreenfootSound level3Music = new GreenfootSound("40 Dreamy Somnom Labyrinth.mp3");
    
    public Level3World()
    {      
        this.showText("Level 3", 150, 20);
        generateLevel();
        prepare();
    }
    
    private void prepare(){
        for(int x = 170; x <= 870; x+=100){
            if(x == 170 || x == 370 || x == 570 || x == 770){
                addPared(x, 125);
            }
            
            if(x == 270 || x == 470 || x == 670 || x == 870){
                addPared(x, 450);
            }
            
            addPared(x,290);
        }
        
        for(int x = 120; x <= 220; x+=100){
            addPared(x, 179);
            addPared(x, 236);
            addPared(x,396);
            addPared(x,344);
        }
        
        for(int x = 820; x <= 920; x+=100){
            addPared(x, 179);
            addPared(x, 236);
            addPared(x,396);
            addPared(x,344);
        }
        
        for(int x = 320; x <= 720; x+=100){
            addItems(x, 236);
        }
        addItems(870, 236);
        
        addItems(170, 344);
        for(int x = 320; x <= 720; x+=100){
            addItems(x, 344);
        }
        
        Hud hud = new Hud();
        addObject(hud, 0, 0);
        
        extraPreparations();
        
        Snake snake = new Snake(hud);
        addObject(snake, 70, 70);
        
        Guardia guardia = new Guardia();
        addObject(guardia, 80, 370);
        
        Guardia guardia2 = new Guardia();
        addObject(guardia2, 80, 207);
        
        addEnemy(170, 207);
        addEnemy(370, 207);
        addEnemy(570, 207);
        addEnemy(770, 207);
        
        addEnemy(270, 370);
        addEnemy(470, 370);
        addEnemy(670, 370);
        addEnemy(870, 370);
        
        level3Music.setVolume(10);
        level3Music.play();
    }
    
    private Oveja addItems(int x, int y){
        Oveja oveja = new Oveja();
        
        addObject(oveja, x, y);
        return oveja;
    }
    
    private void extraPreparations(){
        Rana rana = new Rana();
        addObject(rana, 0, 0);
        
        Raton raton = new Raton();
        addObject(raton, 0, 0);
        
        addPared(20, 0);
    }
}
