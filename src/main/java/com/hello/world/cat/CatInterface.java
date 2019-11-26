package com.hello.world.cat;

import com.google.common.collect.ImmutableList;

import java.util.List;

public interface CatInterface {

    ImmutableList<Cat> allCats();

    Cat getCatId(int id);

    Cat addCat(Cat cat);

    Cat updateCat(Cat cat);

    void deleteCatById(int id);

    List<Cat> filterCatByName(String param);

}
