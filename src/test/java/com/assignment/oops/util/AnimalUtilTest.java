package com.assignment.oops.util;

import com.assignment.oops.model.Bird;
import com.assignment.oops.model.Fish;
import com.assignment.oops.model.LivingThing;
import com.assignment.oops.model.animal.Butterfly;
import com.assignment.oops.model.animal.Cat;
import com.assignment.oops.model.animal.Dog;
import com.assignment.oops.model.animal.Frog;
import com.assignment.oops.model.bird.Chicken;
import com.assignment.oops.model.bird.Duck;
import com.assignment.oops.model.bird.Parrot;
import com.assignment.oops.model.bird.Rooster;
import com.assignment.oops.model.fish.Clownfish;
import com.assignment.oops.model.fish.Dolphin;
import com.assignment.oops.model.fish.Shark;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalUtilTest {

    AnimalUtil animalUtil;
    final ThreadLocal<List<LivingThing>> livingThings = new ThreadLocal<>();

    @Before
    public void setUp() {
        this.animalUtil = new AnimalUtil();
        livingThings.set(Arrays.asList(
                new Bird(),  //  Sing, Fly ,Walk
                new Duck(),  //  Sing, Fly ,Walk, Swim
                new Chicken(), // Sing, Fly ,Walk
                new Rooster(), // Sing, Fly ,Walk
                new Parrot(), //Sing, Fly ,Walk
                new Fish(), // Swim
                new Shark(), // Swim
                new Clownfish(), // Swim
                new Dolphin(), // Swim
                new Frog(), // Sing, Walk
                new Dog(), // Sing, Walk
                new Butterfly(), // Fly, Walk
                new Cat()));  // Sing, Walk
    }

    @Test
    public void should_Verify_WalkableCount() {
        long count = this.animalUtil.walkableCount(livingThings.get());
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_FlyableCount() {
        long count = this.animalUtil.flyableCount(livingThings.get());
        assertEquals(5, count);
    }

    @Test
    public void should_Verify_SingableCount() {
        long count = this.animalUtil.singableCount(livingThings.get());
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_SwimmableCount() {
        long count = this.animalUtil.swimmableCount(livingThings.get());
        assertEquals(5, count);
    }

}