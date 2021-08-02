import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends Actor
{
    GreenfootSound Correct = new GreenfootSound("Correct.wav");
    GreenfootSound Wrong = new GreenfootSound("Wrong.wav");
    GreenfootImage Correcto = new GreenfootImage("Correcto.jpg");
    GreenfootImage Incorrecto = new GreenfootImage("Incorrecto.PNG");
    /**
     * Act - do whatever the Juego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Test Puntaje;
    public void act()
    {
        int a = Greenfoot.getRandomNumber(10);
        int b = Greenfoot.getRandomNumber(10);
        int result = a * b;
        int answer = Integer.parseInt(Greenfoot.ask("Cuanto es " + a + " * " + b + "?"));
        if (result == answer)
        {
            Correct.play();
            Puntaje.Puntos++;
        }
        else
        {
            getWorld().addObject(new Incorrecto(), 400, 300);
            Wrong.play();
            setImage(Incorrecto);
                Greenfoot.stop();
        }
    }
}
