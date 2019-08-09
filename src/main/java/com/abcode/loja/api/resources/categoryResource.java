package com.abcode.loja.api.resources;

import com.abcode.loja.api.domain.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class categoryResource {

    @GetMapping
    public List<Category> listar(){
        Category cat = new Category(1L, "Informática");
        Category cat1 = new Category(2L,"Escritório");

        List<Category> lista = new ArrayList<>();

        lista.add(cat);
        lista.add(cat1);

         return lista;
    }
}
