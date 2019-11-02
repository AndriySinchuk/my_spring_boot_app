package com.hello.world.cat;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public CatRepo catRepoConfiguration(){
        return new CatRepo();
    }

}
