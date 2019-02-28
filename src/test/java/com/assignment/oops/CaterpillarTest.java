package com.assignment.oops;

import com.assignment.oops.model.animal.Caterpillar;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CaterpillarTest {

    Caterpillar caterpillar;

    @Before
    public void setUp() {
        this.caterpillar = new Caterpillar();
    }

    @Test
    public void should_Crawl_When_Call_Walk() {
        assertThat(caterpillar.walk()).isEqualTo("I am crawling");
    }

    @Test
    public void should_Not_Fly_When_Call_Fly() {
        assertThat(caterpillar.fly()).isEqualTo("Can not fly");
    }
}
