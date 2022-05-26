import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hud extends Actor
{
    private int score;
    
    public void act()
    {
        refresh();
    }
    
    public void refresh(){
        getWorld().showText("Score: " + score, 400, 30);
    }
    
    public void setScore(int score){
        this.score = score;
    }
}
