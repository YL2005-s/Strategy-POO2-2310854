package duck.type;

import duck.Duck;
import duck.goals.impl.FlyNoWay;
import duck.goals.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {

    }
}
