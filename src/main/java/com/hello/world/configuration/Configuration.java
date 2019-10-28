package com.hello.world.configuration;

import com.hello.world.cat.Cat;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    private Integer catNumber;
    private String catName;
    private String catColor;
    private Integer catAge;

    @Bean
    public Cat cat() {
        return new Cat(catNumber, catName, catColor, catAge);
    }


}
