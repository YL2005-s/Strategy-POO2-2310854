package duck;

import duck.goals.DiveBehavior;
import duck.goals.FlyBehavior;
import duck.goals.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected DiveBehavior diveBehavior;

    public void swim() {
        System.out.println("\uD83E\uDD86\uD83C\uDF0A");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performDive() {
        diveBehavior.dive();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setDiveBehavior(DiveBehavior db) {
        diveBehavior = db;
    }

}
