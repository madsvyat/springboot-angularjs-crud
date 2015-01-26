package com.madsvyat.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Infiltrator on 26.01.2015.
 */
@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index() {
        return "redirect:static/index.html";
    }
}
