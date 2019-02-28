package com.assignment.oops.model.bird;

import com.assignment.oops.model.Bird;
import com.assignment.oops.strategy.sing.RoosterSound;
import lombok.Data;

@Data
public class Rooster extends Bird {

    Chicken chicken;

    public Rooster() {
        this.singable = new RoosterSound();
        this.chicken = new Chicken();
    }

    @Override
    public String fly() {
        return this.chicken.fly();
    }
}
