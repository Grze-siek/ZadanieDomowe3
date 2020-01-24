package Telewizor;

public class Televisor {
    boolean turnedOn = false;

    void turnOn()
    {
       turnedOn = true;
    }

    void turnOff()
    {
        turnedOn = false;
    }
    void showStatus()
    {
        System.out.println("Czy telewizor jest właczony? " + turnedOn);
    }
}
