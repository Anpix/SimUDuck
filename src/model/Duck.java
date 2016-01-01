package model;

// @author Anpix

import quack.QuackBehavior;
import fly.FlyBehavior;


public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void quackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
