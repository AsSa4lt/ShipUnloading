package com.st1tchqwerty;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String args[]){
        ExecutorService port= Executors.newFixedThreadPool(2);
        port.execute(new Ship("ship1"));
        port.execute(new Ship("ship2"));
        port.execute(new Ship("ship3"));

    }
}
