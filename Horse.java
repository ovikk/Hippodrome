package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Ovik on 22.04.2016.
 */
public class Horse
{
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public String getName()
    {
        return name;
    }

    public double getSpeed()
    {
        return speed;
    }

    public double getDistance()
    {
        return distance;
    }

    public void move() {
        this.distance+=this.speed*Math.random();
    }

    public void print() {
        int dots = (int) Math.round(this.distance);
        for (int i = 0; i < dots; i++)
        {
            System.out.print(".");
        }
        System.out.print(this.name+"\n");
    }
}
