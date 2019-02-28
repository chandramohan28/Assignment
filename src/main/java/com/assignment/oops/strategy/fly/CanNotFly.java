package com.assignment.oops.strategy.fly;

import com.assignment.oops.strategy.Flyable;

public class CanNotFly implements Flyable {
    @Override
    public String fly() {
        return "Can not fly";
    }
}
