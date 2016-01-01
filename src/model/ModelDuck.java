package model;

// @author Anpix

import quack.Quack;
import fly.FlyNoWay;


public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    public void display(){
        System.out.println("Modelo de pato");
    }
}
