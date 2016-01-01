package simuduck;

import model.ModelDuck;
import model.Duck;
import model.MallardDuck;
import fly.FlyRocketPowered;

// @author Anpix

public class SimUDuck {

    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }
}
