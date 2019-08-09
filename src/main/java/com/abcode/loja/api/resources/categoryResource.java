package com.abcode.loja.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class categoryResource {

    @GetMapping
    public String listar(){
         return "Rest ta funcionando";
    }
}