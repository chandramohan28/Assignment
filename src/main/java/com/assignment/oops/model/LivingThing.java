package com.assignment.oops.model;

import com.assignment.oops.strategy.Flyable;
import com.assignment.oops.strategy.Singable;
import com.assignment.oops.strategy.Swimmable;
import com.assignment.oops.strategy.Walkable;
import lombok.Data;

@Data
public abstract class LivingThing {

    protected Walkable walkable;
    protected Flyable flyable;
    protected Singable singable;
    protected Swimmable swimmable;

    public String walk() {
        return this.walkable.walk();
    }

    public String fly() {
        return this.flyable.fly();
    }

    public String sing() {
        return this.singable.sing();
    }

    public String swim() {
        return this.swimmable.swim();
    }
}
