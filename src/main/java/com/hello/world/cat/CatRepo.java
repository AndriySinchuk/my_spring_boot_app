package com.hello.world.cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatRepo implements CatInterface {

    private static Map<Integer, Cat> cats = new HashMap<Integer, Cat>();

    @Override
    public List<Cat> allCats() {
        return new ArrayList<Cat>(cats.values());
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
