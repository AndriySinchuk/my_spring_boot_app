package com.hello.world.cat;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CatInterface {

    public List<Cat> allCats();

    public Cat getCat(Integer catNumber);

    public Cat addCat(Cat cat);

    public Cat updateCat(Cat cat);

    public void deleteCat(Integer catNum);

}
