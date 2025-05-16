package duck.type;

import duck.Duck;
import duck.goals.impl.FlyNoWay;
import duck.goals.impl.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {

    }
}
