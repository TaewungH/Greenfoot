import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test extends World
{
    public static int Puntos = 0;
    /**
     * Constructor for objects of class Test.
     * 
     */
    public Test()
    {    
        super(800, 600, 1);
        Game();
    }
    private void Game()
    {
        addObject(new Juego(),400,300);
    }
    public void act()
    {
        showText("Puntos: " + Puntos, 400,100);
    }
}
