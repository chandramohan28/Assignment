package com.assignment.oops;

import com.assignment.oops.model.bird.Chicken;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ChickenTest {

    Chicken chicken;

    @Before
    public void setUp() {
        this.chicken = new Chicken();
    }

    @Test
    public void can_Not_Fly_When_Call_Fly() {
        assertThat(chicken.fly()).isEqualTo("Can not fly");
    }

    @Test
    public void should_Say_Cluck_cluck_When_Call_Sing() {
        assertThat(chicken.sing()).isEqualTo("Cluck, cluck");
    }
}
