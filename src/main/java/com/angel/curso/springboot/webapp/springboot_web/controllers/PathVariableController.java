package com.angel.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

  @Value("${config.secret}")
  private String secret;

  @Value("${config.api.url}")
  private String apiUrl;

  @Autowired
  private Environment env;

  @GetMapping("/mix/{product}/{id}")
  public Map<String,Object> getParams(
    @PathVariable String product,
    @PathVariable Integer id
  ){
    Map<String,Object> response = new HashMap<>();
    response.put("product", product);
    response.put("id", id);
    return response;
  }

  @PostMapping("/create")
  public User createUser(@RequestBody User user){
    return user;
  }

  @GetMapping("/secrets")
  public Map<String,Object> getSecrets(){
    Map<String,Object> response = new HashMap<>();
    response.put("secret", secret);
    response.put("api_url", apiUrl);
    response.put("secret", env.getProperty("config.secret"));
    return response;
  }
}
