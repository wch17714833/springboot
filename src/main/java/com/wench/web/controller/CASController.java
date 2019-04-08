package com.wench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cas")
public class CASController {
    @RequestMapping("/layout")
    public ModelAndView layout() {
        System.out.println("跳转路径-layout.ftl");
        ModelAndView modelAndView = new ModelAndView("/layout");
        modelAndView.addObject("welcome","123");
        return modelAndView;
    }
    @RequestMapping("/hello")
    public ModelAndView hello() {
        System.out.println("跳转路径-login.ftl");
        ModelAndView modelAndView = new ModelAndView("/home/login");
        modelAndView.addObject("welcome","123");
        return modelAndView;
    }
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "clien B");
        return "index";
    }
}
