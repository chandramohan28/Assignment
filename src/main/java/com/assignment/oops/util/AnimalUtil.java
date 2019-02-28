package com.assignment.oops.util;


import com.assignment.oops.model.LivingThing;
import com.assignment.oops.strategy.Flyable;
import com.assignment.oops.strategy.Singable;
import com.assignment.oops.strategy.Swimmable;
import com.assignment.oops.strategy.Walkable;
import com.assignment.oops.strategy.fly.CanFly;
import com.assignment.oops.strategy.sing.CanSing;
import com.assignment.oops.strategy.swim.CanSwim;
import com.assignment.oops.strategy.walk.CanWalk;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AnimalUtil {

    public long walkableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Walkable> livingThingToWalkable = LivingThing::getWalkable;
        return getCount(livingThings, livingThingToWalkable, walkable -> walkable instanceof CanWalk);
    }

    public long flyableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Flyable> livingThingToFlyable = LivingThing::getFlyable;
        return getCount(livingThings, livingThingToFlyable, flyable -> flyable instanceof CanFly);
    }

    public long singableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Singable> livingThingToSingable = LivingThing::getSingable;
        return getCount(livingThings, livingThingToSingable, singable -> singable instanceof CanSing);
    }

    public long swimmableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Swimmable> livingThingToSwimmable = LivingThing::getSwimmable;
        return getCount(livingThings, livingThingToSwimmable, swimmable -> swimmable instanceof CanSwim);
    }

    private long getCount(List<LivingThing> livingThings, Function function, Predicate predicate) {
        return Optional.ofNullable(livingThings).map(Collection::parallelStream).orElseGet(Stream::empty)
                .map(function)
                .filter(predicate)
                .count();
    }
}
