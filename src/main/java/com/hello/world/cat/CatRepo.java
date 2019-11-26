package com.hello.world.cat;

import com.google.common.collect.ImmutableList;
import com.hello.world.error_handling.ThereIsNoSuchCatException;
import io.micrometer.core.instrument.util.JsonUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CatRepo implements CatInterface {

    private Map<Integer, Cat> cats = new HashMap<Integer, Cat>();

    @Override
    public ImmutableList<Cat> allCats() {
        return ImmutableList.copyOf(cats.values());
    }

    @Override
    public Cat getCatId(int id) {
        Cat cat = cats.get(id);
        if (cat == null) {
            throw new ThereIsNoSuchCatException();
        }
        return cat;
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
    public void deleteCatById(int id) {
        cats.remove(id);
    }

    @Override
    public List<Cat> filterCatByName(String param) {
        List<Cat> catsVal = cats
                .values()
                .stream()
                .filter(x -> x.getCatName().contains(param))
                .collect(Collectors.toList());
        return ImmutableList.copyOf(catsVal);
    }
}
