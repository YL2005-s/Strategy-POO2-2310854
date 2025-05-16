package duck.goals.impl;

import duck.goals.DiveBehavior;

public class DiveNoWay implements DiveBehavior {

    @Override
    public void dive() {
        System.out.println("I CAN NOT dive.");
    }
}
