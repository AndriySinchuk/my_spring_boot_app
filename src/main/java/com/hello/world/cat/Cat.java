package com.hello.world.cat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat {
    @JsonProperty("cat_number")
    private Integer catNumber;
    @JsonProperty("cat_name")
    private String catName;
    @JsonProperty("cat_color")
    private String catColor;
    @JsonProperty("cat_age")
    private Integer catAge;

    public Cat(Integer catNumber, String catName, String catColor, Integer catAge) {
        this.catNumber = catNumber;
        this.catName = catName;
        this.catColor = catColor;
        this.catAge = catAge;
    }
}
