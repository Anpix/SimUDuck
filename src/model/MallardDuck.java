package model;

// @author Anpix

import quack.Quack;
import fly.FlyWithWings;


public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display(){
        System.out.println("Mallard duck");
    }
}
