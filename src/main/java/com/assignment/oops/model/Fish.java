package com.assignment.oops.model;

import com.assignment.oops.strategy.sing.CanNotSing;
import com.assignment.oops.strategy.swim.CanSwim;
import com.assignment.oops.strategy.walk.CanNotWalk;
import com.assignment.oops.util.Color;
import com.assignment.oops.util.Size;
import lombok.Data;

@Data
public class Fish extends LivingThing {

    protected Size size;
    protected Color color;

    public Fish() {
        this.swimmable = new CanSwim();
        this.walkable = new CanNotWalk();
        this.singable = new CanNotSing();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}
