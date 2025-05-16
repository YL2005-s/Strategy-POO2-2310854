package duck.goals.impl;

import duck.goals.DiveBehavior;

public class DiveDeep implements DiveBehavior {

    @Override
    public void dive() {
        System.out.println("I'm diving deep.");
    }
}
