package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("echo")
public class EchoController {

    @RequestMapping(method = RequestMethod.GET)
    public String viewInput(Model model) {
        model.addAttribute(new EchoForm());
        return "echo/input";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String echoInput(EchoForm form) {
        return "echo/output";
    }

}
