package com.assignment.oops;

import com.assignment.oops.model.fish.Dolphin;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


public class DolphinTest {

    Dolphin dolphin;

    @Before
    public void setUp() {
        this.dolphin = new Dolphin();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        Assertions.assertThat(dolphin.walk()).isEqualTo("Can not walk");
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        Assertions.assertThat(dolphin.sing()).isEqualTo("Can not sing");
    }

    @Test
    public void should_Return_Great_swimmers_When_Call_Swim() {
        Assertions.assertThat(dolphin.swim()).isEqualTo("Great swimmers");
    }
}


