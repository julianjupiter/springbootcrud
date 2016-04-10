package io.github.julianjupiter.springbootcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = { "", "/", "/home" })
    public String index(Model model) {
        model.addAttribute("activePage", "home");
        return "index";
    }
}
