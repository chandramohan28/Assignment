package com.assignment.oops.strategy.swim;

import com.assignment.oops.strategy.Swimmable;

public class CanSwim implements Swimmable {
    @Override
    public String swim() {
        return "I am swimming";
    }
}
