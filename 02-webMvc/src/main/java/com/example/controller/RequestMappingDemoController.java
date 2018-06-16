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

    /**
     * パスによるマッピング。
     * <p>
     * パス変数を使用し、パスの一部を変数として取得する。
     *
     * @param userId リクエストマッピングされる値
     */
    @RequestMapping("{userId}")
    public String userPage(@PathVariable String userId, Model model) {
        return "requestmapping/userpage";
    }

    /**
     * リクエストパラメータによるマッピング。
     * <p>
     * リクエストパラメータが付与されたURLにたいしてマッピングする。
     * リクエスtパラメータの値は変数として取得する。
     *
     * @param userId リクエストパラメータの値
     */
    @RequestMapping(path = "param", params = "userId")
    public String paramDemoPage(@RequestParam String userId, Model model) {
        // リクエストパラメータはこのようにしないとモデルに入らない。
        model.addAttribute("userId", userId);
        return "requestmapping/demo";
    }

}
