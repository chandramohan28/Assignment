package com.assignment.oops;

import com.assignment.oops.model.Fish;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FishTest {

    Fish fish;

    @Before
    public void setUp() {
        fish = new Fish();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        Assertions.assertThat(fish.walk()).isEqualTo("Can not walk");
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        Assertions.assertThat(fish.sing()).isEqualTo("Can not sing");
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        Assertions.assertThat(fish.swim()).isEqualTo("I am swimming");
    }
}
