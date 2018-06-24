package com.example.controller;

import com.example.applicationservice.CoffeeBeanService;
import com.example.domain.coffeebean.CoffeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * インデックスページのコントローラークラス。
 */
@RestController
public class IndexController {

    private final CoffeeBeanService coffeeBeanService;

    @Autowired
    public IndexController(CoffeeBeanService coffeeBeanService) {
        this.coffeeBeanService = coffeeBeanService;
    }

    /**
     * インデックスページの表示
     */
    @GetMapping(path = "/")
    public List<CoffeeBeanDto> index() {
        return coffeeBeanService.getAllCoffeeBean().stream()
                .map((b) -> new CoffeeBeanDto(
                        b.id().readable(),
                        b.name().fullName()))
                .collect(Collectors.toList());
    }

}
