package com.hello.world.cat;

import java.util.List;

public interface CatInterface {

    List<Cat> allCats();

    Cat getCat(Integer catNumber);

    Cat addCat(Cat cat);

    Cat updateCat(Cat cat);

    void deleteCat(Integer catNum);

}
