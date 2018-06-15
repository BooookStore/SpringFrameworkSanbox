package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("requestmapping")
public class RequestMappingDemoController {

    @RequestMapping
    public String home() {
        return "requestmapping/index";
    }

    @RequestMapping("{userId}")
    public String userPage(@PathVariable String userId, Model model) {
        return "requestmapping/userpage";
    }

    @RequestMapping(path = "param", params = "userId")
    public String paramDemoPage(@RequestParam String userId, Model model) {
        model.addAttribute("userId", userId);
        return "requestmapping/demo";
    }

}
