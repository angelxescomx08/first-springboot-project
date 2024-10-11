package com.angel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "Mi título");
    model.addAttribute("name", "Ángel");
    model.addAttribute("lastname", "Hernández");
    return "details";
  }
  

}
