package com.assignment.oops.model.fish;

import com.assignment.oops.model.Fish;
import com.assignment.oops.util.Color;
import com.assignment.oops.util.Size;
import lombok.Data;

@Data
public class Shark extends Fish {

    public Shark() {
        this.size = Size.LARGE;
        this.color = Color.GREY;
    }
}
