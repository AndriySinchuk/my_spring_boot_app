package com.hello.world.cat;

import com.google.common.collect.ImmutableList;

public interface CatInterface {

    ImmutableList<Cat> allCats();

    Cat getCatId(Integer id);

    Cat addCat(Cat cat);

    Cat updateCat(Cat cat);

    void deleteCatById(Integer id);

}
