import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ComoJugarWorld extends World
{

    
    public ComoJugarWorld()
    {    
        super(1044, 583, 1); 
        this.showText("COMO JUGAR", 522,50);
        instructions();
    }
    
    private void instructions(){
        Rana rana = new Rana();
        addObject(rana, 100, 100);
        this.showText("Esta rana es un objeto y tiene un valor de 10 puntos", 400,100);
        
        Raton raton = new Raton();
        addObject(raton,100,170);
        this.showText("Este raton es un objeto y tiene un valor de 20 puntos",400,170);
        
        Oveja oveja = new Oveja();
        addObject(oveja,100,240);
        this.showText("Esta oveja es un objeto y tiene un valor de 30 puntos",400,240);
        
        this.showText("Para poder mover a la serpiente tienes que utilizar las flechas del teclado:",400,315);
        Izquierda izquierda = new Izquierda();
        addObject(izquierda,100,355);
        this.showText("Izquierda",200,355);
        
        Derecha derecha = new Derecha();
        addObject(derecha,100,415);
        this.showText("Derecha",200,415);
        
        Arriba arriba = new Arriba();
        addObject(arriba,100,475);
        this.showText("Arriba",200,475);
        
        Abajo abajo = new Abajo();
        addObject(abajo,100,535);
        this.showText("Abajo",200,535);
        
        Menu menu = new Menu();
        addObject(menu,522,525);
        
        Greenfoot.playSound("018. Pick A Level, Any Level _ Dyna Blade Map Screen.mp3");
    }
}
