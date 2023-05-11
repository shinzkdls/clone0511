package com.kbstar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Value("${adminserver}")
    String serviceserver;

    @RequestMapping("/")
    public String main(Model model) throws Exception {
        model.addAttribute("center", "center");
        return "index";
    }

    @RequestMapping("/cart")
    public String about(Model model) throws Exception {
        model.addAttribute("center", "cart");
        return "index";
    }

    @RequestMapping("/all")
    public String all(Model model) throws Exception {
        model.addAttribute("center", "all");
        return "index";
    }
}
