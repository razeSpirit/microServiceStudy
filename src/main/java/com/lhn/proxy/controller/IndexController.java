package com.lhn.proxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiHaiNan on 上午 11:12 2018/6/13 0013
 */
@RestController
public class IndexController {
    @GetMapping
    public String index() {
        return "Hello,World!";
    }
}
