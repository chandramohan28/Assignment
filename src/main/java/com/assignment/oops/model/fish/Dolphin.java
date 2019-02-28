package com.assignment.oops.model.fish;

import com.assignment.oops.model.Fish;
import com.assignment.oops.model.LivingThing;
import com.assignment.oops.strategy.swim.GreatSwimmers;
import lombok.Data;

@Data
public class Dolphin extends LivingThing {

    Fish fish;

    public Dolphin() {
        this.swimmable = new GreatSwimmers();
        this.fish = new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
