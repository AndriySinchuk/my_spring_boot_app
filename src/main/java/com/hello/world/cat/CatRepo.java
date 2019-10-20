package com.hello.world.cat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CatRepo {
    private static Map<Integer, Cat> cats = new HashMap<Integer, Cat>();

    public static List<Cat> allCats() {
        return new ArrayList<Cat>(cats.values());
    }

    public static Cat getCat(Integer catNumber) {
        return cats.get(catNumber);
    }

    public static Cat addCat(Cat cat) {
        cats.put(cat.getCatNumber(), cat);
        return cat;
    }

    public static Cat updateCat(Cat cat) {
        cats.put(cat.getCatNumber(), cat);
        return cat;
    }

    public static void deleteCat(Integer catNum) {
        cats.remove(catNum);
    }
}
