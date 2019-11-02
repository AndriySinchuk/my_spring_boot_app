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

    @RequestMapping(value = "/all_id", method = RequestMethod.GET)
    public List<Cat> allCAts() {
        return catInterface.allCats();
    }

    @RequestMapping(value = "/create_cat", method = RequestMethod.POST)
    public Cat createCat(@RequestBody Cat cat) {
        return catInterface.addCat(cat);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cat readCat(@PathVariable("id") Integer catNumber) {
        return catInterface.getCatId(catNumber);
    }

    @RequestMapping(value = "/update_cat", method = RequestMethod.PUT)
    public Cat updateCat(@RequestBody Cat cat) {
        return catInterface.updateCat(cat);
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE)
    public void deleteCat(@PathVariable("id") Integer catNumber) {
        catInterface.deleteCatById(catNumber);
    }

}
