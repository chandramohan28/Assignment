package com.assignment.oops;


import com.assignment.oops.model.bird.Parrot;
import com.assignment.oops.strategy.sing.CatSound;
import com.assignment.oops.strategy.sing.DogSound;
import com.assignment.oops.strategy.sing.DuckSound;
import com.assignment.oops.strategy.sing.RoosterSound;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParrotTest {

    Parrot parrot;

    @Before
    public void setUp() {
        parrot = new Parrot();
    }

    @Test
    public void should_Say_Woof_Woof_When_ParrotLivingWithDog() {
        parrot.setSingable(new DogSound());
        assertThat(parrot.sing()).isEqualTo("Woof,woof");
    }

    @Test
    public void should_Say_Meow_When_ParrotLivingWithCat() {
        parrot.setSingable(new CatSound());
        assertThat(parrot.sing()).isEqualTo("Meow");

    }

    @Test
    public void should_Say_Cock_a_doodle_doo_When_ParrotLivingWithRooster() {
        parrot.setSingable(new RoosterSound());
        assertThat(parrot.sing()).isEqualTo("Cock-a-doodle-doo");
    }

    @Test
    public void should_Say_Quack_Quack_When_ParrotLivingWithDuck() {
        parrot.setSingable(new DuckSound());
        assertThat(parrot.sing()).isEqualTo("Quack, quack");

    }

}
