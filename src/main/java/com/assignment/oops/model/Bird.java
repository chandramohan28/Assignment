package com.assignment.oops.model;

import com.assignment.oops.strategy.fly.CanFly;
import com.assignment.oops.strategy.sing.CanSing;
import com.assignment.oops.strategy.walk.CanWalk;
import lombok.Data;

@Data
public class Bird extends LivingThing {

    public Bird() {
        this.walkable = new CanWalk();
        this.flyable = new CanFly();
        this.singable = new CanSing();
    }
}