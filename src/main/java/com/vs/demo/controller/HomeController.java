package com.vs.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HomeController {
    @GetMapping
    public String sayHello(Locale locale, Model model) {
        return "Hello! from spring demo.";
    }
}
