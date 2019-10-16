package com.hello.world.cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatStub {
    private static Map<String, Cat> cats = new HashMap<String, Cat>();

    static {
        Cat a = new Cat("Timosha", "Red", "3");
        cats.put("first_cat", a);
        Cat b = new Cat("Felix", "Black", "4");
        cats.put("second_cat", b);
    }

    public static List<Cat> allCats() {
        return new ArrayList<Cat>(cats.values());
    }

}
