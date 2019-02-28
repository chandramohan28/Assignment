package com.assignment.oops.model.bird;

import com.assignment.oops.model.Bird;
import com.assignment.oops.strategy.sing.DuckSound;
import com.assignment.oops.strategy.swim.CanSwim;
import lombok.Data;

@Data
public class Duck extends Bird {

    public Duck() {
        this.singable = new DuckSound();
        this.swimmable = new CanSwim();
    }
}
