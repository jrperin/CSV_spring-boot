package com.jrperin.csv.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
public class ViewController {

    @GetMapping("/")
    fun home(): String {
        return "home"
    }
}