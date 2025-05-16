package duck.type;

import duck.Duck;
import duck.goals.impl.FlyWithWings;
import duck.goals.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
