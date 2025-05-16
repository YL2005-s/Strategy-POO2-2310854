package duck.goals.impl;

import duck.goals.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("\uD83E\uDD10");
    }
}
