package com.example.ilinkcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModalController {


    @GetMapping("/modal")
    public String modal(){

        return "modal";
    }
}
