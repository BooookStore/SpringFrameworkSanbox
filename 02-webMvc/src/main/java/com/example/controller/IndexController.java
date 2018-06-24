package com.example.controller;

import com.example.applicationservice.CoffeeBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

/**
 * インデックスページのコントローラークラス。
 */
@Controller
public class IndexController {

    private final CoffeeBeanService coffeeBeanService;

    @Autowired
    public IndexController(CoffeeBeanService coffeeBeanService) {
        this.coffeeBeanService = coffeeBeanService;
    }

    /**
     * インデックスページの表示
     */
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<CoffeeBeanDto> coffeeBeanDtos = coffeeBeanService.getAllCoffeeBean().stream()
                .map((b) -> new CoffeeBeanDto(
                        b.id().readable(),
                        b.name().fullName()))
                .collect(Collectors.toList());

        model.addAttribute("coffeeBeans", coffeeBeanDtos);
        return "index";
    }

}
