package com.assignment.oops;

import com.assignment.oops.model.fish.Clownfish;
import com.assignment.oops.util.Color;
import com.assignment.oops.util.Size;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ClownfishTest {

    Clownfish clownfish;

    @Before
    public void setUp() {
        this.clownfish = new Clownfish();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        Assertions.assertThat(clownfish.walk()).isEqualTo("Can not walk");
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        Assertions.assertThat(clownfish.sing()).isEqualTo("Can not sing");
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        Assertions.assertThat(clownfish.swim()).isEqualTo("I am swimming");
    }

    @Test
    public void should_Return_Small_When_Call_Size() {
        Assertions.assertThat(clownfish.size()).isEqualTo(Size.SMALL);
    }

    @Test
    public void should_Return_Orange_When_Call_Color() {
        Assertions.assertThat(clownfish.color()).isEqualTo(Color.ORANGE);
    }
}
