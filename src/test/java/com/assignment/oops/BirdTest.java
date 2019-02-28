package com.assignment.oops;

import com.assignment.oops.model.Bird;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BirdTest {

    Bird bird;

    @Before
    public void setUp() {
        this.bird = new Bird();
    }

    @Test
    public void should_Walk_When_Call_Walk() {
        assertThat(bird.walk()).isEqualTo("I am walking");
    }

    @Test
    public void should_Fly_When_Call_Fly() {
        assertThat(bird.fly()).isEqualTo("I am flying");
    }

    @Test
    public void should_Sing_When_Call_Sing() {
        assertThat(bird.sing()).isEqualTo("I am singing");
    }

}
