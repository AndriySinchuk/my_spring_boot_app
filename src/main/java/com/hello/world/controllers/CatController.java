package com.hello.world.controllers;

import com.hello.world.cat.Cat;
import com.hello.world.cat.CatStub;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {
    @RequestMapping(value = "/cats", method = RequestMethod.GET)
    public List<Cat> listAllCats() {
        return CatStub.allCats();
    }
}
