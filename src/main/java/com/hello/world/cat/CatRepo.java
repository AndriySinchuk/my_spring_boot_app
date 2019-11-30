package com.hello.world.cat;

import com.google.common.collect.ImmutableList;
import com.hello.world.error_handling.ThereIsNoSuchCatException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CatRepo implements CatInterface {

    private static final Logger log = LogManager.getLogger(CatInterface.class);

    private Map<Integer, Cat> cats = new HashMap<Integer, Cat>();

    @Override
    public ImmutableList<Cat> allCats() {
        return ImmutableList.copyOf(cats.values());
    }

    @Override
    public Cat getCatId(int catId) {
        log.error("Cat with id: " + catId + " not found");
        Cat cat = cats.get(catId);
        if (cat == null) {
            throw new ThereIsNoSuchCatException() ;
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
