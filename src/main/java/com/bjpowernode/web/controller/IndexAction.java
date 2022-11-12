package com.bjpowernode.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/work")
public class IndexAction {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public void indexAction() {
        System.out.println("访问index");
    }

    @RequestMapping(value = "/indexJsp", method = RequestMethod.GET)
    public String indexJsp() {
        return "redirect:/index.jsp";
    }
}
