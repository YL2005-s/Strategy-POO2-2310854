package duck.goals.impl;

import duck.goals.FlyBehavior;

public class FlyWithJetpack implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with a jetpack! 🚀");
    }
}
