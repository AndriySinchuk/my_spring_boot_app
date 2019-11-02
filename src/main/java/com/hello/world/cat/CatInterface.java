package com.hello.world.cat;

import java.util.List;

public interface CatInterface {

    List<Cat> allCats();

    Cat getCatId(Integer id);

    Cat addCat(Cat cat);

    Cat updateCat(Cat cat);

    void deleteCatById(Integer id);

}
