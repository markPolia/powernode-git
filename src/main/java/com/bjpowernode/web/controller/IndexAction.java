package com.bjpowernode.web.controller;

import com.bjpowernode.web.service.IndexService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/work")
public class IndexAction {
    @Resource(type = IndexService.class)
    IndexService service;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public void indexAction() {
        System.out.println("访问index");
    }

    @RequestMapping(value = "/indexJsp", method = RequestMethod.GET)
    @SuppressWarnings("all")
    public String indexJsp() {
        return "redirect:/index.jsp";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public void hi() {
        service.doSome();
    }
}
