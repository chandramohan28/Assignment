package com.assignment.oops;

import com.assignment.oops.model.fish.Shark;
import com.assignment.oops.util.Color;
import com.assignment.oops.util.Size;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SharkTest {

    Shark shark;

    @Before
    public void setUp() {
        shark = new Shark();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        Assertions.assertThat(shark.walk()).isEqualTo("Can not walk");
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        Assertions.assertThat(shark.sing()).isEqualTo("Can not sing");
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        Assertions.assertThat(shark.swim()).isEqualTo("I am swimming");
    }

    @Test
    public void should_Return_Large_When_Call_Size() {
        Assertions.assertThat(shark.size()).isEqualTo(Size.LARGE);
    }

    @Test
    public void should_Return_Grey_When_Call_Color() {
        Assertions.assertThat(shark.color()).isEqualTo(Color.GREY);
    }

}
