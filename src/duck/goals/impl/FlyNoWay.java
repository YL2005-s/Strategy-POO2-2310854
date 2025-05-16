package duck.goals.impl;

import duck.goals.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I CAN NOT fly.");
    }
}
