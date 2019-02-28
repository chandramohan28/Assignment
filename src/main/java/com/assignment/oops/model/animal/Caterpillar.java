package com.assignment.oops.model.animal;

import com.assignment.oops.model.Animal;
import com.assignment.oops.strategy.fly.CanNotFly;
import com.assignment.oops.strategy.walk.CrawlWalk;
import lombok.Data;

@Data
public class Caterpillar extends Animal {

    public Caterpillar() {
        this.flyable = new CanNotFly();
        this.walkable = new CrawlWalk();
    }
}
