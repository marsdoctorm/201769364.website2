package com.comp208.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by comp208 on 2024.3.1.
 */
@Controller
public class ErrorController {

    @RequestMapping(value = "/error2")
    public String error() {
        return "error";
    }

}
