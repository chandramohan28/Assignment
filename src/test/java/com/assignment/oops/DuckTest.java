package com.assignment.oops;

import com.assignment.oops.model.bird.Duck;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuckTest {

    Duck duck;

    @Before
    public void setUp() {
        this.duck = new Duck();
    }

    @Test
    public void should_Say_Quack_quack_When_Call_Sing() {
        assertThat(duck.sing()).isEqualTo("Quack, quack");
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        assertThat(duck.swim()).isEqualTo("I am swimming");
    }
}