package com.st1tchqwerty;

public class Ship implements Runnable{
    private int box=10;
    private String name;
    public Ship(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Ships are int port " + name);
        int n = 0;
        for (int i = 0; i < box; i++) {
            System.out.println("Left boxes " + (i + 1) + " ship " + name);
            n++;
            try {
                Thread.currentThread().sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
        if (box == n) {
            System.out.println(name + " in empty");
        }
    }
    @Override
    public String toString() {
        return "Barge [boxes = " + box + ", name = " + name + "]";
    }
}
