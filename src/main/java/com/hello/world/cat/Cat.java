package com.hello.world.cat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat {

    @JsonProperty("cat_number")
    private Integer catNumber;
    @JsonProperty("cat_name")
    private String catName;
    @JsonProperty("cat_color")
    private String catColor;
    @JsonProperty("cat_age")
    private Integer catAge;

}
