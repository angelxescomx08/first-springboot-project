package com.angel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

  @GetMapping("/details")
  public String details(@RequestParam String param) {
    System.out.println("Param value: " + param);
    return "details";
  }
  

}