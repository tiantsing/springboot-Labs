package com.springboot.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tianq
 */
@Controller
public class PageController {

    @RequestMapping("/page")
    public String showPage(){
        return "index.html";
    }
}
