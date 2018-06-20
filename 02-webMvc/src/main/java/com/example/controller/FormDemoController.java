package com.example.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("formDemo")
public class FormDemoController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // 未入力の場合はNullにして、入力されていれば何もしない。
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @ModelAttribute
    public accountCreateForm form() {
        return new accountCreateForm();
    }

    @RequestMapping(path = "createAccount", method = RequestMethod.GET)
    public String createAccountInput() {
        return "formdemo/create";
    }

    @RequestMapping(path = "createAccount", method = RequestMethod.POST)
    public String createAccountConfirm(@Validated accountCreateForm account, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formdemo/create";
        }
        model.addAttribute("account", account);
        return "formdemo/confirm";
    }

}
