package com.assignment.oops;

import com.assignment.oops.model.bird.Rooster;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoosterTest {

    Rooster rooster;

    @Before
    public void setUp() {
        this.rooster = new Rooster();
    }

    @Test
    public void can_Not_Fly_When_Call_Fly() {
        assertThat(rooster.fly()).isEqualTo("Can not fly");
    }

    @Test
    public void should_Say_cock_a_doodle_ooo_When_Sing() {
        assertThat(rooster.sing()).isEqualTo("Cock-a-doodle-doo");
    }
}
