package com.assignment.oops.strategy.sing;

import com.assignment.oops.strategy.Singable;
import lombok.Data;

@Data
public class CanSing implements Singable {
    public String sing() {
        return "I am singing";
    }
}
