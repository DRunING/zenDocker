package com.zenDocker.init.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Druning on 2017/10/23.
 */
@RestController
public class MainController {
    @RequestMapping("/main")
    public String index(){
        return "index";
    }
}
