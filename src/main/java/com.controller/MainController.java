package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.ref.ReferenceQueue;
import java.util.Objects;

@Controller
@RequestMapping(value = "/main")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String welcome(){
        return "test Web";
    }

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    @ResponseBody
    public String welcomess(){
        ReferenceQueue refq = new ReferenceQueue();
        return "test Web22";

    }
}