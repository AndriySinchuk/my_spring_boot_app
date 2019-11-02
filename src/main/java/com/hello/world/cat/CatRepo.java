package com.hello.world.cat;

import com.google.common.collect.ImmutableList;

import java.util.HashMap;
import java.util.Map;

public class CatRepo implements CatInterface {

    private static Map<Integer, Cat> cats = new HashMap<Integer, Cat>();

    @Override
    public ImmutableList<Cat> allCats() {
        return  ImmutableList.copyOf(cats.values());
    }

    @Override
    public Cat getCatId(Integer id) {
        return cats.get(id);
    }

    @Override
    public Cat addCat(Cat cat) {
        cats.put(cat.getCatNumber(), cat);
        return cat;
    }

    @Override
    public Cat updateCat(Cat cat) {
        cats.put(cat.getCatNumber(), cat);
        return cat;
    }

    @Override
    public void deleteCatById(Integer id) {
        cats.remove(id);
    }
}
