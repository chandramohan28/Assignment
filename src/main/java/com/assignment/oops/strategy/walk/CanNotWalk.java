package com.assignment.oops.strategy.walk;

import com.assignment.oops.strategy.Walkable;

public class CanNotWalk implements Walkable {

    @Override
    public String walk() {
        return "Can not walk";
    }
}
