package com.angel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.webapp.springboot_web.models.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class ParamsController {

    @GetMapping("")
    public ParamDto getMethodName(
        @RequestParam(defaultValue = "No hay parámetros", required = false) String message
    ) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

}
