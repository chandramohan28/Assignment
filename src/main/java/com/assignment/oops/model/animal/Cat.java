package com.assignment.oops.model.animal;

import com.assignment.oops.model.Animal;
import com.assignment.oops.strategy.sing.CatSound;
import lombok.Data;

@Data
public class Cat extends Animal {

    public Cat() {
        this.singable = new CatSound();
    }
}
