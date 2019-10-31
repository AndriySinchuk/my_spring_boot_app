package com.hello.world.cat;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Qualifier("CatRepo")
public class CatRepo implements CatInterface {

    private static Map<Integer, Cat> cats = new HashMap<Integer, Cat>();

    @Override
    public List<Cat> allCats() {
        return new ArrayList<Cat>(cats.values());
    }

    @Override
    public Cat getCat(Integer catNumber) {
        return cats.get(catNumber);
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
    public void deleteCat(Integer catNum) {
        cats.remove(catNum);
    }
}
