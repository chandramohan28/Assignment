package com.assignment.oops.model.bird;

import com.assignment.oops.model.Bird;
import com.assignment.oops.strategy.fly.CanNotFly;
import com.assignment.oops.strategy.sing.ChickenSound;
import lombok.Data;

@Data
public class Chicken extends Bird {

    public Chicken() {
        this.singable = new ChickenSound();
        this.flyable = new CanNotFly();
    }
}
