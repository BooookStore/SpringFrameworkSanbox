package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("formDemo")
public class FormDemoController {

    @ModelAttribute
    public AccountCreateForm form() {
        return new AccountCreateForm();
    }

    @RequestMapping(path = "createAccount", method = RequestMethod.GET)
    public String createAccountInput() {
        return "formdemo/create";
    }

    @RequestMapping(path = "createAccount", method = RequestMethod.POST)
    public String createAccountConfirm(@Validated AccountCreateForm account, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formdemo/create";
        }
        model.addAttribute("account", account);
        return "formdemo/confirm";
    }

}
