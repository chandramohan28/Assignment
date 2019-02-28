package com.assignment.oops.strategy.walk;

import com.assignment.oops.strategy.Walkable;

public class CrawlWalk implements Walkable {
    @Override
    public String walk() {
        return "I am crawling";
    }
}
