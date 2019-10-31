package com.hello.world.controllers;

import com.hello.world.cat.Cat;
import com.hello.world.cat.CatInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cat")
public class CatController {

    @Autowired
    @Qualifier("CatRepo")
    private CatInterface catInterface;

    @RequestMapping(value = "/all_cats", method = RequestMethod.GET)
    public List<Cat> allCAts() {
        return catInterface.allCats();
    }

    @RequestMapping(value = "/create_cat", method = RequestMethod.POST)
    @ResponseBody
    public Cat createCat(@RequestBody Cat cat) {
        return catInterface.addCat(cat);
    }

    @RequestMapping(value = "/{cat_number}", method = RequestMethod.GET)
    @ResponseBody
    public Cat readCat(@PathVariable("cat_number") Integer catNumber) {
        return catInterface.getCat(catNumber);
    }

    @RequestMapping(value = "/update_cat", method = RequestMethod.PUT)
    @ResponseBody
    public Cat updateCat(@RequestBody Cat cat) {
        return catInterface.updateCat(cat);
    }

    @RequestMapping(value = "/{cat_number}",
            method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCat(@PathVariable("cat_number") Integer catNumber) {
        catInterface.deleteCat(catNumber);
    }

}
