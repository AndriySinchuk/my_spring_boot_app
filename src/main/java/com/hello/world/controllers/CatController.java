package com.hello.world.controllers;

import com.hello.world.cat.Cat;
import com.hello.world.cat.CatStub;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {
    @RequestMapping(value = "/cats", method = RequestMethod.GET)
    public List<Cat> listAllCats() {
        return CatStub.allCats();
    }

    @RequestMapping(value = "/cats/add", method = RequestMethod.GET)
    public void addCat(@RequestParam(value = "catNumber") String catNumber,
                       @RequestParam(value = "catName") String catName,
                       @RequestParam(value = "catColor") String catColor,
                       @RequestParam(value = "catAge") String catAge) {

        CatStub.addCat(catNumber, catName, catColor, catAge);
    }

}
