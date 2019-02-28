package com.assignment.oops.model.animal;

import com.assignment.oops.strategy.fly.CanFly;
import com.assignment.oops.strategy.sing.CanNotSing;
import lombok.Data;

@Data
public class Butterfly extends Caterpillar {

    public Butterfly() {
        this.flyable = new CanFly();
        this.singable = new CanNotSing();
    }
}
