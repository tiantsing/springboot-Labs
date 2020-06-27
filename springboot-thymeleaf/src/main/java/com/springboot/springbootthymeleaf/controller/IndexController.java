package com.springboot.springbootthymeleaf.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tianq
 */
@Controller
public class IndexController {

    private static final Logger _logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 主页
     *
     * @param model
     * @return
     */
    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("msg", "welcome you!");
        return "index";
    }

}
