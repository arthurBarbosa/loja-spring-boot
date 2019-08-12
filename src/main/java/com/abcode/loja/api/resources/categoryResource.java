package com.abcode.loja.api.resources;

import com.abcode.loja.api.domain.Category;
import com.abcode.loja.api.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class categoryResource {


    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        Category obj = categoryService.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
