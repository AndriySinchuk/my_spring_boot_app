package com.hello.world.cat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat {
    private String catName;
    private String catColor;
    private String catAge;

    public Cat (String catName, String catColor, String catAge){
        this.catName = catName;
        this.catColor = catColor;
        this.catAge = catAge;
    }
}
