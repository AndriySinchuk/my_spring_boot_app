package com.hello.world.controllers;

import com.hello.world.cat.Cat;
import com.hello.world.cat.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    CatRepo catRepo;

    @RequestMapping(value = "/cat/all_cats", method = RequestMethod.GET)
    public List<Cat> allCAts() {
        return catRepo.allCats();
    }

    @RequestMapping(value = "/cat",
            method = RequestMethod.POST)
    @ResponseBody
    public Cat createCat(@RequestBody Cat cat) {
        return catRepo.addCat(cat);
    }

    @RequestMapping(value = "/cat/{cat_number}",
            method = RequestMethod.GET)
    @ResponseBody
    public Cat readCat(@PathVariable("cat_number") Integer catNumber) {
        return catRepo.getCat(catNumber);
    }

    @RequestMapping(value = "/cat",
            method = RequestMethod.PUT)
    @ResponseBody
    public Cat updateCat(@RequestBody Cat cat) {
        return catRepo.updateCat(cat);
    }

    @RequestMapping(value = "/cat/{cat_number}",
            method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCat(@PathVariable("cat_number") Integer catNumber) {
        catRepo.deleteCat(catNumber);
    }

}
