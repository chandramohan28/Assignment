package com.assignment.oops.model.animal;

import com.assignment.oops.model.Animal;
import com.assignment.oops.strategy.sing.DogSound;
import lombok.Data;

@Data
public class Dog extends Animal {

    public Dog() {
        this.singable = new DogSound();
    }
}
