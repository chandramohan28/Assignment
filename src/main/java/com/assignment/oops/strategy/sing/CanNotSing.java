package com.assignment.oops.strategy.sing;

import com.assignment.oops.strategy.Singable;

public class CanNotSing implements Singable {
    @Override
    public String sing() {
        return "Can not sing";
    }
}
