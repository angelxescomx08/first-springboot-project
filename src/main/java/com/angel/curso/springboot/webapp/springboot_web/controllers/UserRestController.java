package com.angel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.webapp.springboot_web.models.User;

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
    User user = new User("Ángel", "Hernández");

    reponse.put("title", "Mi título");
    reponse.put("user", user);

    return reponse;
  }
  
}
