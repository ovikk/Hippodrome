package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Ovik on 22.04.2016.
 */
public class Hippodrome
{
    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static Hippodrome game;

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(10);
        }
    }

    public void move() {
        for (Horse i : getHorses()) {
            i.move();
        }
    }

    public void print() {
        for (Horse i : getHorses()) {
            i.print();
            System.out.println();
        }

    }

    public Horse getWinner() {
        Horse acc = new Horse("acc", 0,0);
        for (Horse i : getHorses()) {
            if (acc.getDistance() < i.getDistance()) {
                acc = i;
            }
        }
        return acc;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName()+"!");
    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse h1 = new Horse("LamboJack",3,0);
        Horse h2 = new Horse("Lisa",3,0);
        Horse h3 = new Horse("BOMB",3,0);

        game.getHorses().add(h1);
        game.getHorses().add(h2);
        game.getHorses().add(h3);

        game.run();
        game.printWinner();
    }


}
