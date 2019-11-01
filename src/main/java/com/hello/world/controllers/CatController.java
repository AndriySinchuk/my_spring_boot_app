package com.hello.world.controllers;

import com.hello.world.cat.Cat;
import com.hello.world.cat.CatInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cat")
public class CatController {

    private CatInterface catInterface;

    @RequestMapping(value = "/all_cats", method = RequestMethod.GET)
    public List<Cat> allCAts() {
        return catInterface.allCats();
    }

    @RequestMapping(value = "/create_cat", method = RequestMethod.POST)
    public Cat createCat(@RequestBody Cat cat) {
        return catInterface.addCat(cat);
    }

    @RequestMapping(value = "/{cat_number}", method = RequestMethod.GET)
    public Cat readCat(@PathVariable("cat_number") Integer catNumber) {
        return catInterface.getCat(catNumber);
    }

    @RequestMapping(value = "/update_cat", method = RequestMethod.PUT)
    public Cat updateCat(@RequestBody Cat cat) {
        return catInterface.updateCat(cat);
    }

    @RequestMapping(value = "/{cat_number}",
            method = RequestMethod.DELETE)
    public void deleteCat(@PathVariable("cat_number") Integer catNumber) {
        catInterface.deleteCat(catNumber);
    }

}
