package com.assignment.oops.model.animal;

import com.assignment.oops.model.Animal;
import com.assignment.oops.strategy.sing.CanSing;
import lombok.Data;

@Data
public class Frog extends Animal {

    public Frog() {
        this.singable = new CanSing();
    }

}
