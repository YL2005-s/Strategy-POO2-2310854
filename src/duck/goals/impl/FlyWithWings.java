package duck.goals.impl;

import duck.goals.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
