import duck.Duck;
import duck.goals.impl.FlyNoWay;
import duck.goals.impl.FlyWithJetpack;
import duck.type.DecoyDuck;
import duck.type.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyWithJetpack());
        mallard.performFly();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}