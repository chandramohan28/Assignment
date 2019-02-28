package com.assignment.oops;

import com.assignment.oops.model.animal.Butterfly;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ButterflyTest {

    Butterfly butterfly;

    @Before
    public void setUp() {
        this.butterfly = new Butterfly();
    }

    @Test
    public void should_Fly_When_Call_Fly() {
        assertThat(butterfly.fly()).isEqualTo("I am flying");
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        butterfly.sing();
        assertThat(butterfly.sing()).isEqualTo("Can not sing");
    }
}
