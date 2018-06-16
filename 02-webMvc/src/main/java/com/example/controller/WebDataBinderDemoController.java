package com.example.controller;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("webdatabinder")
public class WebDataBinderDemoController {

    /**
     * リクエストデータを特定の型に変換する処理を設定します。
     * <p>
     * リクエストデータのバインディングが行われる前に呼び出されます。
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new DateFormatter("yyyyMMdd"));
    }

    /**
     * リクエストデータを日付のデータ型に変換し、取得します。
     */
    @RequestMapping(path = "data", params = "echo")
    public String echoData(@RequestParam Date echo, Model model) {
        model.addAttribute("data", echo);
        return "webdatabinder/echoData";
    }

}
