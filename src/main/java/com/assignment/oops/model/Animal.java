package com.assignment.oops.model;

import com.assignment.oops.strategy.walk.CanWalk;
import lombok.Data;

@Data
public class Animal extends LivingThing {

    public Animal() {
        this.walkable = new CanWalk();
    }
}
