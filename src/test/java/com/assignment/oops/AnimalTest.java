package com.assignment.oops;

import com.assignment.oops.model.Animal;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalTest {

    @Test
    public void testWalk() {
        Animal animal = new Animal();
        String result = animal.walk();
        assertThat(result).isEqualTo("I am walking");
    }
}
