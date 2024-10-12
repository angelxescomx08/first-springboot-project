package com.angel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class UserRestController {
  @GetMapping("/details")
  public Map<String,Object> getMethodName() {
    Map<String,Object> reponse = new HashMap<String,Object>();

    reponse.put("title", "Mi título");
    reponse.put("name", "Ángel");
    reponse.put("lastname", "Hernández");

    return reponse;
  }
  
}
